/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hollow;
import java.util.*;
/**
 *
 * @author AYMEN MANSOOR
 */
public class Hollow {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter rows: ");
        int rows = scanner.nextInt();
        
        System.out.print("Enter columns: ");
        int columns = scanner.nextInt();
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                if (i == 1 || j == 1 || i == rows || j == columns) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
