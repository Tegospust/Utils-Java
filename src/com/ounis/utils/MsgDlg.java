

package com.ounis.utils;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 * Klasa obudoouj�ca wywo�ywanie dialog�w JOptionDialog wywo�ywanych w w�tku
 * Thread
 * @author AndroidAppsPlatform
 */

@Deprecated
public class MsgDlg extends Thread {
    
    private Component owner;
    private String msg;
    private String title;
    private int msgType;
    
    public MsgDlg(Component owner, String msg, String title, int msgType) {
        super();
        this.owner = owner;
        this.msg = msg;
        this.title = title;
        this.msgType = msgType;
        Debug.printf("dlgthd", "Utworzone: %s\n", this.toString());
        
    }
    
    @Override
    public void run() {
        JOptionPane.showMessageDialog(owner, msg, title, msgType);
        Debug.printf("dlgthd", "Posz�o: %s\n", this.toString());
    }
                  
    
    
    public static void show(Component owner, String msg, String title, int msgType) {
        MsgDlg msgD = new MsgDlg(owner, msg, title, msgType);
        msgD.start();
        
    }

}
