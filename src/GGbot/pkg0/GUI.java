/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GGbot.pkg0;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.*;
import javax.swing.*;
import javax.swing.text.AttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
/**
 *
 * @author salimbouassida
 */

public class GUI extends javax.swing.JFrame {

    
    private String output;
    private int count=0;
    private String input;

    public GUI() {
        
        initComponents();
       
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Tittle = new javax.swing.JTextArea();
        infobox = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        chatbox = new javax.swing.JTextPane();
        inputbox = new javax.swing.JTextField();
        send = new javax.swing.JButton();
        background = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tittle.setEditable(false);
        Tittle.setColumns(20);
        Tittle.setFont(new java.awt.Font("Lucida Grande", 1, 48)); // NOI18N
        Tittle.setRows(5);
        Tittle.setText("GG.bot");
        Tittle.setAutoscrolls(false);
        Tittle.setFocusTraversalKeysEnabled(false);
        Tittle.setFocusable(false);
        Tittle.setRequestFocusEnabled(false);
        jPanel1.add(Tittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 180, 70));

        infobox.setColumns(20);
        infobox.setFont(new java.awt.Font("STHeiti", 1, 14)); // NOI18N
        infobox.setLineWrap(true);
        infobox.setRows(5);
        infobox.setText(" \n Welcome to GG.Bot !\n\n Feel free to ask me any question \n regarding league of legends \n and the role of jungler.\n \n If you do not understand a word\n you can ask for the definition.");
        infobox.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 102)));
        jPanel1.add(infobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 350, 240, 150));

        jScrollPane3.setOpaque(false);

        chatbox.setEditable(false);
        chatbox.setInheritsPopupMenu(true);
        chatbox.setOpaque(false);
        jScrollPane3.setViewportView(chatbox);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 660, 350));

        inputbox.setToolTipText("Enter Your message for Darth Vader");
        inputbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enter(evt);
            }
        });
        jPanel1.add(inputbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 670, 70));

        send.setText("Send");
        send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendActionPerformed(evt);
            }
        });
        jPanel1.add(send, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 510, 130, 50));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GGbot/pkg0/Background.png"))); // NOI18N
        background.setMaximumSize(new java.awt.Dimension(500, 500));
        background.setMinimumSize(new java.awt.Dimension(500, 500));
        background.setPreferredSize(new java.awt.Dimension(500, 500));
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 610));
        jPanel1.add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 80, 120));

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendActionPerformed
  try {
               String input=((inputbox.getText()).toLowerCase()).trim();
               chat(input);
               
            } catch (Exception ex) {
               System.out.print("Error22");}
         
        inputbox.setText("");
        inputbox.requestFocus(); 
        

                   }//GEN-LAST:event_sendActionPerformed

    private void enter(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enter
if (evt.getKeyCode()==KeyEvent.VK_ENTER){
        

      
      try {
               String input=((inputbox.getText()).toLowerCase()).trim();
               chat(input);
               
            } catch (Exception ex) {
               System.out.print("Error22");}
         
        inputbox.setText("");
        inputbox.requestFocus();        

    }//GEN-LAST:event_enter
    }
    private void  chat(String input){
       
        StyledDocument chat = chatbox.getStyledDocument();
        output=bot.Bot(input);
        
try
{
SimpleAttributeSet keyWord = new SimpleAttributeSet();

    chat.insertString(chat.getLength(), "<User>"+input, keyWord );
    
           SimpleAttributeSet keyWord2 = new SimpleAttributeSet();
           
            SimpleAttributeSet Keyword2 = keyWord;
    
    
     StyleConstants.setForeground(keyWord, Color.GREEN);
   chat.insertString(chat.getLength(),  "\n<GGbot>",Keyword2);
            
   
    StyleConstants.setForeground(keyWord, Color.BLACK);
   chat.insertString(chat.getLength(),output+"\n",Keyword2);
}
catch(Exception e) { System.out.println(e); }
       
    }
    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new GUI().setVisible(true);
                
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Tittle;
    private javax.swing.JLabel background;
    private javax.swing.JTextPane chatbox;
    private javax.swing.JTextArea infobox;
    private javax.swing.JTextField inputbox;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton send;
    // End of variables declaration//GEN-END:variables
}
