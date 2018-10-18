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
public class UserModel_pejualan {
    String tgl_faktur,no_faktur,nama_konsumen,kd_brg,jumlah,harga_satuan,harga_total;
    
    Koneksi db = null;
    
    public UserModel_pejualan (){
        db = new Koneksi();
    }

    public String getTgl_faktur() {
        return tgl_faktur;
    }

    public void setTgl_faktur(String tgl_faktur) {
        this.tgl_faktur = tgl_faktur;
    }

    public String getNo_faktur() {
        return no_faktur;
    }

    public void setNo_faktur(String no_faktur) {
        this.no_faktur = no_faktur;
    }

    public String getNama_konsumen() {
        return nama_konsumen;
    }

    public void setNama_konsumen(String nama_konsumen) {
        this.nama_konsumen = nama_konsumen;
    }

    public String getKd_brg() {
        return kd_brg;
    }

    public void setKd_brg(String kd_brg) {
        this.kd_brg = kd_brg;
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }

    public String getHarga_satuan() {
        return harga_satuan;
    }

    public void setHarga_satuan(String harga_satuan) {
        this.harga_satuan = harga_satuan;
    }

    public String getHarga_total() {
        return harga_total;
    }

    public void setHarga_total(String harga_total) {
        this.harga_total = harga_total;
    }
    
    public List tampil(){
        List<UserModel_pejualan> data = new ArrayList<UserModel_pejualan>();
        ResultSet rs = null;
        try{
            String sql =" Select * from penjualan";
            rs = db.ambilData(sql);
            while(rs.next()){
                UserModel_pejualan ump = new UserModel_pejualan();
                ump.setTgl_faktur(rs.getString("tgl_faktur"));
                ump.setNo_faktur(rs.getString("no_faktur"));
                ump.setNama_konsumen(rs.getString("nama_konsumen"));
                ump.setKd_brg(rs.getString("kd_brg"));
                ump.setJumlah(rs.getString("jumlah"));
                ump.setHarga_satuan(rs.getString("harga_satuan"));
                ump.setHarga_total(rs.getString("harga_total"));
                data.add(ump);
            }
        }
        catch (Exception e){
            System.out.println("Method tampil salah mbak : "+e);
        }
        return data;
    }
    
    public void simpan(){
        String sql = "INSERT INTO penjualan VALUES ('"+tgl_faktur+"','"+no_faktur+"','"+nama_konsumen+"','"
                + kd_brg+"','"+jumlah+"','"+harga_satuan+"','"+harga_total+"')";
        db.simpanData(sql);
    }
    
    public void hapus(){
        String sql ="DELETE FROM penjualan WHERE no_faktur='"+no_faktur+"'";
        db.simpanData(sql);
        System.out.println("");
    }
    
}
