

package com.ounis.utils;

//import java.util.ArrayList;
//import com.ounis.utils.Digits;

/**
 *
 * @author AndroidAppsPlatform
 */



public class BinDigit extends Digits{
    
    private final static String NUM_SYS_CAPT = "BIN";
    
     /**
     * Konstruktor ustawiaj�cy: podstaw� pot�gi u�ywanej przy konwersji,
     * warto�� przenaczon� do konwersji, nag��wek opisuj�cy konwersj� 
     * @param aValue - warto�� do konwersji
     */   
    public BinDigit(int aValue) {
        // nie potrzeba wywo�ywa� k. macierzysta ma konstruktor domy�lny bezparametrowy Digits()
        //super();
        powBase = 2;
        orgValue = aValue;
        numSysCapt = NUM_SYS_CAPT;
    }
    
     /**
     * Lokalna metoda toString() odpowiednio formatuj�ca warto�� obiektu do 
     * wy�wietlania
     * @return String sformatowana warto�� obiektu
     */ 
    @Override
    public String toString() {
        String result = "";
        int lstCount = this.Values().size() - 1;
        for(;lstCount > -1;lstCount--) 
            result += String.valueOf(this.Values().get(lstCount));
            
        return result;
    }


}
