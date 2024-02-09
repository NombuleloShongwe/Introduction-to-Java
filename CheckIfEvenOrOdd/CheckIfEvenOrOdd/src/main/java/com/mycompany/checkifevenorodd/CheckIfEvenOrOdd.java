/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.checkifevenorodd;

/**
 *
 * @author Dell-User
 */

import java.util.Scanner;

public class CheckIfEvenOrOdd {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your favourite number: ");
        int number = scanner.nextInt();

        if (isEven(number)) {
            System.out.println("Your favourite number :"+ number + " is an even number.");
        } else {
            System.out.println("Your favourite number :" + number + " is an odd number.");
        }

        scanner.close();
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;  
    }
}
