

package com.ounis.utils;

import com.ounis.ftools.FTools;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author AndroidAppsPlatform
 */
public class ArrayListLoader 
{
    
    private String errMsg;
    /**
     * Treœæ komunikatu b³edu podczas wczytywania pliku.
     * @return domyœlnie pusty ³añcuch
     */
    public String errMsg()
    {
        return errMsg;
    }
    
    private int linesCount;
    /**
     * Liczba linii wczytana z pliku.
     * @return 0 - problem z wczytywaniem.
     */
    public int linesCount()
    {
        return linesCount;
    }
    
    {
        errMsg = "";
        linesCount = 0;
    }
    
    
    /**
     * Wczytuje do ArrayList zawartoœæ pliku tekstowego <b>aFileName</b>.
     * Zwracany jest obiekt <b>ArrayList</b>. W przypadku niepowodzenia
     * zwracany jest <b>null</b>
     * @param aFileName plik tekstowy do wczytania
     * @return obiekt <b>ArrayList</b> lub <b>null</b> gdy siê niepowiedzie
     */
    public ArrayList<Object> loadArrList(String aFileName) 
    {
        ArrayList<Object> result = null;
        ArrayList<Object> loadedArrList = null;
        BufferedReader dataFile;
        String line;
        
        loadedArrList = new ArrayList<>();
        linesCount = 0;
        errMsg = "";

        try {
            dataFile = new BufferedReader(
                          new InputStreamReader(new FileInputStream(aFileName)));
            while ((line = dataFile.readLine()) != null) {
                loadedArrList.add(line);
            }

            dataFile.close();
            linesCount = loadedArrList.size();
            result = loadedArrList;
        } catch (IOException e) {
            errMsg = e.getLocalizedMessage();
            linesCount = 0;
            result = null;
        }
        return result;
    }
    
}
