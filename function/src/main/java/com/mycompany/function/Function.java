/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.function;
import java.util.*;
/**
 *
 * @author AYMEN MANSOOR
 */
public class Function {
    public static int calculateSum(int a,int b){
        int sum=a+b;
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value for a: ");
        int a=sc.nextInt();
        System.out.print("Enter value for b: ");
        int b=sc.nextInt();
        int sum=calculateSum(a,b);
        System.out.println("Sum of "+ a + " & " + b + " is: " + sum);
    }
}
