/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sxc.saman.SIS.DAO;

import com.sxc.saman.SIS.DTO.TeacherDTO;
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
public class TeacherDAO {

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    PreparedStatement pstmt = null;

    public TeacherDAO() {
        con = new ConnectionFactory().getConnection();
    }

    public void addTeacher(TeacherDTO std) {
        String query = " Insert into teacher values(?,?,?,?,?,?,?,?,?,?)";
        try {
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, std.getTchId());
            pstmt.setString(2, std.getFirstName());
            pstmt.setString(3, std.getMiddleName());
            pstmt.setString(4, std.getLastName());
            pstmt.setString(5, std.getGender());
            pstmt.setString(6, std.getPerAddress());
            pstmt.setString(7, std.getTempAddress());
            pstmt.setString(8, std.getMobile());
            pstmt.setString(9, std.getEmail());
            pstmt.setString(10, std.getProgram());
           
            System.out.println("Added");
            if (pstmt.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "One record inserted");
            }else{
            JOptionPane.showMessageDialog(null, "One record inserted");}

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public TeacherDTO editTeacher(JTable table) {
        TeacherDTO std = new TeacherDTO();

        std.setTchId((Integer) table.getValueAt(table.getSelectedRow(), 0));
        std.setFirstName((String) table.getValueAt(table.getSelectedRow(), 1));
        std.setMiddleName((String) table.getValueAt(table.getSelectedRow(), 2));
        std.setLastName((String) table.getValueAt(table.getSelectedRow(), 3));
        std.setGender((String) table.getValueAt(table.getSelectedRow(), 4));
        std.setPerAddress((String) table.getValueAt(table.getSelectedRow(), 5));
        std.setTempAddress((String) table.getValueAt(table.getSelectedRow(), 6));
        std.setMobile((String) table.getValueAt(table.getSelectedRow(), 7));
        std.setEmail((String) table.getValueAt(table.getSelectedRow(), 8));
        std.setProgram((String) table.getValueAt(table.getSelectedRow(), 9));
       

        return std;
    }

    public void updateTeacher(TeacherDTO std) {
        String query = "Update teacher set firstname=?, middlename=?,lastname=?,gender=?,peraddress=?,tempaddress=?,email=?,mobile=?,program=? WHERE teacherid=?";

        try {
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, std.getFirstName());
            pstmt.setString(2, std.getMiddleName());
            pstmt.setString(3, std.getLastName());
            pstmt.setString(4, std.getGender());
            pstmt.setString(5, std.getPerAddress());
            pstmt.setString(6, std.getTempAddress());
            pstmt.setString(7, std.getEmail());
            pstmt.setString(8, std.getMobile());
            pstmt.setString(9, std.getProgram());
            
            pstmt.setInt(12, std.getTchId());
            if (pstmt.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "One record updated");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(String value) {
        String query = "Delete from student where teacherid=?";

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

    public ResultSet searchTeacher(String name, String value) {
        String query;
        if (name.equalsIgnoreCase("teacherid")) {
            query = "Select *From teacher Where " + name + "=" + value;
        } else {
            query = "Select *From teacher Where " + name + "='" + value + "'";
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

    public ResultSet getQueryResult() {
        String query = "Select * FROM teacher";
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
