/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ounis.utils;

import java.util.Scanner;


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

        
        int i = 0;
        int value = 0;
        
        // https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java
        
        for (i=1;i<=10;i++) {
            value = ((int) (Math.random() * 10)) +1;
            System.out.print(value + " ");
            
            //String l = (new Scanner(System.in)).next(); 
        }
        System.out.println("");
    }
    
}
