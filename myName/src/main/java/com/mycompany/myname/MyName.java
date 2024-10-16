/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.myname;
import java.util.*;
/**
 *
 * @author AYMEN MANSOOR
 */
public class MyName {
    public static void name(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name=sc.next();
        name(name);
    }
}
