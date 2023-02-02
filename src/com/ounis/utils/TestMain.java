/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ounis.utils;

import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author AndroidDev
 */
public class TestMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        var MAX = 30;
        
        int i = 0;
        int value = 0;
        
        // https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java
        
        for (i=1;i<=10;i++) {
            value = ((int) (Math.random() * 10)) +1;
            System.out.print(value + " ");
            
            //String l = (new Scanner(System.in)).next(); 
        }
        String rid = "ROMANI ITE DOMUM";
        System.out.println("\n"+Strings.reverse(rid));
        //}as of release 10, 'var' is a restricted type name and cannot be used for type declarations or as the element type of an array
        var f = 0;
        System.out.printf("\n%d\n",Strings.ord("ROMANI ITE DOMUM".charAt(3)));
        JOptionPane.showMessageDialog(null, MAX, "Info", JOptionPane.QUESTION_MESSAGE);
    }
    
}

