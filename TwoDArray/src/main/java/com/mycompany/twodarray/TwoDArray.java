package com.mycompany.twodarray;
import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        
        int[][] num = new int[rows][cols];
        
        // Input values into the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                num[i][j] = sc.nextInt();
            }
        }
        
        // Output the array in grid format
        System.out.println("The 2D array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(num[i][j] + "\t"); // Use tab for better spacing
            }
            System.out.println();
        }
        
        // Close the scanner
        sc.close();
    }
}
 