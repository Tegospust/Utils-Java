

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
     * Konstruktor ustawiaj¹cy: podstawê potêgi u¿ywanej przy konwersji,
     * wartoœæ przenaczon¹ do konwersji, nag³ówek opisuj¹cy konwersjê 
     * @param aValue - wartoœæ do konwersji
     */
    public HexDigit(int aValue) {
        // nie potrzeba wywo³ywaæ k. macierzysta ma konstruktor domyœlny bezparametrowy Digits()
        //super();
        this.orgValue = aValue;
        this.powBase = 16;
        this.numSysCapt = NUM_SYS_CAPT;
    }

    /**
     * Lokalna metoda toString() odpowiednio formatuj¹ca wartoœæ obiektu do 
     * wyœwietlania
     * @return String sformatowana wartoœæ obiektu
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
