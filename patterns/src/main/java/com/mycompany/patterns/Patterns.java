package com.mycompany.patterns;
import java.util.*;
/**
 *
 * @author AYMEN MANSOOR
 */
public class Patterns {

    public static void main(String[] args) {
        Scanner pat=new Scanner(System.in);
        System.out.print("Enter rows: ");
        int row=pat.nextInt();
        System.out.print("Enter columns: ");
        int col=pat.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                System.out.print("*");
                
            }
            System.out.println(" ");
        }
        
    }
}
