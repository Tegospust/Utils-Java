
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AndroidDev
 */
public class SysVar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String sysVar = System.getenv("path");
        
        ArrayList<String> aList = null;
        
        String[] arrSysArr = sysVar.split(";"); //new String[] {"1", "2"};  //sysVar.split(";");
        
        
        
        for (String s: arrSysArr)
            System.out.printf("%s\n", s);
        
    }
    
}
