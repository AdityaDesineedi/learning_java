package com.aditya.cj.day20;

import java.sql.*;

public class DBConnection {
    public static void main(String[] args) {

        Connection con = null;
        Statement st =null;
        ResultSet rs = null;

        try{
            con = DriverManager.getConnection("jdbc:postgresql://dpg-cg3m9b9mbg5fch5veac0-a.oregon-postgres.render.com/learning_sql_db_g8ls","dbuser","KofpfFXO00PThiZTaSRfKYPaTiCIvPcs");
            st = con.createStatement();
            rs = st.executeQuery("select name,amount from player");
            while(rs.next()){
                String name = rs.getString("name");
                double amount = rs.getDouble("amount");
                System.out.println(String.format("%s,%s",name,amount));
            }
        }catch (SQLException e){
            System.out.println("While getting player data :"+e);
        }finally {
            System.out.println("Closing Resources");
            try{
                if(rs!=null)
                    rs.close();
                if(st!=null)
                    st.close();
                if(con!=null)
                    con.close();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }
}
