package com.mycompany.aymen;
import java.util.*;
public class Aymen {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number for its table: ");
        int t=sc.nextInt();
        sc.nextLine();
        for(int i=1;i<11;i++){
           int result = t*i;
            System.out.println(t + " * " + i + " = " + result );
        }
     }
}

