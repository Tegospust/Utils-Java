

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
     * Konstruktor ustawiaj¹cy: podstawê potêgi u¿ywanej przy konwersji,
     * wartoœæ przenaczon¹ do konwersji, nag³ówek opisuj¹cy konwersjê 
     * @param aValue - wartoœæ do konwersji
     */   
    public BinDigit(int aValue) {
        // nie potrzeba wywo³ywaæ k. macierzysta ma konstruktor domyœlny bezparametrowy Digits()
        //super();
        powBase = 2;
        orgValue = aValue;
        numSysCapt = NUM_SYS_CAPT;
    }
    
     /**
     * Lokalna metoda toString() odpowiednio formatuj¹ca wartoœæ obiektu do 
     * wyœwietlania
     * @return String sformatowana wartoœæ obiektu
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
