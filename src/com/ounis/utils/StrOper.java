

package com.ounis.utils;

import java.util.ArrayList;

/**
 * Operacje na ³añcuchach znaków
 * 
 * @author AndroidAppsPlatform
 */
public class StrOper {
    
    private static StringBuilder defStringBuilder;
    private static ArrayList<Object> alUsedStrings;
    
    static {
        defStringBuilder = new  StringBuilder();
        alUsedStrings = new ArrayList<>();
    }

    
    private static StringBuilder setNewString(String aStr)
    {
        defStringBuilder.setLength(0);
        defStringBuilder.append(aStr);
        alUsedStrings.add(defStringBuilder.toString());
        return defStringBuilder;
    }
    
    /**
     * Usuwa znak z ³añcucha <b>aStr</b> na pozycji <b>aIdx</b>
     * 
     * @param aMainStr ³añcuch wej.
     * @param aIdx pozycja do usuniêcia
     * @return nowy ³añcuch
     */
    public static String delCharAt(String aMainStr, int aIdx)
    {
        /*
        String s = "12345";
        
        StringBuffer sb = StringBuffer(s);
        operacje na ci¹gu znaków reprezentowanego przez StringBuffer
        
        s = sb.toString();
        */

        String result;
//        defStringBuilder.setLength(0);
//        defStringBuilder.append(aStr);
        setNewString(aMainStr);
        defStringBuilder.deleteCharAt(aIdx);
        return defStringBuilder.toString();
        
    }

    /**
     * Wstawia znak <b>aChar</b> do ³añcucha <b>aStr</b> na pozycjê <b>aIdx</b>
     * 
     * @param aMainStr ³añcuch wej.
     * @param aIdx pozycja do wstawienia nowego znaku w ³añcuchu 
     * @param aChar znak do wstwienia
     * @return ³añcuch ze wstawionym znakiem
     */
    public static String insCharAt(String aMainStr, int aIdx, char aChar)
    {
        String result;
//        defStringBuilder.setLength(0);
//        defStringBuilder.append(aStr);
        setNewString(aMainStr);
        defStringBuilder.insert(aIdx, aChar);
        result = defStringBuilder.toString();
        return result;
    }
    
    /**
     * Dodaje ³añcuch <b>aStr</b> do ³añcucha <b>aMainStr</b>
     * @param aMainStr ³añcuch wej.
     * @param aStr dodawany ³añcuch
     * @return nowy ³añcuch
     */
    public static String append(String aMainStr, String aStr)
    {
        String result;
        setNewString(aMainStr);
        defStringBuilder.append(aStr);
        result = defStringBuilder.toString();
        return result;
    }
    
    /**
     * Dodaje znak <b>aChar</b> do ³añcucha <b>aMainStr</b>
     * @param aMainStr ³añcuch wej.
     * @param aChar dodawany znak
     * @return nowy ³añcuch
     */
    public static String append(String aMainStr, char aChar)
    {
        String result;
        setNewString(aMainStr);
        defStringBuilder.append(aChar);
        result = defStringBuilder.toString();
        return result;
    }
    
    /**
     * Dodaje znak/znaki o kodzie <b>aCp</b> do ³añcucha <b>aMainStr</b>
     * @param aMainStr ³añcuch wej.
     * @param aCp kod dodawanego znaku
     * @return nowy ³añcuch
     */
    public static String appendCodePoint(String aMainStr, int aCp)
    {
        String result;
        setNewString(aMainStr);
        defStringBuilder.appendCodePoint(aCp);
        result = defStringBuilder.toString();
        return result;
    }
    
    /**
     * Wstawianie znaku <b>aChar</b> na pozycjê <b>aIdx</b> w ³añcuchu
     * <b>aMainStr</b>
     * @param aMainStr ³añcuch wej.
     * @param aIdx pozycja wstawianego znaku
     * @param aChar wstawiany znak
     * @return nowy ³añcuch
     */
    public static String setCharAt(String aMainStr, int aIdx, char aChar)
    {
        String result;
        setNewString(aMainStr);
        defStringBuilder.setCharAt(aIdx, aChar);
        result = defStringBuilder.toString();
        return result;
    }
    
