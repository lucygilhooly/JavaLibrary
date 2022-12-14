package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int loanedBooks = 0;

        ArrayList<User> accounts = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Lucy's Virtual Library !");
        System.out.println("Do you have an existing account?");
        String input = scanner.nextLine();
        if (input == "yes"){
            System.out.println("please enter your username:");
            String username = scanner.nextLine();
            if (accounts.contains(username)){
                System.out.println("Welcome back " + username);
                System.out.println("you have " + loanedBooks +" amount of books currently on loan");
            }
        } else {
            System.out.println("would you like to create an account?");

        }


    }
}