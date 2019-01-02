/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sxc.saman.SIS.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author manish
 */
public class ConnectionFactory {

    Connection con = null;
    Statement stmt = null;
    PreparedStatement pst = null;
    ResultSet res = null;
    boolean istrue = false;

    public ConnectionFactory() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/student","root","");
            stmt = con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/student","root","");
            stmt = con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
    public boolean checkLogin(String username, String password,String role){
        String query="SELECT * FROM user where username=? AND password= ? AND role=?";
        try{
            pst=con.prepareStatement(query);
            pst.setString(1, username);
            pst.setString(2, password);
            pst.setString(3,role);
            res=pst.executeQuery();
            while(res.next()){
                istrue=true;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return istrue;
    }
}
