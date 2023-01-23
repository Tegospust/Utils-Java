/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ounis.utils;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author AndroidDev
 */
public class FibonacciClass {
    private final int range;
    
    FibonacciClass(int aRange) {
        this.range = aRange;
    }
    
    public List<Integer> generateRecursive() {
        ArrayList<Integer> buff = new ArrayList<Integer>();
        genR(buff, 0, 1);
        return buff;
    }
    
    private void genR(List<Integer> arr,int a,int  b) {
        if (a <= this.range) {
            arr.add(a);
            int temp = a;
            a = b;
            b = temp + b;
            genR(arr, a, b);
        }
//        return arr;
    }
    public List<Integer> generate() {
        List<Integer> result = new ArrayList<Integer>();
        if (this.range > 0) {
            int a = 0;
            int b = 1;
            while (a <= this.range) {
                result.add(a);
                int temp = a;
                a = b;
                b = temp + b;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
//        FibonacciClass fib = new FibonacciClass(2000);
        
        
        for (Integer i: (new FibonacciClass(1000)).generateRecursive()) {
            System.out.print(String.format("%d ", i));
        }
       
        System.out.println();
        

    }
    
}
