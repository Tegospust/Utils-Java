/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ounis.utils;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author AndroidDev
 */
public class UtilsArrays {
    
    /**
     * 
     * @param objArr Object[]
     * @return  Integer[]
     */
    public static Integer[] conv2IntegerArr(Object[] objArr) {
        Integer[] result = null;
        if (objArr != null) {
            result = new Integer[objArr.length];
            for(int i=0;i<objArr.length;i++) {
                result[i] = (Integer)objArr[i];
            }
        }
        return result;
    }
    
    public static String[] conv2StringArr(Object[] objArr) {
        String[] result = null;
        if(objArr != null) {
            result = new String[objArr.length];
            for(int i=0;i<objArr.length;i++)
                result[i] = String.valueOf(objArr[i]);
        }
        return result;
    }
    
    public static void main(String... args) {
//        ArrayList<Integer> alI = (ArrayList<Integer>) (new FibonacciClass(1000)).generate();
//        Integer[] arrI = conv2IntegerArr(alI.toArray());
//        System.out.printf("arrI: %d, alI: %d\n", arrI.length, alI.size());

        String s = "ROMANI ITE DOMUM";
        
        String rs = "";
        for(char c: s.toCharArray()) {
            rs = c + rs;
        }
        System.out.println(rs);
                
    }
    
}
