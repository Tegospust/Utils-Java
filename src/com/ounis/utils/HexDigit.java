

package com.ounis.utils;


/**
 *
 * @author AndroidAppsPlatform
 */
public class HexDigit extends Digits{
    
    private static final String NUM_SYS_CAPT = "HEX";
    
    /**
     * tablica wykorzystywana do wizualizacji liczb szesnatkowych wykorzystywana 
     * w metodzie toString();
     */
    private static final String hexArr[] = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
    
    /**
     * Konstruktor ustawiaj�cy: podstaw� pot�gi u�ywanej przy konwersji,
     * warto�� przenaczon� do konwersji, nag��wek opisuj�cy konwersj� 
     * @param aValue - warto�� do konwersji
     */
    public HexDigit(int aValue) {
        // nie potrzeba wywo�ywa� k. macierzysta ma konstruktor domy�lny bezparametrowy Digits()
        //super();
        this.orgValue = aValue;
        this.powBase = 16;
        this.numSysCapt = NUM_SYS_CAPT;
    }

    /**
     * Lokalna metoda toString() odpowiednio formatuj�ca warto�� obiektu do 
     * wy�wietlania
     * @return String sformatowana warto�� obiektu
     */
    @Override
    public String toString() {
        String result = "";

        
        //result = Arrays.toString(hexArr);
        int lstCount = this.Values().size() - 1;
        for(;lstCount > -1;lstCount--) 
            //result += String.valueOf(Values().get(lstCount));      
            result += hexArr[this.Values().get(lstCount)];
        
        return result;
    }
    
}
