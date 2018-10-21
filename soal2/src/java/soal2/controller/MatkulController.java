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
import soal2.model.MatkulModel;

/**
 *
 * @author A456UR
 */
@WebServlet(name = "MatkulController", urlPatterns = {"/MatkulController"})
public class MatkulController extends HttpServlet {

   

   
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String proses = request.getParameter("proses");
       String action = request.getParameter("action");
       if(proses.equals("input-matkul")){
           response.sendRedirect("tambahMatkul.jsp");
           return;
       }
       else if(proses.equals("edit-matkul")){
            response.sendRedirect("editMatkul.jsp?kd_matkul="+request.getParameter("kd_matkul"));
            return;
        }
       else if(proses.equals("hapus-matkul")){
            MatkulModel hm=new MatkulModel();
            hm.setKd_matkul(request.getParameter("kd_matkul"));
            hm.hapus();
            response.sendRedirect("tampilMatkul.jsp");
        }
    }

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String data = request.getParameter("data");
        String proses = request.getParameter("proses");
       
        if(data != null){
            if(data.equals("matkul")){
                MatkulModel mm = new MatkulModel();
                mm.setKd_matkul(request.getParameter("kd_matkul"));
                mm.setNama_matkul(request.getParameter("nama_matkul"));
                mm.setSks(request.getParameter("sks"));
                if(proses.equals("input-matkul")){
                    mm.simpan();
                }
                 else if(proses.equals("edit-matkul")){
                    mm.update();
                }
                else if(proses.equals("hapus-matkul")){
                    mm.hapus();
                }
                response.sendRedirect("tampilMatkul.jsp");
                        
            }
        }
    }

    

}
