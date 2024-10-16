/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraylist;
import java.util.ArrayList;
/**
 *
 * @author AYMEN MANSOOR
 */
public class MyArrayList {

    public static void main(String[] args) {
        ArrayList<String>food=new ArrayList<String>();
        food.add("pizza");
        food.add("burger");
        food.add("tikka");
        
        //it will replace the value at index 0
        food.set(0, "karhai");
        //it will delete the valur at the index mentioned
        food.remove(2);
        //it will clear everything
        food.clear();
        
        for(int i=0;i<food.size();i++){
            System.out.println(food.get(i));
        }
    }
}
