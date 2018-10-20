/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.universitas.dao;
import java.util.List;
/**
 *
 * @author A456UR
 */
public interface baseDAO<T> {
    T save (T param);
    T update (T param);
    String delete (T param);
    
    List<T> find();
    T findById (String kdFakultas);
 }
