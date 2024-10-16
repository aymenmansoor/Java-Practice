/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hypotenuse;
import java.util.*;
/**
 *
 * @author AYMEN MANSOOR
 */
public class Hypotenuse {

    public static void main(String[] args) {
//        double z;
        Scanner news=new Scanner(System.in);
        System.out.print("enter a base: ");
        double x=news.nextDouble();
        System.out.print("enter a perpendicular: ");
        double y=news.nextDouble();
//        hypotenuse=sqrt(base*2+perpendicular*2)
        double z= Math.sqrt((x*x)+(y*y));
        System.out.println("the hypotenuseb is: " + z );
    }
}
