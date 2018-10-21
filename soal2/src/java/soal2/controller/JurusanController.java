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
import soal2.model.JurusanModel;

/**
 *
 * @author A456UR
 */
@WebServlet(name = "JurusanController", urlPatterns = {"/JurusanController"})
public class JurusanController extends HttpServlet {

   
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     String proses = request.getParameter("proses");
     String action = request.getParameter("action");
     if(proses.equals("input-jurusan")){
         response.sendRedirect("tambahJurusan.jsp");
         return;
     }
     else if(proses.equals("edit-jurusan")){
            response.sendRedirect("editJurusan.jsp?kd_jurusan="+request.getParameter("kd_jurusan"));
            return;
        }
     else if(proses.equals("hapus-jurusan")){
            JurusanModel hm=new JurusanModel();
            hm.setKd_jurusan(request.getParameter("kd_jurusan"));
            hm.hapus();
            response.sendRedirect("tampilJurusan.jsp");
        }
    }

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     String data = request.getParameter("data");
     String proses = request.getParameter("proses");
     
     if(data !=null){
         if(data.equals("jurusan")){
             JurusanModel jm = new JurusanModel();
             jm.setKd_jurusan(request.getParameter("kd_jurusan"));
             jm.setNama_jurusan(request.getParameter("nama_jurusan"));
             jm.setKaprodi(request.getParameter("kaprodi"));
             jm.setKd_fakultas(request.getParameter("kd_fakultas"));
             if(proses.equals("input-jurusan")){
                 jm.simpan();
             }
             else if(proses.equals("edit-jurusan")){
                    jm.update();
                }
             else if(proses.equals("hapus-jurusan")){
                    jm.hapus();
                }
             response.sendRedirect("tampilJurusan.jsp");
         }
     }
    }

   

}
