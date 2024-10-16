/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oop;

/**
 *
 * @author AYMEN MANSOOR
 */
public class Oop {

    public static void main(String[] args) {
        car myCar=new car();
        car Car=new car();
        
        System.out.println(myCar.colour);
        System.out.println(myCar.model);
        myCar.brake();
        myCar.drive();
        
        System.out.println(Car.name);
    }
}
