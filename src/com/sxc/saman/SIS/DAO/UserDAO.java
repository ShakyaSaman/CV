/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sxc.saman.SIS.DAO;

import com.sxc.saman.SIS.DTO.UserDTO;
import com.sxc.saman.SIS.Database.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dipesh
 */
public class UserDAO {

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    PreparedStatement pstmt = null;
    boolean isokay;

    public UserDAO() {
        con = new ConnectionFactory().getConnection();
    }

    public void addUser(UserDTO user) {
        String query = " Insert into user values(?,?,?,?,?,?,?,?,?,?,?)";
        try {
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, user.getUserId());
            pstmt.setString(2, user.getUsername());
            pstmt.setString(3, user.getFirstname());
            pstmt.setString(4, user.getMiddlename());
            pstmt.setString(5, user.getLastname());
            pstmt.setString(6, user.getPassword());
            pstmt.setString(7, user.getPeraddress());
            pstmt.setString(8, user.getTempaddress());
            pstmt.setString(9, user.getContact());
            pstmt.setString(10, user.getEmail());
            pstmt.setString(11, user.getRole());


            if (pstmt.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "One record inserted");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public UserDTO editUser(JTable table) {
        UserDTO user = new UserDTO();

        user.setUserId((Integer) table.getValueAt(table.getSelectedRow(), 0));
        user.setUsername((String) table.getValueAt(table.getSelectedRow(), 1));
        user.setFirstname((String) table.getValueAt(table.getSelectedRow(), 2));
        user.setMiddlename((String) table.getValueAt(table.getSelectedRow(), 3));
        user.setLastname((String) table.getValueAt(table.getSelectedRow(), 4));
        user.setPeraddress((String) table.getValueAt(table.getSelectedRow(), 5));
        user.setTempaddress((String) table.getValueAt(table.getSelectedRow(), 6));
        user.setContact((String) table.getValueAt(table.getSelectedRow(), 7));
        user.setEmail((String) table.getValueAt(table.getSelectedRow(), 8));
        user.setRole((String) table.getValueAt(table.getSelectedRow(), 9));

        return user;
    }

    public void updateUser(UserDTO user) {
        String query = "Update user set firstname=?, middlename=?,lastname=?,peraddress=?,tempaddress=?,contact=?,email=?,role=? WHERE userid=?";

        try {
            pstmt = con.prepareStatement(query);

            pstmt.setString(1, user.getFirstname());
            pstmt.setString(2, user.getMiddlename());
            pstmt.setString(3, user.getLastname());
            pstmt.setString(4, user.getPeraddress());
            pstmt.setString(5, user.getTempaddress());
            pstmt.setString(6, user.getContact());
            pstmt.setString(7, user.getEmail());
            pstmt.setString(8,user.getRole());
            pstmt.setInt(9, user.getUserId());
            

            if (pstmt.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "One record successfully updated");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(String value) {
        String query = "Delete from user where userid=?";

        try {
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, Integer.parseInt(value));
            if (pstmt.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "One record deleted successfully");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public ResultSet searchUser(String name, String value) {
        String query;
        if (name.equalsIgnoreCase("userid")) {
            query = "Select userid,username,firstname,middlename,lastname,peraddress,tempaddress,contact,email From User Where " + name + "=" + value;
        } else {
            query = "Select userid,username,firstname,middlename,lastname,peraddress,tempaddress,contact,email From User Where " + name + "='" + value + "'";
        }
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "Search not found");
            } else {
                rs.beforeFirst();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return rs;
    }

    public boolean changePassword(String username, String newPass, String oldPass) {
        isokay = false;
        String query = "UPDATE user set password=? where username=? AND password=?";
        try {
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, newPass);
            pstmt.setString(2, username);
            pstmt.setString(3, oldPass);
            if (pstmt.executeUpdate() > 0) {
                isokay = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isokay;
    }

    public ResultSet getQueryResult() {
        String query = "Select userid,username,firstname,middlename,lastname,peraddress,tempaddress,contact,email,role FROM user;";
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public DefaultTableModel builtTableModel(ResultSet rs) throws SQLException {
        ResultSetMetaData metaData = rs.getMetaData();
        Vector<String> columnName = new Vector<String>();

        int columnCount = metaData.getColumnCount();

        for (int column = 1; column <= columnCount; column++) {
            columnName.add(metaData.getColumnName(column));
        }

        Vector<Vector<Object>> data = new Vector<Vector<Object>>();
        while (rs.next()) {
            Vector<Object> vector = new Vector<Object>();
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                vector.add(rs.getObject(columnIndex));
            }
            data.add(vector);
        }
        return new DefaultTableModel(data, columnName);
    }

    public Vector<String> getColumnNames(ResultSet rs) {
        Vector<String> columnName = new Vector<String>();
        try {
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            for (int column = 1; column <= columnCount; column++) {
                columnName.add(metaData.getColumnName(column));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return columnName;
    }
}
