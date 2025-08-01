/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.database_pro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Google Tech
 */
public class EXHIBITION extends javax.swing.JFrame {

    /**
     * Creates new form EXHIBITION
     */
    public EXHIBITION() {
        initComponents();
        setSize(1085, 780);
        setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        SHOW = new javax.swing.JButton();
        BACKE = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Kristen ITC", 1, 24)); // NOI18N
        jLabel1.setText("                   DATA  ABOUTE  THE  EXHIBITION");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, 60, 650, 60);

        table.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NUMBER OF EXHIBITION", "NAME OF EXHIBITION", "CITY", "STREET", "E_SSN"
            }
        ));
        jScrollPane2.setViewportView(table);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(30, 160, 970, 470);

        SHOW.setBackground(new java.awt.Color(204, 204, 204));
        SHOW.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        SHOW.setText("SHOW ALL DATA");
        SHOW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SHOWActionPerformed(evt);
            }
        });
        getContentPane().add(SHOW);
        SHOW.setBounds(880, 690, 180, 27);

        BACKE.setBackground(new java.awt.Color(204, 204, 204));
        BACKE.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        BACKE.setText("BACKE");
        BACKE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKEActionPerformed(evt);
            }
        });
        getContentPane().add(BACKE);
        BACKE.setBounds(20, 690, 120, 27);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-search-50.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(990, 80, 50, 50);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-delete-50.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(920, 80, 50, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsz_1b.jpg"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-3, 0, 1080, 750);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SHOWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SHOWActionPerformed
       DefaultTableModel tableModel =(DefaultTableModel) table.getModel();
        try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            String conINFO ="jdbc:postgresql://localhost:5432/postgres";
            Connection con = DriverManager.getConnection(conINFO,"eman","123456");
            String Q = "select * from prado_company.\"exhibition\"";
            Statement atmp = con.createStatement();
             ResultSet rs = atmp.executeQuery(Q);
             tableModel.setRowCount(0);
             while (rs.next())
             {
                 tableModel.addRow(new String []{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});
                
             }
             rs.close();
             atmp.close();
             con.close();    

        } catch (Exception ex) {
            //Logger.getLogger(Store.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showConfirmDialog(null, ex.toString());
        }
        
    }//GEN-LAST:event_SHOWActionPerformed

    private void BACKEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKEActionPerformed
        dispose();// to close the curent frame
        exhibitionFrame R = new exhibitionFrame ();// next GUI....
        R.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BACKEActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         String userInput = JOptionPane.showInputDialog(null, "ENTER THE Employee Number:");
                // Check if user clicked "OK" and entered data
                if (userInput != null && !userInput.isEmpty()) {
                    
                     DefaultTableModel tableModel =(DefaultTableModel) table.getModel();
        try {  
            DriverManager.registerDriver(new org.postgresql.Driver());
            String conINFO ="jdbc:postgresql://localhost:5432/postgres";
            Connection con = DriverManager.getConnection(conINFO,"eman","123456");
            String Q ="select * from prado_company.\"exhibition\" where prado_company.\"exhibition\".\"number\" =?";
            PreparedStatement statment = con.prepareStatement(Q);
            statment.setString(1,userInput );
           ResultSet set = statment.executeQuery();
            
           tableModel.setRowCount(0);
           //table.setModel(DbUtils.resultSetToTableModel(set));
           while(set.next()){
           tableModel.addRow(new String []{set.getString(1),set.getString(2),set.getString(3),set.getString(4),set.getString(5)});
           }
           statment.close();
           set.close();
           con.close();    
        } catch (Exception ex) {
            //Logger.getLogger(Store.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showConfirmDialog(null, ex.toString());
        }
                } else {
                    // User clicked "Cancel" or closed the dialog
                    JOptionPane.showMessageDialog(null, "WRONG ENTRY", "Error", JOptionPane.ERROR_MESSAGE);
                 }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         String userInput = JOptionPane.showInputDialog(null, "ENTER THE NUMBER OF EXHIBITION :");
        int p =JOptionPane.showConfirmDialog(null,"Are yoy sure you want to delete this item?", "DELETE",JOptionPane.YES_OPTION);
         if (p==0) {
         try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            String conINFO ="jdbc:postgresql://localhost:5432/postgres";
            Connection con = DriverManager.getConnection(conINFO,"eman","123456");
           
            String Q="delete  from prado_company.\"exhibition\" where prado_company.\"exhibition\".\"number\" = ?";
            PreparedStatement statment = con.prepareStatement(Q);
            statment.setString(1,userInput );
           ResultSet set = statment.executeQuery(); 
         
            Statement atmp = con.createStatement();   
            JOptionPane.showMessageDialog(null, "Data Deleted ", "done", JOptionPane.INFORMATION_MESSAGE);
     
        } catch (Exception ex) {
            //Logger.getLogger(Store.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showConfirmDialog(null, ex.toString());
        }
                } else {
                    // User clicked "Cancel" or closed the dialog
                JOptionPane.showMessageDialog(null, "WRONG ENTRY");

                }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(EXHIBITION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EXHIBITION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EXHIBITION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EXHIBITION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EXHIBITION().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BACKE;
    private javax.swing.JButton SHOW;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
