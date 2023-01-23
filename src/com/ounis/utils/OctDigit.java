

package com.ounis.utils;

/**
 *
 * @author AndroidAppsPlatform
 */
public class OctDigit extends Digits {
    
    private static final int OCT_POWER_BASE = 8;
    private static final String NUM_SYS_CAPT = "OCT";
    
    
    public OctDigit(int aValue) {
        // nie potrzeba wywo³ywaæ k. macierzysta ma konstruktor domyœlny bezparametrowy Digits()
        //super(); 
        this.orgValue = aValue;
        this.powBase = OCT_POWER_BASE;
        this.numSysCapt = NUM_SYS_CAPT;
        
    }
    
    @Override
    public String toString() {
        String result = "";
        int i = this.Values().size() - 1;
        for(;i > -1;i--)
        {
            result += String.valueOf(this.Values().get(i));
        }
        return result;
    }
}
