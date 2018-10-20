package com.springboot.soal3.service.impl;

import com.springboot.soal3.dao.FakultasDAO;
import com.springboot.soal3.entity.Fakultas;
import com.springboot.soal3.service.FakultasService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FakultasSeviceImpl implements FakultasService {
    @Autowired
    private FakultasDAO fakultasDAO;

    @Override
    public Fakultas save (Fakultas param){
        return  fakultasDAO.save(param);
    }


    @Override
    public Fakultas update(Fakultas param){

        return  fakultasDAO.update(param);
    }

    @Override
    public int delete(Fakultas param){

        return fakultasDAO.delete(param);
    }

    @Override
    public List<Fakultas> find(){

        return fakultasDAO.find(s);
    }

@Override
    public Fakultas findById(int id) {
        return fakultasDAO.findById(id);
    }


}
