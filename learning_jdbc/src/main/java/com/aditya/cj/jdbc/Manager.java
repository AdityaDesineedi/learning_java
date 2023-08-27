package com.aditya.cj.jdbc;

import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class Manager {
    public static void main(String[] args) throws IOException {
        Properties pros = new Properties();
        pros.load(Manager.class.getResourceAsStream("/db.properties"));

        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try{
            conn = DriverManager.getConnection(pros.getProperty("db.url"),pros.getProperty("db.username"),pros.getProperty("db.password"));
            st = conn.createStatement();
            rs = st.executeQuery("select name,role,amount from player");

            while (rs.next()){
                String name = rs.getString("name");
                String role = rs.getString("role");
                double amount = rs.getDouble("amount");
                System.out.println(name+","+role+","+amount);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);

        }finally {
            try{
                if(rs!=null) {
                    rs.close();
                }
                if(st!=null){
                    st.close();
                }
                if(conn!=null)
                    conn.close();
                }catch (SQLException e){
                    e.printStackTrace();
            }
        }
    }
}
