/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal2.model;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author A456UR
 */
public class Koneksi {
    private Connection conn;
    private Statement st;
    
    public static void ambilKoneksi(){
        try{
            String db = "jdbc:msql://localhost:3306/univdb";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection(db,user,pass);
        }
        catch (Exception e){
            System.err.println("GAGAL ambilKoneksi : "+e);
        }
    }
    
    public void koneksi(){
        try{
            String db = "jdbc:mysql://localhost:3306/univdb";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(db,user,pass);
            st = conn.createStatement();
        }
        catch (Exception e){
            System.out.println("Gagal Melakukan koneksi : "+e);
        }
    }
    
    public void disKonek(ResultSet rs){
        try{
            if(rs != null){
                rs.close();
            }
            st.close();
            conn.close();
        }
        catch(Exception e){
            System.out.println("GAGAL disKoeksi : "+e);
        }
    }
    
    public ResultSet ambilData(String sql){
        ResultSet rs = null;
        try{
            koneksi();
            rs = st.executeQuery(sql);
        }
        catch (Exception e){
            System.err.println("Gagal ambilData : "+e);
        }
        return rs;
    }
    
    public void simpanData(String sql){
        try{
            koneksi();
            st.executeUpdate(sql);
        }
        catch(Exception e ){
            System.err.println("Gagal simpanData : "+e);
        }
    }
    
}
