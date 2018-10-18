/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dewi.model;

import com.mysql.jdbc.Statement;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author A456UR
 */
public class Koneksi {
    private Connection conn;
    private Statement stat;
    
    public static void ambilKoneksi(){
        try{
            String db = "jdbc:mysql://localhost:3306/penjualanSP";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection(db,user,pass);
        }
        catch (Exception e){
            System.out.println("Terjadi Kesalahan Ambil Koneksi : "+e);
        }
    }
        
        public void koneksi(){
            try{
                String db = "jdbc:mysql://localhost:3306/penjualanSP";
                String user = "root";
                String pass = "";
                Class.forName("com.mysql.jdbc.Driver");
                conn = (Connection) DriverManager.getConnection(db,user,pass);
                stat = (Statement) conn.createStatement();
            }
            catch (Exception e){
                System.out.println("Terjadi Kesalahan koneksi : "+e);
            }
        }
        
        public void disKonek(ResultSet rs){
            try{
                if(rs != null){
                    rs.close();
                }
                stat.close();
                conn.close();
            }
            catch (Exception e){
                System.out.println("Terjadi Kesalahan disKoneksi : "+e);
            }
        }
        
        public ResultSet ambilData(String sql){
            ResultSet rs = null;
            try{
                koneksi();
                rs = stat.executeQuery(sql);
            }
            catch (Exception e){
                System.out.println("Terjadi Kesalahan ambilData : "+e);
            }
            return rs;
        }
        
        public void simpanData(String sql){
            try{
                koneksi();
                stat.executeUpdate(sql);
            }
            catch(Exception e){
                System.out.println("Terjadi Kesalahan simpanData : "+e);
            }
        }
    }
    

