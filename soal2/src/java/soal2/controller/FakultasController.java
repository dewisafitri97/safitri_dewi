/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal2.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import soal2.model.FakultasModel;

/**
 *
 * @author A456UR
 */
@WebServlet(name = "FakultasController", urlPatterns = {"/FakultasController"})
public class FakultasController extends HttpServlet {

   
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String proses = request.getParameter("proses");
        String action = request.getParameter("action");
        if(proses.equals("input-fak")){
            response.sendRedirect("tambahFakultas.jsp");
            return;
        }
        else if(proses.equals("edit-fak")){
            response.sendRedirect("editFakultas.jsp?kd_fakultas="+request.getParameter("kd_fakultas"));
            return;
        }
        else if(proses.equals("hapus-fak")){
            FakultasModel hm=new FakultasModel();
            hm.setKd_fakultas(request.getParameter("kd_fakultas"));
            hm.hapus();
            response.sendRedirect("tampilFakultas.jsp");
        }
    }

   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String data = request.getParameter("data");
        String proses = request.getParameter("proses");
        
        if(data != null){
            if(data.equals("fak")){
                FakultasModel fm = new FakultasModel();
                fm.setKd_fakultas(request.getParameter("kd_fakultas"));
                fm.setNama_fakultas(request.getParameter("nama_fakultas"));
                if(proses.equals("input-fak")){
                    fm.simpan();
                }
                else if(proses.equals("edit-fak")){
                    fm.update();
                }
                else if(proses.equals("hapus-fak")){
                    fm.hapus();
                }
                
                response.sendRedirect("tampilFakultas.jsp");
            }
            
            
        }
    }

   
}
