package com.aditya.cj.jdbc;

import java.sql.*;

public class JdbcConnectionExample {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try{
            conn = ConnectionUtil.getConnection();
            st = conn.createStatement();
            rs = st.executeQuery("select name,role,amount from player");

            while (rs.next()){
                String name = rs.getString("name");
                String role = rs.getString("role");
                double amount = rs.getDouble("amount");
                System.out.println(name+","+role+","+amount);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            ConnectionUtil.close(rs,st,conn);
        }
    }
}
