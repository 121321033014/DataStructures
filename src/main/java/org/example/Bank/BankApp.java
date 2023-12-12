package org.example.Bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        List<BankAccount> account = new ArrayList<BankAccount>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("choose an option....");
            System.out.println("1. -create account");
            System.out.println("2. -view the account");
            System.out.println("3. -exit");
            int choice = scanner.nextInt();
            if(choice==1) {
                System.out.println("Enter your Account number....");
                String accountName = scanner.next();
                System.out.println("Enter initial balance:$");
                double initialbalance = scanner.nextDouble();
                BankAccount account1 = new BankAccount(accountName, initialbalance);
                account.add(account1);
                System.out.println("Account is created");
            }else if(choice==2) {
                System.out.println("Enter your Account number to view your accounts details....");
                String accountNumber = scanner.next();
                for (BankAccount balance : account) {
                    System.out.println(balance.toString());
                    break;
                }
            }else if(choice==3) {
                System.out.println("Exist the application");
                break;
            }else{
System.out.println("Inavlid option try Again");
            }
            }
System.out.println(account);
            }
            }

