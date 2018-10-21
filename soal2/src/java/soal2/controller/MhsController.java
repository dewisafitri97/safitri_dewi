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
import soal2.model.MhsModel;

/**
 *
 * @author A456UR
 */
@WebServlet(name = "MhsController", urlPatterns = {"/MhsController"})
public class MhsController extends HttpServlet {

   
    

   
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String proses = request.getParameter("proses");
        String action = request.getParameter("action");
        if(proses.equals("input-mhs")){
            response.sendRedirect("tabahMhs.jsp");
            return;
        }
        else if(proses.equals("edit-mhs")){
            response.sendRedirect("editMhs.jsp?nim="+request.getParameter("nim"));
            return;
        }
        
        else if(proses.equals("hapus-mhs")){
            MhsModel hm=new MhsModel();
            hm.setNim(request.getParameter("nim"));
            hm.hapus();
            response.sendRedirect("tampilMhs.jsp");
        
    }
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String proses = request.getParameter("proses");
        String data = request.getParameter("data");
        if (data != null){
            if(data.equals("mhs")){
                MhsModel mm = new MhsModel();
                mm.setNim(request.getParameter("nim"));
                mm.setNama(request.getParameter("nama"));
                mm.setKd_jurusan(request.getParameter("kd_jurusan"));
                mm.setKd_matkul(request.getParameter("kd_matkul"));
                if (proses.equals("input-mhs")){
                    mm.simpan();
                }
                else if(proses.equals("edit-mhs")){
                    mm.update();
                }
                else if(proses.equals("hapus-mhs")){
                    mm.hapus();
                }
                response.sendRedirect("tampilMhs.jsp");
            }
        }
    }

   
}
