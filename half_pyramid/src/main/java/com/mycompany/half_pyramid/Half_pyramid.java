/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.half_pyramid;
import java.util.*;
/**
 *
 * @author AYMEN MANSOOR
 */
public class Half_pyramid {

    public static void main(String[] args) {
        Scanner half=new Scanner(System.in);
        System.out.println("enter row: ");
        int row=half.nextInt();
//        System.out.println("enter column: ");
//        int col=half.nextInt();
        for (int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
