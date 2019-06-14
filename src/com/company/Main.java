package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String respond;
        String echoRespond;
        HelloToUser();
        do {
            System.out.println("Enter respond here or press Q to quit:");
            respond = new Scanner(System.in).nextLine();
            echoRespond = Echo(respond);
            if (!echoRespond.equalsIgnoreCase("q")) {
                System.out.println(echoRespond);
            }
        } while (!respond.equalsIgnoreCase("q"));
    }

    private static void HelloToUser() {
        StringBuilder welcomePrompt = new StringBuilder("Good day. What is your problem?\n");
        System.out.println(welcomePrompt);
    }

    private static String Echo(String respond) {
        if (respond.contains("I") || respond.contains("i")) {
            return respond.replace("I", "you");
        }
        if (respond.contains("me") || respond.contains("Me")) {
            return respond.replace("me", "you");
        }
        if (respond.contains("my") || respond.contains("My")) {
            return respond.replace("my", "your");
        }
        if (respond.contains("am") || respond.contains("Am")) {
            return respond.replace("am", "are");
        }
        return respond;
    }
}
