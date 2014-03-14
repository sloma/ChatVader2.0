/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chatvader.pkg0;
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

public class NewJFrame extends javax.swing.JFrame {

    
    private String output;
    private int count=0;
    private String input;

    public NewJFrame() {
        
        initComponents();
       
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        chatbox = new javax.swing.JTextPane();
        inputbox = new javax.swing.JTextField();
        send = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monaco", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Welcome to GG.Bot\nFeel free to ask me any question \nabout league of legends. Or on how\nto support.");
        jTextArea1.setBorder(null);
        jPanel1.add(jTextArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 280, 240, 120));

        chatbox.setEditable(false);
        jScrollPane3.setViewportView(chatbox);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 660, 340));

        inputbox.setToolTipText("Enter Your message for Darth Vader");
        inputbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enter(evt);
            }
        });
        jPanel1.add(inputbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 670, 70));

        send.setText("Send");
        send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendActionPerformed(evt);
            }
        });
        jPanel1.add(send, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 510, 130, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chatvader/pkg0/test2.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(500, 500));
        jLabel1.setMinimumSize(new java.awt.Dimension(500, 500));
        jLabel1.setPreferredSize(new java.awt.Dimension(500, 500));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 610));

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new NewJFrame().setVisible(true);
                
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane chatbox;
    private javax.swing.JTextField inputbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton send;
    // End of variables declaration//GEN-END:variables
}
