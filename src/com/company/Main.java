package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        String testCase;
        String respond;
        String echoRespond = "";

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
        String echoRespond;
        String testCase = "This is me and I";
        String testCase1 = "This is me and I and my is your, if I think me is";
        String testCase2 = "I am who I am and if my ego is dead";
        String testCase3 = "I am you";
        String testCase4 = "I am you and my is me";
        String testCase5 = "Hola my friend is I and You think my is I, and then bye";
        echoRespond = Echo(testCase);
        System.out.println(echoRespond);
        echoRespond = Echo(testCase1);
        System.out.println(echoRespond);
        echoRespond = Echo(testCase2);
        System.out.println(echoRespond);
        echoRespond = Echo(testCase3);
        System.out.println(echoRespond);
        echoRespond = Echo(testCase4);
        System.out.println(echoRespond);
        echoRespond = Echo(testCase5);
        System.out.println(echoRespond);
        StringBuilder welcomePrompt = new StringBuilder("Good day. What is your problem?\n");
        System.out.println(welcomePrompt);
    }

    private static String Echo(String respond) {

        String result = "";
        String result1 = "";
        String result2 = "";

        respond.toLowerCase();
        if (respond.contains("I") || respond.contains("i")) {
            result = respond.replaceAll("I", "you");
            if (result.contains("am") || result.contains("Am")) {
                result1 = result.replaceAll("am", "are");
                if (result1.contains("my") || result1.contains("My")) {
                    result2 = result1.replaceAll("my", "your");
                    if (result2.contains("me") || result2.contains("Me")) {
                        return result2.replaceAll("me", "you").toUpperCase();
                    }
                    if (!result2.contains("me") || !result2.contains("Me")) {
                        return result2.toUpperCase();
                    }
                }
                if (!result1.contains("my") || !result1.contains("My") ||
                        !result2.contains("me") || !result2.contains("Me")) {
                    return result1.toUpperCase();
                }
            }
        }
        if (respond.contains("my") || respond.contains("My")) {
            result1 = result.replaceAll("my", "your");
            if (result1.contains("me") || result1.contains("Me")) {
                return result1.replaceAll("me", "you").toUpperCase();
            }
            if (!result1.contains("me") || !result1.contains("Me")) {
                return result1.toUpperCase();
            }
        }
        if (respond.contains("me") || respond.contains("Me")) {
            result1 = result.replaceAll("me", "you");
            if (result1.contains("my") || result1.contains("My")) {
                return result1.replaceAll("my", "your").toUpperCase();
            }
            if (!result1.contains("my") || !result1.contains("My")) {
                return result1.toUpperCase();
            }
        }
        return result.toUpperCase();
    }
}
//    if (respond.contains("I") || respond.contains("i")) {
//            result = respond.replaceAll("I", "you");
//            if (respond.contains("me") || respond.contains("Me")) {
//            result1 = result.replaceAll("me", "you");
//            }
//            if (respond.contains("my") || respond.contains("My")) {
//            result2 = result.replaceAll("my", "your");
//
//            }
//            if (respond.contains("am") || respond.contains("Am")) {
//            result3 = result.replaceAll("am", "are");
//            }
//            }
//  if (respond.contains("I") || respond.contains("i")) {
//          respond.replaceAll("I", "you");
//          }
//          if (respond.contains("me") || respond.contains("Me")) {
//          respond.replaceAll("me", "you");
//          }
//          if (respond.contains("my") || respond.contains("My")) {
//          respond.replaceAll("my", "your");
//          }
//          if (respond.contains("am") || respond.contains("Am")) {
//          respond.replaceAll("am", "are");
//          }
//          if (result.contains("I") || result.contains("i")){
//          finalResult = result.replaceAll("I","you");
//          }
//          if (result.contains("me") || result.contains("Me")){
//          finalResult = result.replaceAll("me","you");
//          }
//          if (result.contains("my") || result.contains("My")){
//          finalResult = result.replaceAll("my","your");
//          }
//          if (result.contains("am") || result.contains("Am")){
//          finalResult = result.replaceAll("am","are");
//          }


