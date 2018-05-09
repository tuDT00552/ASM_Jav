/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Pet;
import entity.Seller;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author duong
 */
public class Petshopmodel {
    public boolean saveSeller(Seller seller) {
        try {
            String sqlString = "insert into seller(SellerName , SellerAge , SellerPhone, SellerAddress) values (?, ?, ?, ?)";
            PreparedStatement ps = ConnectionHandle.getInstance().getConnection().prepareStatement(sqlString);
            ps.setString(1, seller.getName());
            ps.setInt(2, seller.getAge());
            ps.setInt(3, seller.getNumberphone());
            ps.setString(4, seller.getAddress());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Thành công!");
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("Lỗi khi làm việc với database, vui lòng thử lại");
        }
        return false;
    }
    
    public boolean saveEditSeller(Seller seller) {
        try {
            String sqlString = "UPDATE seller SET SellerName = ?, SellerAge = ?, SellerPhone = ?, SellerAddress = ? WHERE IDSeller = ?;";
            PreparedStatement ps = ConnectionHandle.getInstance().getConnection().prepareStatement(sqlString);
            System.out.println(sqlString);
            ps.setString(1, seller.getName());
            ps.setInt(2, seller.getAge());
            ps.setInt(3, seller.getNumberphone());
            ps.setString(4, seller.getAddress());
            ps.setInt(5, seller.getId());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Sửa thành công!");
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("Lỗi khi làm việc với database, vui lòng thử lại");
        }
        return false;
    }
    
    public boolean deleteSeller(Seller seller) {
        try {
            String sqlString = "DELETE FROM seller WHERE IDSeller = ?";
            PreparedStatement ps = ConnectionHandle.getInstance().getConnection().prepareStatement(sqlString);
            ps.setInt(1, seller.getId());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Xoá thành công!");
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("Lỗi khi làm việc với database, vui lòng thử lại");
        }
        return false;
    }
    
    
    public boolean savePet(Pet pet) {
        try {
            String sqlString = "insert into pet(PetName , PetInfo , ContactNumber, Price) values (?, ?, ?, ?)";
            PreparedStatement ps = ConnectionHandle.getInstance().getConnection().prepareStatement(sqlString);
            ps.setString(1, pet.getName());
            ps.setString(2, pet.getInfopet());
            ps.setInt(3, pet.getContactnumber());
            ps.setInt(4, pet.getPrice());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Thành công!");
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("Lỗi khi làm việc với database, vui lòng thử lại");
        }
        return false;
    }
    
    public ArrayList<Seller> loadSeller() {
        ArrayList<Seller> list = new ArrayList<>();
        try {
            String sqlString = "select * from seller";
            PreparedStatement ps = ConnectionHandle.getInstance().getConnection().prepareStatement(sqlString);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                int ID = rs.getInt("IDSeller");  
                String SellerName = rs.getString("SellerName");
                int SellerAge = rs.getInt("SellerAge");
                int SellerPhone = rs.getInt("SellerPhone");              
                String SellerAddress = rs.getString("SellerAddress");
                Seller seller = new Seller(SellerName, SellerAge, SellerPhone, SellerAddress);
                seller.setId(ID);
                list.add(seller);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("Lỗi khi làm việc với database, vui lòng thử lại");
        }
        return list;
    }
}
