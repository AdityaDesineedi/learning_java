package com.aditya.cj.jdbc;

import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public final class ConnectionUtil {
    private static Properties properties;

    private ConnectionUtil(){

    }
    static {
        properties = new Properties();
        try {
            properties.load(Manager.class.getResourceAsStream("/db.properties"));
        } catch (IOException e) {
            System.out.println("While loading properties");
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){
        Connection conn = null;

        try{
            conn = DriverManager.getConnection(properties.getProperty("db.url"),
                    properties.getProperty("db.username"),
                    properties.getProperty("db.password"));

        }catch (SQLException e){
            e.printStackTrace();
        }
        return conn;
    }

    public static void close(ResultSet rs, Statement st, Connection conn){
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
            System.out.println("While closing resources :" +e);
        }
    }
}
