/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.random_no;
import java.util.Random;
/**
 *
 * @author AYMEN MANSOOR
 */
public class Random_no {

    public static void main(String[] args) {
        Random but=new Random();
        int x=but.nextInt(6)+1;
        double y=but.nextDouble(6)+1;
        boolean a=but.nextBoolean();
        System.out.println(x);
        System.out.println(a);
        System.out.println(y);
    }
}