    /**
     * Wstawia znak <b>aChar</b> w ³añcuchu <b>aMainStr</b> 
     * na pozycji <b>aIdx</b>
     * @param aMainStr ³añcuch wej.
     * @param aIdx pozycja wstawiania
     * @param aChar wstawiany znak
     * @return nowy ³añcuch
     */
    public static String insert(String aMainStr, int aIdx, char aChar)
    {
        // wersja ultra krótka
        return ((setNewString(aMainStr)).insert(aIdx, aChar)).toString();
    }
    
    /**
     * Wstawia ³añcuch <b>aStr</b> na pozycji <b>aIdx</b> 
     * w ³añcuchu <b>aMainStr</b>
     * @param aMainStr ³añcuch wej.
     * @param aIdx pozycja wstawiania
     * @param aStr wstawiany ³añcuch
     * @return nowy ³añcuch
     */
    public static String insert(String aMainStr, int aIdx, String aStr)
    {
        return (setNewString(aMainStr)).insert(aIdx, aStr).toString();
    }
    
    /**
     * Wyciêcie z ³añcucha <b>aMainStr</b> pod³añcucha na pozycji 
     * @param aMainStr
     * @param aStart
     * @param aEnd
     * @return 
     */
    public static String delete(String aMainStr, int aStart, int aEnd)
    {
        return (setNewString(aMainStr)).delete(aStart, aEnd).toString();
    }
    
    
    
    /**
     * Dopasowanie podci¹gu <b>aSubStr</b> w ci¹gu <b>aStr</b><br>
     * <font sinze="4" color="#ff0000">CASESENSITIVE !!!</font><br>
     * @param aStr ci¹g
     * @param aSubStr podci¹g
     * @return = -1 brak dopasowania<br>
     *         > -1 dopasowanie w <b>aStr</b> od pozycji równej zwróconej wartoœci<br><br> 
     * <i>(\m/ Pascal)</i>
     */
    public static int pascalPos(String aStr, String aSubStr) {
        int start = 0;
        boolean match = false;
        if (aStr.equals(aSubStr))
            return start;
        for(;true;) {
            if (start + aSubStr.length() > aStr.length())
                break;
            String chunk = aStr.substring(start, aSubStr.length()+start);
//            System.out.printf("%s, %d, %s,%d\n",chunk, chunk.length(), aSubStr,aSubStr.length());
            if (aStr.substring(start, aSubStr.length()+start).equals(aSubStr)) {
                match = true;
                break;
            }
            start += 1;
        }
        return match ? start : -1;
    }
    /**
     * Dopasowanie podci¹gu <b>aSubStr</b> w ci¹gu <b>aStr</b><br>
     * <font sinze="4" color="#ff0000">CASESENSITIVE !!!</font><br>
     * (<u>java.lang.String.charAt() version</u>)
     * @param aStr ci¹g
     * @param aSubStr podci¹g
     * @return = -1 brak dopasowania<br>
     *         > -1 dopasowanie w <b>aStr</b> od pozycji równej zwróconej wartoœci<br><br> 
     * <i>(\m/ Pascal)</i>
     */
    private static int testPos(String aStr, String aSubStr) {
        int start = -1;
        boolean match = true;
        if (aStr.equals(aSubStr)) 
            return 0;
        if (aSubStr.length() > aStr.length())
            return -1;
        start = 0;
        while(true) {
            for(int i = 0;i < aSubStr.length();i++) {
    //            System.out.printf("%d - %s\n", start,aStr.charAt(start));
                if( Strings.ord(aStr.charAt(start + i)) ==  Strings.ord(aSubStr.charAt(i))) {
                    match = true;
                }
                else {
                    match = false;
                }
                if (!match)
                    break;
            }
            if (match)
                break;
            start += 1;
            if (start + aSubStr.length()-1 > aStr.length()-1) {
                start = -1;
                break;
            }
                
        }
        return match ? start : -1;
    }
    
// do testowania funkcji    
    public static void main(String... args) {
//        System.out.println(pascalPos("odprowadzi³".toLowerCase(), "Wadzi³".toUpperCase()));
//        System.out.println("przyDUPAs".contains("dupa"));
        System.out.println(testPos("ROMANI","an"));
    }
    
}
