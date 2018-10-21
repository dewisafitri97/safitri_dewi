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
public class JurusanModel {
    String kd_jurusan, nama_jurusan, kaprodi,kd_fakultas;
    
    Koneksi db = null;
    
    public JurusanModel(){
        db = new Koneksi();
    }

    public String getKd_jurusan() {
        return kd_jurusan;
    }

    public void setKd_jurusan(String kd_jurusan) {
        this.kd_jurusan = kd_jurusan;
    }

    public String getNama_jurusan() {
        return nama_jurusan;
    }

    public void setNama_jurusan(String nama_jurusan) {
        this.nama_jurusan = nama_jurusan;
    }

    public String getKaprodi() {
        return kaprodi;
    }

    public void setKaprodi(String kaprodi) {
        this.kaprodi = kaprodi;
    }

    public String getKd_fakultas() {
        return kd_fakultas;
    }

    public void setKd_fakultas(String kd_fakultas) {
        this.kd_fakultas = kd_fakultas;
    }
    
    public List tampil(){
         List<JurusanModel> data = new ArrayList<JurusanModel>();
        ResultSet rs = null;
        
        try{
            String sql = "SELECT * FROM jurusan order by kd_jurusan asc";
            rs = db.ambilData(sql);
            while(rs.next()){
                JurusanModel jm = new JurusanModel();
                jm.setKd_jurusan(rs.getString("kd_jurusan"));
                jm.setNama_jurusan(rs.getString("nama_jurusan"));
                jm.setKaprodi(rs.getString("kaprodi"));
                jm.setKd_fakultas(rs.getString("kd_fakultas"));
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
        String sql = "INSERT INTO jurusan VALUES('"+kd_jurusan+"','"+nama_jurusan+"','"+kaprodi+"','"+
                kd_fakultas+"')";
        db.simpanData(sql);
                
    }
    
     public void update(){
        String sql = "UPDATE jurusan SET nama_jurusan='"+nama_jurusan+"',kaprodi='"+kaprodi+"',kd_fakultas='"+kd_fakultas+"'"
                + "WHERE kd_jurusan='"+kd_jurusan+"'";
        db.simpanData(sql);
        System.out.println(sql);
    }
    
    public List cariID(){
        List<JurusanModel> data = new ArrayList<JurusanModel>();
        ResultSet rs = null;
        try{
            String sql = "SELECT * FROM jurusan WHERE kd_jurusan='"+kd_jurusan+"'";
            rs = db.ambilData(sql);
            while(rs.next()){
                JurusanModel fm = new JurusanModel();
                fm.setKd_jurusan(rs.getString("kd_jurusan"));
                fm.setNama_jurusan(rs.getString("nama_jurusan"));
                fm.setKaprodi(rs.getString("kaprodi"));
                fm.setKd_fakultas(rs.getString("kd_fakultas"));
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
        String sql="DELETE FROM jurusan WHERE kd_jurusan='"+kd_jurusan+"'";
        db.simpanData(sql);
        System.out.println("");
    }
}
