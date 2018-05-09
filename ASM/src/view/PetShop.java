/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import entity.Seller;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.ConnectionHandle;
import model.Petshopmodel;
/**
 *
 * @author duong
 */
public class PetShop extends javax.swing.JFrame {
    DefaultTableModel SellerTable;
    /**
     * Creates new form PetShop
     */
    public PetShop() {
        initComponents();
        SellerTable = (DefaultTableModel) sellerTable.getModel();
        ShowsellerInfo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sellerTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        sellerName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sellerAge = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        sellerPhone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        sellerAddress = new javax.swing.JTextField();
        sellerAdd = new javax.swing.JButton();
        sellerReset = new javax.swing.JButton();
        X2 = new javax.swing.JButton();
        sellerEdit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        sellerSaveEdit = new javax.swing.JButton();
        sellerDelete = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        inpsellerSearch = new javax.swing.JTextField();
        btnsellerSearch = new javax.swing.JButton();
        sellerReload = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("NGƯỜI BÁN HÀNG HIỆN CÓ");

        sellerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tên Người Bán", "Tuổi Người Bán", "Số Điện Thoại", "Địa Chỉ"
            }
        ));
        sellerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sellerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(sellerTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("THAO TÁC");

        sellerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellerNameActionPerformed(evt);
            }
        });

        jLabel3.setText("Tên người bán:");

        jLabel4.setText("Tuổi:");

        jLabel5.setText("Số điện thoại:");

        sellerPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellerPhoneActionPerformed(evt);
            }
        });

        jLabel6.setText("Địa chỉ:");

        sellerAdd.setText("Thêm Mới");
        sellerAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellerAddActionPerformed(evt);
            }
        });

        sellerReset.setText("Nhập Lại");
        sellerReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellerResetActionPerformed(evt);
            }
        });

        X2.setText("Hoàn Tất");
        X2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                X2ActionPerformed(evt);
            }
        });

        sellerEdit.setText("Sửa");
        sellerEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellerEditActionPerformed(evt);
            }
        });

        jLabel7.setText("THÊM DỮ LIỆU");

        jLabel8.setText("SỬA DỮ LIỆU");

        sellerSaveEdit.setText("Lưu Thay Đổi");
        sellerSaveEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellerSaveEditActionPerformed(evt);
            }
        });

        sellerDelete.setText("XOÁ");
        sellerDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellerDeleteActionPerformed(evt);
            }
        });

        jLabel15.setText("TÌM KIẾM");

        inpsellerSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inpsellerSearchActionPerformed(evt);
            }
        });

        btnsellerSearch.setText("SEARCH");
        btnsellerSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsellerSearchActionPerformed(evt);
            }
        });

        sellerReload.setText("Reload");
        sellerReload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellerReloadActionPerformed(evt);
            }
        });

        jLabel10.setText("XOÁ DỮ LIỆU");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sellerName)
                            .addComponent(sellerAge)
                            .addComponent(sellerPhone)
                            .addComponent(sellerAddress)))
                    .addComponent(sellerDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inpsellerSearch)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnsellerSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sellerReload, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                    .addComponent(sellerEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(sellerSaveEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(sellerAdd)
                                        .addGap(18, 18, 18)
                                        .addComponent(X2)
                                        .addGap(18, 18, 18)
                                        .addComponent(sellerReset))
                                    .addComponent(jLabel15)))
                            .addComponent(jLabel10))
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sellerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(sellerAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(sellerPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(sellerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sellerAdd)
                    .addComponent(X2)
                    .addComponent(sellerReset))
                .addGap(13, 13, 13)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sellerEdit)
                    .addComponent(sellerSaveEdit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sellerDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inpsellerSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsellerSearch)
                    .addComponent(sellerReload))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Quản Lí Người Bán Hàng", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sellerPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellerPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sellerPhoneActionPerformed

    private void sellerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sellerNameActionPerformed
   
    private void sellerAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellerAddActionPerformed
        saveSellerForm();
        resetForm();
    }//GEN-LAST:event_sellerAddActionPerformed

    private void sellerResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellerResetActionPerformed
        resetForm();
    }//GEN-LAST:event_sellerResetActionPerformed

    private void X2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_X2ActionPerformed
        saveSellerForm();
    }//GEN-LAST:event_X2ActionPerformed

    private void sellerEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellerEditActionPerformed
        getInfoSellerEdit();
    }//GEN-LAST:event_sellerEditActionPerformed

    private void sellerDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellerDeleteActionPerformed
        sellerDel();
    }//GEN-LAST:event_sellerDeleteActionPerformed

    private void inpsellerSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inpsellerSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inpsellerSearchActionPerformed

    private void btnsellerSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsellerSearchActionPerformed
        try {
            searchSeller();
        } catch (SQLException ex) {
            
        }
    }//GEN-LAST:event_btnsellerSearchActionPerformed

    private void sellerReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellerReloadActionPerformed
        ShowsellerInfo();
        resetForm();
    }//GEN-LAST:event_sellerReloadActionPerformed

    private void sellerSaveEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellerSaveEditActionPerformed
        saveSellerEdit();
    }//GEN-LAST:event_sellerSaveEditActionPerformed

    private void sellerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellerTableMouseClicked
        getInfoSellerEdit();
    }//GEN-LAST:event_sellerTableMouseClicked

    public void searchSeller() throws SQLException {
        ArrayList<Seller> list = new ArrayList<>();
        String input = inpsellerSearch.getText();
        
        String sqlString = "SELECT * FROM Seller WHERE SellerAddress LIKE ? OR SellerName LIKE ? OR SellerAge LIKE ? OR IDSeller LIKE ? OR SellerPhone LIKE ?;";
        PreparedStatement ps = ConnectionHandle.getInstance().getConnection().prepareStatement(sqlString);
        ps.setString(1, input);
        ps.setString(2, input);
        ps.setString(3, input);
        ps.setString(4, input);
        ps.setString(5, input);
        ps.execute();
        ResultSet rs = ps.executeQuery();
        while(rs.next()) {
                int ID = rs.getInt("IDSeller");  
                String SellerName = rs.getString("SellerName");
                int SellerAge = rs.getInt("SellerAge");
                int SellerPhone = rs.getInt("SellerPhone");              
                String SellerAddress = rs.getString("SellerAddress");
                SellerTable.setNumRows(0);
                Seller sellers = new Seller(SellerName, SellerAge, SellerPhone, SellerAddress);
                sellers.setId(ID);
                list.add(sellers);
                for (int i = 0; i < list.size(); i++) {
                    Object[] object = {list.get(i).getId(), list.get(i).getName(), list.get(i).getAge(), list.get(i).getNumberphone(), list.get(i).getAddress()};
                    SellerTable.addRow(object);
                }
  
            }

    }
    
    public void sellerDel() {
        int r = sellerTable.getSelectedRow();
        Petshopmodel model = new Petshopmodel();
        Seller seller = new Seller();
        seller.setId(Integer.parseInt(SellerTable.getValueAt(r, 0).toString()));
        model.deleteSeller(seller);
        ShowsellerInfo();
    }
    
    public void saveSellerEdit() {
        int r = sellerTable.getSelectedRow();
        int Id = Integer.parseInt(SellerTable.getValueAt(r, 0).toString());
        String SellerName = sellerName.getText();
        int Age = Integer.parseInt(sellerAge.getText());
        int SellerPhone = Integer.parseInt(sellerPhone.getText());
        String SellerAddress = sellerAddress.getText();
        Petshopmodel model = new Petshopmodel();
        Seller seller = new Seller(SellerName, Age, SellerPhone, SellerAddress);
        seller.setId(Id);
        model.saveEditSeller(seller);
        ShowsellerInfo();
        resetForm();
    }
    

    
    public void getInfoSellerEdit() {
        int r = sellerTable.getSelectedRow();
        if(r != 1){
            sellerName.setText(SellerTable.getValueAt(r, 1).toString());
            sellerAge.setText(SellerTable.getValueAt(r, 2).toString());
            sellerPhone.setText(SellerTable.getValueAt(r, 3).toString());
            sellerAddress.setText(SellerTable.getValueAt(r, 4).toString());
        }
    }
    
    public void saveSellerForm() {
        String SellerName = sellerName.getText();
        int Age = Integer.parseInt(sellerAge.getText());
        int SellerPhone = Integer.parseInt(sellerPhone.getText());
        String SellerAddress = sellerAddress.getText();
        Petshopmodel model = new Petshopmodel();
        Seller seller = new Seller(SellerName, Age, SellerPhone, SellerAddress);
        model.saveSeller(seller);
        ShowsellerInfo();
    }
    
    public void resetForm() {
        sellerName.setText("");
        sellerAge.setText("");
        sellerPhone.setText("");
        sellerAddress.setText("");
        inpsellerSearch.setText("");
    }
    
    public void ShowsellerInfo () {
        Petshopmodel model = new Petshopmodel();
        SellerTable.setNumRows(0);
        ArrayList<Seller> list = model.loadSeller();
        for (Seller seller : list) {
            Object[] object = {seller.getId(), seller.getName(), seller.getAge(), seller.getNumberphone(), seller.getAddress()};
            SellerTable.addRow(object);
        }
    }
    
    public void ShowSearchSeller(Seller sellers) {
        System.out.println(sellers.getAddress());
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
            java.util.logging.Logger.getLogger(PetShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PetShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PetShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PetShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new PetShop().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton X2;
    private javax.swing.JButton btnsellerSearch;
    private javax.swing.JTextField inpsellerSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JButton sellerAdd;
    private javax.swing.JTextField sellerAddress;
    private javax.swing.JTextField sellerAge;
    private javax.swing.JButton sellerDelete;
    private javax.swing.JButton sellerEdit;
    private javax.swing.JTextField sellerName;
    private javax.swing.JTextField sellerPhone;
    private javax.swing.JButton sellerReload;
    private javax.swing.JButton sellerReset;
    private javax.swing.JButton sellerSaveEdit;
    private javax.swing.JTable sellerTable;
    // End of variables declaration//GEN-END:variables
}
