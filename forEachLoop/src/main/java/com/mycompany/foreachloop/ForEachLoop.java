/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.foreachloop;
import java.util.ArrayList;
/**
 *
 * @author AYMEN MANSOOR
 */
public class ForEachLoop {

    public static void main(String[] args) {
        //String[] animals={"cats","Dogs","Horse"};
        ArrayList<String> animals=new ArrayList<String>();
        animals.add("Cats");
        animals.add("Dogs");
        animals.add("Horse");
        for(String i: animals){
        System.out.println(i);
    }
}
}
