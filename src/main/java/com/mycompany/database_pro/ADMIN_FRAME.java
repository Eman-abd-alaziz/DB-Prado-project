



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.database_pro;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*; 
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
public class ADMIN_FRAME extends javax.swing.JFrame {

     
        
    public ADMIN_FRAME() {
        
        initComponents();
        setSize(1083, 770);
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

        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        EMPLOYEE = new javax.swing.JButton();
        STORE = new javax.swing.JButton();
        CUSTOMER = new javax.swing.JButton();
        EXHIBITION = new javax.swing.JButton();
        GOODS = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jButton6.setText("jButton6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton7.setBackground(new java.awt.Color(204, 204, 204));
        jButton7.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        jButton7.setText("BACKE");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(110, 690, 120, 30);

        jLabel1.setFont(new java.awt.Font("Kristen ITC", 1, 20)); // NOI18N
        jLabel1.setText("CHOSEN ONE TO MAKE CHANGES ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(400, 70, 550, 50);

        jPanel1.setLayout(null);

        EMPLOYEE.setBackground(new java.awt.Color(255, 204, 102));
        EMPLOYEE.setFont(new java.awt.Font("Kristen ITC", 1, 16)); // NOI18N
        EMPLOYEE.setText("Employee");
        EMPLOYEE.setActionCommand("Employees");
        EMPLOYEE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EMPLOYEEActionPerformed(evt);
            }
        });
        jPanel1.add(EMPLOYEE);
        EMPLOYEE.setBounds(260, 60, 230, 50);

        STORE.setBackground(new java.awt.Color(255, 204, 102));
        STORE.setFont(new java.awt.Font("Kristen ITC", 1, 16)); // NOI18N
        STORE.setText("Store");
        STORE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STOREActionPerformed(evt);
            }
        });
        jPanel1.add(STORE);
        STORE.setBounds(260, 220, 230, 50);

        CUSTOMER.setBackground(new java.awt.Color(255, 204, 102));
        CUSTOMER.setFont(new java.awt.Font("Kristen ITC", 1, 16)); // NOI18N
        CUSTOMER.setText("Customers");
        CUSTOMER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CUSTOMERActionPerformed(evt);
            }
        });
        jPanel1.add(CUSTOMER);
        CUSTOMER.setBounds(260, 320, 230, 50);

        EXHIBITION.setBackground(new java.awt.Color(255, 204, 102));
        EXHIBITION.setFont(new java.awt.Font("Kristen ITC", 1, 16)); // NOI18N
        EXHIBITION.setText("Exhibition");
        EXHIBITION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXHIBITIONActionPerformed(evt);
            }
        });
        jPanel1.add(EXHIBITION);
        EXHIBITION.setBounds(260, 410, 230, 50);

        GOODS.setBackground(new java.awt.Color(255, 204, 102));
        GOODS.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        GOODS.setText("Goods");
        GOODS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GOODSActionPerformed(evt);
            }
        });
        jPanel1.add(GOODS);
        GOODS.setBounds(260, 140, 230, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(220, 140, 700, 500);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        jButton1.setText("REPORT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(920, 690, 120, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsz_1b.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-3, -4, 1080, 750);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EMPLOYEEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EMPLOYEEActionPerformed
dispose();// to close the curent frame
                    employeeFrame I = new employeeFrame();// next GUI....
                    I.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_EMPLOYEEActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
dispose();// to close the curent frame
                    Main_Screen A = new Main_Screen();// next GUI....
                    A.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void CUSTOMERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CUSTOMERActionPerformed
       dispose();// to close the curent frame
        CUSTOMER C = new CUSTOMER();// next GUI....
         C.setVisible(true);  
    }//GEN-LAST:event_CUSTOMERActionPerformed

    private void GOODSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GOODSActionPerformed
dispose();// to close the curent frame
                    Goods_Frame F = new Goods_Frame();// next GUI....
                    F.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_GOODSActionPerformed

    private void STOREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STOREActionPerformed
dispose();// to close the curent frame
                    Store E = new Store();// next GUI....
                    E.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_STOREActionPerformed

    private void EXHIBITIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXHIBITIONActionPerformed
dispose();// to close the curent frame
                    exhibitionFrame  Q = new exhibitionFrame();// next GUI....
                    Q.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_EXHIBITIONActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
Connection con;
InputStream input;
JasperDesign jd;
JasperReport jr;
JasperPrint jp;
OutputStream output;
   try {
             DriverManager.registerDriver(new org.postgresql.Driver());
            String conINFO ="jdbc:postgresql://localhost:5432/postgres";
           con = DriverManager.getConnection(conINFO,"eman","123456");
    input=new FileInputStream(new File("prado.jrxml"));
            jd=JRXmlLoader.load(input);
     jr=JasperCompileManager.compileReport(jd);
    jp=JasperFillManager.fillReport(jr,null,con);
    output=new FileOutputStream(new File("report"));
    JasperExportManager.exportReportToPdfStream(jp,output);
    output.close();
    input.close();
    con.close(); 
        } catch (Exception ex) {
            //Logger.getLogger(Store.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showConfirmDialog(null, ex.toString());
        }


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        JFrame frame = new JFrame("My first JFrame");
                frame.setSize(1030, 700);

        
        
        java.awt.EventQueue.invokeLater(() -> {
            new ADMIN_FRAME().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CUSTOMER;
    private javax.swing.JButton EMPLOYEE;
    private javax.swing.JButton EXHIBITION;
    private javax.swing.JButton GOODS;
    private javax.swing.JButton STORE;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
