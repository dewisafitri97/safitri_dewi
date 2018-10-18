/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dewi.model;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author A456UR
 */
public class UserModel_master {
    String kd_brg,nama_brg,harga_jual,harga_beli,satuan, kategori,stok_brg;

    

   
    Koneksi db = null;
    
    
    
    public UserModel_master(){
        db = new Koneksi();
    }

    public String getKd_brg() {
        return kd_brg;
    }

    public void setKd_brg(String kd_brg) {
        this.kd_brg = kd_brg;
    }

    public String getNama_brg() {
        return nama_brg;
    }

    public void setNama_brg(String nama_brg) {
        this.nama_brg = nama_brg;
    }

    public String getHarga_jual() {
        return harga_jual;
    }

    public void setHarga_jual(String harga_jual) {
        this.harga_jual = harga_jual;
    }

    public String getHarga_beli() {
        return harga_beli;
    }

    public void setHarga_beli(String harga_beli) {
        this.harga_beli = harga_beli;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
    
    public String getStok_brg() {
        return stok_brg;
    }

    public void setStok_brg(String stok_brg) {
        this.stok_brg = stok_brg;
    }
    
    
    
    public List tampil(){
        List<UserModel_master> data = new ArrayList<UserModel_master>();
        ResultSet rs = null;
        try{
            String sql = "Select * from master order by kd_brg asc";
            rs = db.ambilData(sql);
            while (rs.next()){
                UserModel_master umm = new UserModel_master();
                umm.setKd_brg(rs.getString("kd_brg"));
                umm.setNama_brg(rs.getString("nama_brg"));
                umm.setHarga_jual(rs.getString("harga_jual"));
                umm.setHarga_beli(rs.getString("harga_beli"));
                umm.setSatuan(rs.getString("satuan"));
                umm.setKategori(rs.getString("kategori"));
                umm.setStok_brg(rs.getString("stok_brg"));
                
                data.add(umm);
            }
        }
        catch (Exception e){
            System.out.println("Terjadi Kesalahan tampil DATA : "+e);
        }
        return data;
    }
    
    public void simpan(){
        String sql ="INSERT INTO master values('"+kd_brg+"','"+nama_brg+"','"+
                harga_jual+"','"+harga_beli+"','"+satuan+"','"+kategori+"','"+stok_brg+"')";
        db.simpanData(sql);
    }
    
    public void Update(){
        String sql = "UPDATE master SET nama_brg='"+nama_brg+"',harga_jual='"+harga_jual+"',"
                + "harga_beli='"+harga_beli+"',satuan='"+satuan+"',kategori='"+kategori+"',"
                + "stok_brg='"+stok_brg+"' WHERE kd_brg='"+kd_brg+"'";
        db.simpanData(sql);
    }
    
    public List cariID(){
        List<UserModel_master> data = new ArrayList<UserModel_master>();
        ResultSet rs = null;
        try{
            String sql = "Select * from master where kd_brg='"+kd_brg+"'";
            rs = db.ambilData(sql);
            while(rs.next()){
                UserModel_master um= new UserModel_master();
                um.setKd_brg(rs.getString("kd_brg"));
                um.setNama_brg(rs.getString("nama_brg"));
                um.setHarga_jual(rs.getString("harga_jual"));
                um.setHarga_beli(rs.getString("harga_beli"));
                um.setSatuan(rs.getString("satuan"));
                um.setKategori(rs.getString("kategori"));
                um.setStok_brg(rs.getString("stok_brg"));
                data.add(um);
            }
            db.disKonek(rs);
        }
        catch (Exception e){
            System.out.println("Terjadi Kesalahan cariID : "+e);
        }
        return data;
    }
    
    public void Hapus(){
        String sql = "Delete from master where kd_brg='"+kd_brg+"'";
        db.simpanData(sql);
        System.out.println("");
    }
}
