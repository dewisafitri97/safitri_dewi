/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal2.model;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author A456UR
 */
public class FakultasModel {
    String kd_fakultas, nama_fakultas;
    
    Koneksi db = null;
    
    public FakultasModel(){
        db  = new Koneksi();
    }

    public String getKd_fakultas() {
        return kd_fakultas;
    }

    public void setKd_fakultas(String kd_fakultas) {
        this.kd_fakultas = kd_fakultas;
    }

    public String getNama_fakultas() {
        return nama_fakultas;
    }

    public void setNama_fakultas(String nama_fakultas) {
        this.nama_fakultas = nama_fakultas;
    }
    
    public List tampil(){
        List<FakultasModel> data = new ArrayList<FakultasModel>();
        ResultSet rs = null;
        
        try{
            String sql = "SELECT * FROM fakultas order by kd_fakultas asc";
            rs = db.ambilData(sql);
            while(rs.next()){
                FakultasModel fm = new FakultasModel();
                fm.setKd_fakultas(rs.getString("kd_fakultas"));
                fm.setNama_fakultas(rs.getString("nama_fakultas"));
                data.add(fm);
            }
            db.disKonek(rs);
        }
        catch (Exception e){
            System.out.println("Gagal tampil : "+e);
        }
       return data;
    }
    
    public void simpan(){
        String sql = "INSERT INTO fakultas VALUES ('"+kd_fakultas+"','"+nama_fakultas+"')";
        db.simpanData(sql);
    }
    
    public void update(){
        String sql = "UPDATE fakultas SET nama_fakultas='"+nama_fakultas+"' "
                + "WHERE kd_fakultas='"+kd_fakultas+"'";
        db.simpanData(sql);
        System.out.println(sql);
    }
    
    public List cariID(){
        List<FakultasModel> data = new ArrayList<FakultasModel>();
        ResultSet rs = null;
        try{
            String sql = "SELECT * FROM fakultas WHERE kd_fakultas='"+kd_fakultas+"'";
            rs = db.ambilData(sql);
            while(rs.next()){
                FakultasModel fm = new FakultasModel();
                fm.setKd_fakultas(rs.getString("kd_fakultas"));
                fm.setNama_fakultas(rs.getString("nama_fakultas"));
                data.add(fm);
            }
            db.disKonek(rs);
            
        }
        catch(Exception e){
            System.err.println("Gagal melakukan cariID : "+e);
        }
        return data;
    }
    
     public void hapus(){
        String sql="DELETE FROM fakultas WHERE kd_fakultas='"+kd_fakultas+"'";
        db.simpanData(sql);
        System.out.println("");
    }
}
