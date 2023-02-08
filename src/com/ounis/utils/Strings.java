/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ounis.utils;

/**
 *
 * @author AndroidDev
 */
public class Strings {
    
    public static int ord(char c) {
        return (int)c;
    }
    
//    https://www.geeksforgeeks.org/reverse-a-string-in-java/
    public static String reverse(String s) {
        return (new StringBuilder(s)).reverse().toString();
// stara wersja        
//        var result = "";
//        for(char c: s.toCharArray()) {
//            result = c + result;
//        }
//        return result;

//      lub

//        var result = "";
//        char[] buff = s.toCharArray();
//        for(int i = buff.length-1;i > -1;i--) 
//            result += buff[i];
//        return result;
    }
    
}
