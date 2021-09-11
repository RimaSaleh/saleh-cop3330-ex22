/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Rima Saleh
 */

package org.example;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        Scanner scanner = new Scanner(System.in);

        //asking to input the numbers
        System.out.println("Enter the first number: ");
        int first = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int second = scanner.nextInt();

        System.out.println("Enter the third number: ");
        int third = scanner.nextInt();

        //if statements to see which number is the greatest (and checking if any are equal)
        if(first == second || first == third || third == second) {
            System.out.format("Number is equal, cannot find who is greater");
        }
        if(first > second && first > third) {
            System.out.format("The largest number is %d", first);
        }
        if(second > first && second > third) {
            System.out.format("The largest number is %d", second);
        }
        if(third > second && third > first) {
            System.out.format("The largest number is %d", third);
        }

    }
}
