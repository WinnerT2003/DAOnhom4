/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Controller.SubjectController;
import Entity.Subjectmodel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AD
 */
public class Quanlymonview extends javax.swing.JFrame {

    List<Subjectmodel>s = new ArrayList<>();
    DefaultTableModel tbmodel ;
    public Quanlymonview() {
        initComponents();
         tbmodel = (DefaultTableModel)jTable1.getModel();
        inittable();
        filltable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mamontxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        ADDbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tenmontxt = new javax.swing.JTextField();
        tctxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        DELbtn = new javax.swing.JButton();
        FINDbtn = new javax.swing.JButton();
        UPDATEbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mamontxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mamontxtActionPerformed(evt);
            }
        });

        jLabel1.setText("Mã môn");

        ADDbtn.setIcon(new javax.swing.ImageIcon("G:\\daucong.png")); // NOI18N
        ADDbtn.setText("Thêm");
        ADDbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDbtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Tên môn");

        jLabel3.setText("Số tín chỉ");

        DELbtn.setIcon(new javax.swing.ImageIcon("G:\\ảnh thùng rác.png")); // NOI18N
        DELbtn.setText("Xóa");
        DELbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELbtnActionPerformed(evt);
            }
        });

        FINDbtn.setIcon(new javax.swing.ImageIcon("G:\\kinhlup.png")); // NOI18N
        FINDbtn.setText("Tìm");
        FINDbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FINDbtnActionPerformed(evt);
            }
        });

        UPDATEbtn.setIcon(new javax.swing.ImageIcon("G:\\ảnh reload.png")); // NOI18N
        UPDATEbtn.setText("Cập nhật");
        UPDATEbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEbtnActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tenmontxt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(FINDbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mamontxt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)))
                        .addGap(61, 61, 61)
                        .addComponent(tctxt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(257, 257, 257))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(ADDbtn)
                        .addGap(74, 74, 74)
                        .addComponent(DELbtn)
                        .addGap(225, 225, 225)
                        .addComponent(UPDATEbtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mamontxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(tctxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tenmontxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DELbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FINDbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UPDATEbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ADDbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mamontxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mamontxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mamontxtActionPerformed

    private void DELbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELbtnActionPerformed
        int selected = jTable1.getSelectedRow();
      if(selected >= 0){
          Subjectmodel student = s.get(selected);
          int option = JOptionPane.showConfirmDialog(this, "Do you want to delete this item?");
          System.out.println("option : " + option);
          if(option == 0){
              SubjectController.delete(student.getMamon());
              JOptionPane.showMessageDialog(this, "xóa môn học thành công ");
              filltable();
          }
      }
    }//GEN-LAST:event_DELbtnActionPerformed

    private void FINDbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FINDbtnActionPerformed
         int ID = Integer.parseInt(mamontxt.getText());
        SubjectController sub = new SubjectController();
        s = sub.FindbyId(ID);
        tbmodel.setRowCount(0);
        for(Subjectmodel sinhvien: s){
           tbmodel.addRow(new Object[]{sinhvien.getMamon(),sinhvien.getTenmon(),sinhvien.getSotc()});
       }
    }//GEN-LAST:event_FINDbtnActionPerformed

    private void ADDbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDbtnActionPerformed
        int mamon = Integer.parseInt(mamontxt.getText());
        String tenmon = tenmontxt.getText();
        String ma = mamontxt.getText();
        String tc = tctxt.getText();
        int sotc = Integer.parseInt(tctxt.getText());
        SubjectController con = new SubjectController();
        int bien = con.getsizesubID(mamon);
        System.out.print(bien);
         if(bien != 0){
            JOptionPane.showMessageDialog(this, "mã môn này đã tồn tại ");
        }
        else if(tenmon.length() <= 0){
            JOptionPane.showMessageDialog(this, "nhập tên môn học ");
        }
        else if(tc.length() <= 0){
            JOptionPane.showMessageDialog(this, "số tín chỉ bị trống");
        }
        else if(sotc <= 0){
            JOptionPane.showMessageDialog(this, "số tín chỉ không hợp lệ");
        }
        else{ 
        Subjectmodel subb = new Subjectmodel(mamon,tenmon,sotc);
        JOptionPane.showMessageDialog(this, "Thêm môn học thành công"); 
        con.insert(subb);
        filltable();
        }
    }//GEN-LAST:event_ADDbtnActionPerformed

    private void UPDATEbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEbtnActionPerformed
        int mamon = Integer.parseInt(mamontxt.getText());
        String tenmon = tenmontxt.getText();
        int sotc = Integer.parseInt(tctxt.getText());
        Subjectmodel subb = new Subjectmodel(mamon,tenmon,sotc);
        SubjectController con = new SubjectController();
        int bien = con.getsizesubID(mamon);
        if(bien == 0){
          JOptionPane.showMessageDialog(this, "mã môn không tồn tại ");
        }
        else if(tenmon.length() <= 0){
            JOptionPane.showMessageDialog(this, "nhập tên môn học ");
        }
        else if(sotc <= 0){
            JOptionPane.showMessageDialog(this, "số tín chỉ không hợp lệ");
        }
        else{
        con.update(subb);
        filltable();
        }
    }//GEN-LAST:event_UPDATEbtnActionPerformed
    private void filltable()
    {
       tbmodel.setRowCount(0);
       SubjectController sub = new SubjectController();
       s = sub.getall();
       for(Subjectmodel sinhvien: s){
           tbmodel.addRow(new Object[]{sinhvien.getMamon(),sinhvien.getTenmon(),sinhvien.getSotc()});
       }
    }
    private void inittable()
    {
         String[] columns = new String[] {"Mã môn học", "Tên môn học", "số tín chỉ"};
        tbmodel.setColumnIdentifiers(columns);
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
            java.util.logging.Logger.getLogger(Quanlymonview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quanlymonview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quanlymonview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quanlymonview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quanlymonview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADDbtn;
    private javax.swing.JButton DELbtn;
    private javax.swing.JButton FINDbtn;
    private javax.swing.JButton UPDATEbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField mamontxt;
    private javax.swing.JTextField tctxt;
    private javax.swing.JTextField tenmontxt;
    // End of variables declaration//GEN-END:variables
}
