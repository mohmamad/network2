/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.javaclient;

import java.awt.Color;
import java.awt.List;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.scene.paint.Color.color;

/**
 *
 * @author GoldenTech
 */
public class sysGroup extends javax.swing.JFrame {
    ArrayList<Character> charV = new ArrayList<>();
    
    String val = "";
    /**
     * Creates new form sysGroup
     */
    public sysGroup() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        setConText = new javax.swing.JTextField();
        setNameText = new javax.swing.JTextField();
        setLocText = new javax.swing.JTextField();
        setConBtn = new javax.swing.JButton();
        setNameBtn = new javax.swing.JButton();
        setLocBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        backP = new javax.swing.JPanel();
        back = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        sysDescHard = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        sysDescSoft = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        sysOID = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        sysUPtime = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        sysCont = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        sysName = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        sysLoc = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        sysSer = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        setConText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setConTextActionPerformed(evt);
            }
        });

        setConBtn.setText("Set Contact");

        setNameBtn.setText("Set Name");

        setLocBtn.setText("Set Location");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(setConBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(setConText))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(setNameText)
                    .addComponent(setNameBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(setLocText)
                    .addComponent(setLocBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setLocText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setConText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setConBtn)
                    .addComponent(setNameBtn)
                    .addComponent(setLocBtn))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));
        jPanel2.setLayout(new java.awt.GridLayout(10, 0, 5, 5));

        jPanel4.setBackground(new java.awt.Color(153, 255, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());

        backP.setBackground(new java.awt.Color(153, 255, 255));

        back.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setText("<");
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backMouseExited(evt);
            }
        });

        javax.swing.GroupLayout backPLayout = new javax.swing.GroupLayout(backP);
        backP.setLayout(backPLayout);
        backPLayout.setHorizontalGroup(
            backPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        backPLayout.setVerticalGroup(
            backPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.add(backP, java.awt.BorderLayout.LINE_START);

        jPanel15.setBackground(new java.awt.Color(153, 255, 255));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel15, java.awt.BorderLayout.LINE_END);

        jPanel16.setBackground(new java.awt.Color(153, 255, 255));

        jLabel9.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("System Group");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel16, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel1.setText("System decription(Hardare):");
        jPanel6.add(jLabel1, java.awt.BorderLayout.LINE_START);
        jPanel6.add(sysDescHard, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel6);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jLabel5.setText("System description(Software):");
        jPanel11.add(jLabel5, java.awt.BorderLayout.LINE_START);
        jPanel11.add(sysDescSoft, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel11);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jLabel2.setText("System Object ID:");
        jPanel7.add(jLabel2, java.awt.BorderLayout.LINE_START);
        jPanel7.add(sysOID, java.awt.BorderLayout.CENTER);

        jPanel10.setLayout(new java.awt.BorderLayout());
        jPanel7.add(jPanel10, java.awt.BorderLayout.PAGE_START);

        jPanel2.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jLabel3.setText("System UP Time:");
        jPanel8.add(jLabel3, java.awt.BorderLayout.LINE_START);
        jPanel8.add(sysUPtime, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jLabel4.setText("System Contact:");
        jPanel9.add(jLabel4, java.awt.BorderLayout.LINE_START);
        jPanel9.add(sysCont, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel9);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new java.awt.BorderLayout());

        jLabel8.setText("Systme Name:");
        jPanel14.add(jLabel8, java.awt.BorderLayout.LINE_START);
        jPanel14.add(sysName, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel14);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jLabel6.setText("System Location:");
        jPanel12.add(jLabel6, java.awt.BorderLayout.LINE_START);
        jPanel12.add(sysLoc, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new java.awt.BorderLayout());

        jLabel7.setText("System Services:");
        jPanel13.add(jLabel7, java.awt.BorderLayout.LINE_START);

        sysSer.setText("jLabel11");
        jPanel13.add(sysSer, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel13);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setText("Display");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(186, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       display();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void setConTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setConTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_setConTextActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        main m = new main();
        m.setLocationRelativeTo(null);
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backMouseClicked

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
         Color c =new Color(140,240,255);
        backP.setBackground(c);
    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
        Color c =new Color(153,255,255);
        backP.setBackground(c);
    }//GEN-LAST:event_backMouseExited
    
    /**
     * @param args the command line arguments
     */
///////////////////////////////////////////////////////////////////////////////////////////function
    public  void display(){
 URL url;
        try {
            url = new URL ("http://localhost/mysite/Display_sys_group.php?first=Manar&last=Qam");
            URLConnection urlc = url.openConnection();
            urlc.setAllowUserInteraction(true);
            urlc.setDoInput(true);
            urlc.setDoOutput(true);

            String str = "name=Manar";
            OutputStream os = urlc.getOutputStream();
            byte [] data = str.getBytes();
            os.write(data);

            InputStream is = urlc.getInputStream();
            int count = 0;
            for (int ch=0; (ch = is.read()) != -1 ;){
                charV.add((char)ch);

                count++;
            }
            char[] test = new char[charV.size()];
            for(int i = 0 ; i < charV.size() ; i++){
                test[i] = charV.get(i);
            }
            val = String.valueOf(test);
            System.out.println(val);
        } catch (MalformedURLException ex) {
            Logger.getLogger(sysGroup.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(sysGroup.class.getName()).log(Level.SEVERE, null, ex);
        }
        String[] allVals;
        allVals = val.split(";");
        /////////////////////////////////////////////
        String[] temp;
        String hard;
        String soft;
        temp = allVals[0].split("-");
        hard = temp[0].split("STRING:")[1].split("Hardware:")[1];
        soft = temp[1].split("Software:")[1];
        sysDescHard.setText(hard);
        sysDescSoft.setText(soft);
        sysOID.setText(allVals[1]);
        sysUPtime.setText(allVals[2]);
        sysCont.setText(allVals[3]);
        sysName.setText(allVals[4].split("STRING:")[1]);
        sysLoc.setText(allVals[5]);
        sysSer.setText(allVals[6].split("INTEGER:")[1]);
        ////////////////////////////////////////////
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////
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
            java.util.logging.Logger.getLogger(sysGroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sysGroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sysGroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sysGroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sysGroup().setVisible(true);
                
                ////////////////////////////////////////////////////
             //  display();

                //////////////////////////////////////////////////
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JPanel backP;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton setConBtn;
    private javax.swing.JTextField setConText;
    private javax.swing.JButton setLocBtn;
    private javax.swing.JTextField setLocText;
    private javax.swing.JButton setNameBtn;
    private javax.swing.JTextField setNameText;
    private javax.swing.JLabel sysCont;
    private javax.swing.JLabel sysDescHard;
    private javax.swing.JLabel sysDescSoft;
    private javax.swing.JLabel sysLoc;
    private javax.swing.JLabel sysName;
    private javax.swing.JLabel sysOID;
    private javax.swing.JLabel sysSer;
    private javax.swing.JLabel sysUPtime;
    // End of variables declaration//GEN-END:variables
}