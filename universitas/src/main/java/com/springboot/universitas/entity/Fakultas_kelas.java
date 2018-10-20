/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.universitas.entity;

import java.io.Serializable;

/**
 *
 * @author A456UR
 */
public class Fakultas_kelas implements Serializable {
    
    private String kdFakultas;
    private String namaFakultas;
    
    public Fakultas_kelas (){
        this.kdFakultas=kdFakultas;
    }
    
    public Fakultas_kelas() {
        this.namaFakultas = namaFakultas;
    }

    public String getKdFakultas() {
        return kdFakultas;
    }

    public void setKdFakultas(String kdFakultas) {
        this.kdFakultas = kdFakultas;
    }

    public String getNamaFakultas() {
        return namaFakultas;
    }

    public void setNamaFakultas(String namaFakultas) {
        this.namaFakultas = namaFakultas;
    }
    
    @Override
    public String toString(){
        return "Fakultas_kelas{"+"kd_fakultas="+kdFakultas+"nama_fakultas="+namaFakultas+'\''+'}';
    }
}
