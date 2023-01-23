

package com.ounis.utils;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author AndroidAppsPlatform
 */
public class FramesUtils {

    
    
    public static Window centerWindow(Window frame, int defWidth, int defHeight) {
        
        if (defWidth > -1 || defHeight > -1)
            frame.setSize(defWidth, defHeight);
        
        Toolkit kit = frame.getToolkit();
        Dimension frmSize = kit.getScreenSize();

        Dimension scrSize = kit.getScreenSize();

        frame.setLocation(frmSize.width / 2 - frame.getWidth() / 2,
                      frmSize.height / 2 - frame.getHeight() / 2);
        
        return frame;
    }
    
    public static Window centerWindow(Window frame) {
        centerWindow(frame, -1, -1);
        
        return frame;
    }
    
//    public static JDialog centerDialog(JDialog dialog, int defWidth, int defHeight) {
//        
//        dialog.setSize(defWidth, defHeight);
//        
//        Toolkit kit = dialog.getToolkit();
//        Dimension frmSize = kit.getScreenSize();
//
//        Dimension scrSize = kit.getScreenSize();
//
//        dialog.setLocation(frmSize.width / 2 - dialog.getWidth() / 2,
//                      frmSize.height / 2 - dialog.getHeight() / 2);
//        
//        return dialog;
//    }

    
}
