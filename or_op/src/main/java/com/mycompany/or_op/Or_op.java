/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.or_op;
import java.util.*;
/**
 *
 * @author AYMEN MANSOOR
 */
public class Or_op {

    public static void main(String[] args) {
        Scanner news=new Scanner(System.in);
        System.out.println("You are playing a game!Press q or Q to quit");
        String response=news.nextLine();
        if(response.equals("q")|| response.equals("Q")){
            System.out.println("quit");
        }
        else{
            System.out.println("still playing");
        }
    }
}
