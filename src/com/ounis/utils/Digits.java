

package com.ounis.utils;

import java.util.ArrayList;

/**
 *
 * @author AndroidAppsPlatform
 */
public abstract class Digits {

    /**
     * Nag��wek okre�laj�cy rodzaj systemu liczbowego
     * ustawiany w klasach pochodnych (def: "")
     */
    protected String numSysCapt;
    public String hasNumSysCapt() {
        return numSysCapt;
    }
    
    /**
     * Podstawa pot�gi wykorzystywana do konwersji na inny system liczbowy
     * ustawiana w konstruktorach klas pochodnych (def: 0)
     */
    protected int powBase;
    public int hasPowBase() {
        return powBase;
    }
    
    protected int orgValue;
    
    private ArrayList<Integer> Values;
    protected ArrayList<Integer> Values() {
        return Values;
    }
    
    /**
     * Konstruktorek domy�lny, bezparametrowy inicjalizuje co trzeba  i 
     * tworzy niezb�dne struktury. Wa�ne dla klas potomnych!!!
     */
     public Digits() {
        powBase = 0;
        numSysCapt = "";
        Values = new ArrayList<>();
    }
     
    
     
    /**
     * Konwerja liczby podanej w konstruktorze
     */ 
    public void Convert() {
        Execute();
    }
    
    /**
     * Wykonanie konwersji na system liczbowy
     */
    protected void Execute() {
        //System.out.printf("V: %d, B: %d\n", orgValue, powBase);
        int rem = 0;
        int i_val = orgValue;
        int tmp = 0;
        do {
            rem = i_val % powBase;
            i_val /= powBase;
            Values.add(rem);
            
            tmp++;
        } 
        while (i_val > 0);
    }
    
    /**
     * Pobranie listy warto�ci skonwertowanych
     * @return ArrayList<Integer>
     */
    public String getValue() {
        return "";
    }
    
    /**
     * Kontrola czy warto�� skonwertowana jest taka sama jak podana na wej�ciu
     * @return false - je�eli pora�ka
     */
    public boolean check() {
        boolean result = false;
        
        
        int tmp = 0;//Values.size() - 1;
        int test_value = 0;
        for (Integer v : Values)
        {
            test_value += v * Math.pow(powBase, tmp);
            tmp++;
        }
        //System.out.printf("test: %d", test_value);
        result = (test_value == orgValue);
        return result;
    }
    
    /**
     * Domy�lna metoda zwracaj�ca zawarto�� listy skonwertowanych warto�ci
     * @return String
     */
    @Override
    public String toString() {
        String result = "";
        
        result = Values.toString();
        
//        int lstCount = Values.size() - 1;
//        for(;lstCount > -1;lstCount--) 
//            result += String.valueOf(Values.get(lstCount));
            
        return result;
    }
    /**
     * Metoda equals potrzebna por�wnywania
     * @param o obiekt do por�wnania
     * @return false je�li pora�ka
     */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (o == null)
            return false;
        if (o.getClass() != Digits.class)
            return false;
        
        Digits other = (Digits)o;
        if (other.orgValue != this.orgValue)
            return false;
        
        return true;
    }
                  
}
