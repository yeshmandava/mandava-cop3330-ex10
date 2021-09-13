package org.example;
import java.util.Scanner;

/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Yeshwanth Mandava
 */
public class App 
{
    public static void main( String[] args )
    {
        final double taxRate = 0.055;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price of the item 1: ");
        double Item1P = input.nextDouble();
        System.out.print("Enter the quantity of item 1: ");
        int Item1Q = input.nextInt();

        System.out.print("Enter the price of the item 2: ");
        double Item2P = input.nextDouble();
        System.out.print("Enter the quantity of item 2: ");
        int Item2Q = input.nextInt();

        System.out.print("Enter the price of the item 3: ");
        double Item3P = input.nextDouble();
        System.out.print("Enter the quantity of item 3: ");
        int Item3Q = input.nextInt();

        double totalCost = ((Item1P*Item1Q) + (Item2P*Item2Q) + (Item3P*Item3Q));
        double Tax = (totalCost * taxRate);
        double finalCost = (totalCost + Tax);

        System.out.print("Subtotal: $" +totalCost);
        System.out.print("\nTax: $" +Tax);
        System.out.print("\nTotal: $" +finalCost);


    }
}
