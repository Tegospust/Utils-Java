

package com.ounis.utils;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import javafx.scene.paint.Color;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.SwingConstants;



/**
 *
 * @author AndroidAppsPlatform
 */
public class MsgDialog extends JDialog implements ActionListener {
    
    private javax.swing.JButton btnOK;
    private javax.swing.JTextField lblMsg;
    
    
    
   
    
    
//    class OnbtnOKClick implements ActionListener {
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            
//        }
//    }
        
    
    public MsgDialog(Frame owner, String title, String msg) {
        super(owner, title, true);
       
        setLayout(new BorderLayout());
        
        lblMsg = new javax.swing.JTextField();
        btnOK = new javax.swing.JButton();

        
        
        
        
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        lblMsg.setText(msg);
        lblMsg.addActionListener(this);
        
        btnOK.addActionListener(this);
        
        initComponents();
        
    }
    
    
    public static void show(Frame owner, String title, String msg) {
//            java.awt.EventQueue.invokeLater(new Runnable() {
//            @Override
//            public void run() {
                MsgDialog mDialog = new MsgDialog(owner, 
                              title, msg);
                FramesUtils.centerWindow(mDialog, 396, 193);
                
                mDialog.setVisible(true);
                
//            }
//        });
        
    }
    
    
    
    private void initComponents() {



        
        lblMsg.setHorizontalAlignment(SwingConstants.CENTER);
//        lblMsg.setFocusable(false);
        lblMsg.setEditable(false);
        lblMsg.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));
        
         //Color cl = Color.rgb(240, 240, 240);
        //lblMsg.setBackground(java.awt.Color.red);   //240,240,240)

        btnOK.setText("OK");
        btnOK.setIcon(new ImageIcon("img/accept.png"));
        
        
        this.add(btnOK, "South");
        this.add(lblMsg);

//        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
//        getContentPane().setLayout(layout);
//        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(layout.createSequentialGroup()
//                .addContainerGap()
//                .addComponent(lblMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                .addContainerGap())
//            .addGroup(layout.createSequentialGroup()
//                .addGap(154, 154, 154)
//                .addComponent(btnOK)
//                .addContainerGap(169, Short.MAX_VALUE))
//        );
//        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(layout.createSequentialGroup()
//                .addGap(46, 46, 46)
//                .addComponent(lblMsg)
//                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
//                .addComponent(btnOK)
//                .addGap(25, 25, 25))
//        );

        pack();
    }                   

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btnOK))
          setVisible(false);
        if (e.getSource().equals(lblMsg))
          setVisible(false);
    }


}
