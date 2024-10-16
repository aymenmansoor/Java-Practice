package com.mycompany.mavenproject1;
import java.util.Scanner;
public class Mavenproject1 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;

        do {
            System.out.print("Enter your workout duration (enter a negative number to exit): ");
            input = scanner.nextInt();

            if (input >= 0) {
                int primeCalories = calculatePrimeCalories(input);
                int oddCalories = calculateOddCalories(input);
                int evenCalories = calculateEvenCalories(input);
                
                System.out.println("Calories burned from prime numbers: " + primeCalories);
                System.out.println("Calories burned from odd numbers: " + oddCalories);
                System.out.println("Calories burned from even numbers: " + evenCalories);
            }

        } while (input >= 0);

        System.out.println("Session ended. Thank you!");
        scanner.close();
    }

    // Method to calculate sum of calories burned for prime numbers less than input
    public static int calculatePrimeCalories(int input) {
        int sum = 0;
        for (int i = 2; i < input; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    // Method to calculate sum of calories burned for odd numbers less than input
    public static int calculateOddCalories(int input) {
        int sum = 0;
        for (int i = 1; i < input; i += 2) {
            sum += i;
        }
        return sum;
    }

    // Method to calculate sum of calories burned for even numbers less than input
    public static int calculateEvenCalories(int input) {
        int sum = 0;
        for (int i = 2; i < input; i += 2) {
            sum += i;
        }
        return sum;
    }

    // Helper method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}