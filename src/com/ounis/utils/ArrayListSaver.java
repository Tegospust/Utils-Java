

package com.ounis.utils;


import java.util.ArrayList;
import com.ounis.ftools.FileWriterLn;
import java.io.IOException;

/**
 * Klasa przenaczona do zapisu do pliku <b>tekstowego</b>
 * zawartoœci ArrayList<Object>
 * 
 * Uwaga!
 * Linia w pliku tworzona z Object.toString()
 * 
 * @author AndroidAppsPlatform
 */
public class ArrayListSaver {
    
    private int linesCount;
    /**
     * Liczba wczytanych linii
     * @return 0 przy niepowodzeniu
     */
    public int linesCount()
    {
        return linesCount;
    }
    
    {
        linesCount = 0;
    }
    
    /**
     * Zpisuje do pliku tekstowego linia po linii zawartoœæ listy tablicowej
     * Rzuca IOException je¿eli coœ pójdzie nie tak
     * 
     * @param aList ArrayList<Object>
     * @param aFileName nazwa pliku
     * @param aAppend dopisywanie do pliku (true/false)
     * @throws IOException 
     */
    
    public void saveArrList(ArrayList<Object> aList, String aFileName, 
                  boolean aAppend) throws IOException
    {
        linesCount = 0;
        FileWriterLn fout = new FileWriterLn(aFileName, aAppend);
        for (Object o: aList)
            fout.writeln(o.toString());
        fout.flush();
        fout.close();
        
        linesCount = aList.size();
    }
    
    
}
