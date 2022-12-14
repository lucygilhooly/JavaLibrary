package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static int loanedBooks = 0;

    public static ArrayList<User> accounts = new ArrayList<>();

    public static void createAccount(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("would you like to create an account? 1 - yes 2 - no");
        int newInput = scanner.nextInt();
        if(newInput == 1){
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            scanner.nextLine();
            System.out.println("Enter your favourite genre: ");
            String favGenre = scanner.nextLine();
            System.out.println("& finally, your desired username: ");
            String username = scanner.nextLine();
            User user = new User(name, favGenre, username);
            accounts.add(user);
            System.out.println("Well Done" + name + " you have registered with Lucy's Virtual Library ! Your username is " + username);
        }

    }
    public static void accountChecker(){
    Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Lucy's Virtual Library !");
        System.out.println("Do you have an existing account? 1 - yes 2 - no");
    int input = scanner.nextInt();
        if (input == 1){
        System.out.println("please enter your username:");
        String username = scanner.nextLine();
        scanner.nextLine();
        if (accounts.contains(username)){
            System.out.println("Welcome back " + username);
            System.out.println("you have " + loanedBooks +" amount of books currently on loan");
        } else{
            System.out.println("Oops ! Looks like you don't have an account with us yet !");
            createAccount();
        }
    }
    }

    public static void main(String[] args) {
        accountChecker();
    }
}