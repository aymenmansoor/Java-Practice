/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gui_intro;
import javax.swing.JOptionPane;
/**
 *
 * @author AYMEN MANSOOR
 */
public class Gui_intro {

    public static void main(String[] args) {
        String name=JOptionPane.showInputDialog("enter your name: ");
        JOptionPane.showMessageDialog(null,"hello "+ name);
        
        int age=Integer.parseInt(JOptionPane.showInputDialog("enter your age: "));
        JOptionPane.showMessageDialog(null,"you are "+ age + "years old");
        
        double height=Double.parseDouble(JOptionPane.showInputDialog("enter your heighgt: "));
        JOptionPane.showMessageDialog(null,"you are "+ height + "cm tall");
    }
}
