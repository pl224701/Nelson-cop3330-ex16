/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jack Nelson
 */

package org.example;
import java.util.Scanner;
public class App
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your age? ");
        String str = sc.nextLine();
        int n1 = Integer.parseInt(str);
        String a = (n1>=16) ? "You are old enough to legally drive" : "You are not old enough to legally drive";
        System.out.print(a);
    }
}
