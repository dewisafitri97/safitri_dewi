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
public class MhsModel {
    String nim, nama, kd_jurusan, kd_matkul;
    
    Koneksi db = null;
    
    public MhsModel(){
        db = new Koneksi();
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKd_jurusan() {
        return kd_jurusan;
    }

    public void setKd_jurusan(String kd_jurusan) {
        this.kd_jurusan = kd_jurusan;
    }

    public String getKd_matkul() {
        return kd_matkul;
    }

    public void setKd_matkul(String kd_matkul) {
        this.kd_matkul = kd_matkul;
    }
    
    public List tampil(){
        List<MhsModel> data = new ArrayList<MhsModel>();
        ResultSet rs = null;
        
        try{
            String sql = "SELECT * FROM mhs order by nim asc";
            rs = db.ambilData(sql);
            while(rs.next()){
                MhsModel jm = new MhsModel();
                jm.setNim(rs.getString("nim"));
                jm.setNama(rs.getString("nama"));
                jm.setKd_jurusan(rs.getString("kd_jurusan"));
                jm.setKd_matkul(rs.getString("kd_matkul"));
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
        String sql = "INSERT INTO mhs VALUES ('"+nim+"','"+nama+"','"+kd_jurusan+"','"+
                kd_matkul+"')";
        db.simpanData(sql);
    }
    
     public void update(){
        String sql = "UPDATE mhs SET nama='"+nama+"',kd_jurusan='"+kd_jurusan+"',kd_matkul='"+kd_matkul+"'"
                + "WHERE nim='"+nim+"'";
        db.simpanData(sql);
        System.out.println(sql);
    }
    
    public List cariID(){
        List<MhsModel> data = new ArrayList<MhsModel>();
        ResultSet rs = null;
        try{
            String sql = "SELECT * FROM mhs WHERE nim='"+nim+"'";
            rs = db.ambilData(sql);
            while(rs.next()){
                MhsModel fm = new MhsModel();
                fm.setNim(rs.getString("nim"));
                fm.setNama(rs.getString("nama"));
                fm.setKd_jurusan(rs.getString("kd_jurusan"));
                fm.setKd_matkul(rs.getString("kd_matkul"));
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
        String sql="DELETE FROM mhs WHERE nim='"+nim+"'";
        db.simpanData(sql);
        System.out.println("");
    }
}
