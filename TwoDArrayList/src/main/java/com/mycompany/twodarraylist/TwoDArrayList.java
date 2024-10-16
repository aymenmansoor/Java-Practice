package com.mycompany.twodarraylist;
import java.util.*;
public class TwoDArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> ShoppingList=new ArrayList<>();
        
        ArrayList<String> produceList=new ArrayList<>();
        produceList.add("milk");
        produceList.add("yogurt");
        produceList.add("chocolate");
        
        ArrayList<String> MakeupList=new ArrayList<>();
        MakeupList.add("lipstick");
        MakeupList.add("eyeliner");
        MakeupList.add("mascara");
        
        ArrayList<String> BakeryList=new ArrayList<>();
        BakeryList.add("roti");
        BakeryList.add("bread");
        BakeryList.add("pasta");
        
        ShoppingList.add(produceList);
        ShoppingList.add(MakeupList);
        ShoppingList.add(BakeryList);
        
        //if we want only one list we could apply get()
        System.out.println(ShoppingList.get(1));
        //if we want to access only one item from one particular list we would apply get( ).get()
        System.out.println(ShoppingList.get(1).get(1));
    }
}
