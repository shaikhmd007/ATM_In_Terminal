package com.company;

import java.util.Scanner;

public class ATM {
    static int actBalance, mOtp,atmPin,count;

    public static void main(String[] args) {
        long accNum[]= {342391457,34239158,342391459,342391460,342391461};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your A/C Number (9 Digits): ");
        long acc = sc.nextLong();
        count=0;
       if (acc==accNum[0]){
           atmPin=1234;
           actBalance=1000;
           accPin();
       }else if (acc==accNum[1]){
           atmPin=6741;
           actBalance=2000;
           accPin();
       }else if (acc==accNum[2]){
           atmPin=7710;
           actBalance=5000;
           accPin();
       }else if (acc==accNum[3]){
           atmPin=7867;
           actBalance=1500;
           accPin();
       }else if (acc==accNum[4]){
           atmPin=1998;
           actBalance=100;
           accPin();
       }else {
           System.out.println("Invalid Account number entered");
           System.out.println("Thank you for using ATM");
       }


    }

    private static void accPin() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your ATM Pin: ");
        int pin = sc.nextInt();
        if (pin==atmPin)
        accService();
        else if (count==0){
            count+=2;
            System.out.println("Wrong pin entered\nTry Again...");
            accPin();
            }
        else
            System.out.println("Thank you for using ATM..!");

    }


    private static void accService() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Select Services Below: " + '\n'
                + "1-> Withdrawals ." + '\n' + "2-> Balance Enquiry " + '\n'
                + "3-> Set Green Pin." + '\n' + "4-> Mini Statement");
        int choose = sc.nextInt();
        switch (choose) {
            case 1:
                withdraw();
                break;
            case 2:
                System.out.println("Your account balance is : " + actBalance);
                break;
            case 3:
                genPin();
                break;
            case 4:
                System.out.println("Mini Statement");
                mStatement();
                break;
            default:
                System.out.println("Thank for using Chicha bank Atm And CJB!!");
        }
    }


    public static void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount:");
        int amt = sc.nextInt();
        if (amt < actBalance) {
            System.out.println("Your transaction is being processed\nPlease wait...");
        } else {
            System.out.println("Insufficient balance");
        }

        System.out.println("0-> Exit \nOr \n 1-> Continue");
        int ex = sc.nextInt();
        switch (ex) {
            case 1:
                System.out.println("1-> Continue...");
                break;
            case 0:
                System.out.println("0-> Exit .");

        }
    }
    public static void genPin() {
        System.out.println("Your OTP has been sent to your \n registered mobile no.");
        Scanner sc = new Scanner(System.in);
        int otp = sc.nextInt();
        if (otp == mOtp) {
            setPin();
        } else {
            System.out.println("Invalid OTP");
        }
    }

    private static void setPin() {
        System.out.println("Set 4 digit pin");
        Scanner sc = new Scanner(System.in);
        int newPin = sc.nextInt();
        System.out.println("Confirm pin");
        int conPin = sc.nextInt();
        if (conPin == newPin) {
            mOtp = newPin;
            System.out.println("Pin set successfully..!!");
        } else {
            System.out.println("Please enter same pin!!");
        }
    }

    public static void mStatement() {
        System.out.println("Last 10 Transaction Statement Has been sent to Your registered e-mail.!!:");
        Scanner sc=new Scanner(System.in);
        System.out.println("0-> Exit \nOr \n 1-> Continue");
        int ex = sc.nextInt();
        switch (ex) {
            case 1:
                System.out.println("1-> Continue...");
                break;
            case 0:
                System.out.println("0-> Exit .");

        }
}}

