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
public class MatkulModel {
    String kd_matkul, nama_matkul, sks;
    
    Koneksi db = null;
    
    public MatkulModel(){
        db = new Koneksi();
    }

    public String getKd_matkul() {
        return kd_matkul;
    }

    public void setKd_matkul(String kd_matkul) {
        this.kd_matkul = kd_matkul;
    }

    public String getNama_matkul() {
        return nama_matkul;
    }

    public void setNama_matkul(String nama_matkul) {
        this.nama_matkul = nama_matkul;
    }

    public String getSks() {
        return sks;
    }

    public void setSks(String sks) {
        this.sks = sks;
    }
    
    public List tampil(){
        List<MatkulModel> data = new ArrayList<MatkulModel>();
        ResultSet rs = null;
        
        try{
            String sql = "SELECT * FROM matkul order by kd_matkul asc";
            rs = db.ambilData(sql);
            while(rs.next()){
                MatkulModel jm = new MatkulModel();
                jm.setKd_matkul(rs.getString("kd_matkul"));
                jm.setNama_matkul(rs.getString("nama_matkul"));
                jm.setSks(rs.getString("sks"));
                data.add(jm);
            }
            db.disKonek(rs);
        }
        catch (Exception e){
            System.out.println("Gagal tampil : "+e);
        }
       return data;
    }
    
    public void simpan(){
        String sql = "INSERT INTO matkul VALUES('"+kd_matkul+"','"+nama_matkul+"','"+
                sks+"')";
        db.simpanData(sql);
    }
    
    public void update(){
        String sql = "UPDATE matkul SET nama_matkul='"+nama_matkul+"'"
                + "WHERE kd_matkul='"+kd_matkul+"'";
        db.simpanData(sql);
        System.out.println(sql);
    }
    
    public List cariID(){
        List<MatkulModel> data = new ArrayList<MatkulModel>();
        ResultSet rs = null;
        try{
            String sql = "SELECT * FROM matkul WHERE kd_matkul='"+kd_matkul+"'";
            rs = db.ambilData(sql);
            while(rs.next()){
                MatkulModel fm = new MatkulModel();
                fm.setKd_matkul(rs.getString("kd_matkul"));
                fm.setNama_matkul(rs.getString("nama_matkul"));
                fm.setSks(rs.getString("sks"));
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
        String sql="DELETE FROM matkul WHERE kd_matkul='"+kd_matkul+"'";
        db.simpanData(sql);
        System.out.println("");
    }
}
