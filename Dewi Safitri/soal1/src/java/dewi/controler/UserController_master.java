/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dewi.controler;

import dewi.model.UserModel_master;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author A456UR
 */
@WebServlet(name = "UserController_master", urlPatterns = {"/UserController_master"})
public class UserController_master extends HttpServlet {

    

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String proses= request.getParameter("proses");
       String action = request.getParameter("action");
       if(proses.equals("input-user")){
           response.sendRedirect("tambahBarang.jsp");
           return;
       }
       else if (proses.equals("edit-user")){
           response.sendRedirect("updateBarang.jsp?kd_brg="+request.getParameter("kd_brg"));
           return;
       }
       else if (proses.equals("hapus-user")){
           UserModel_master hps = new UserModel_master();
           hps.setKd_brg(request.getParameter("kd_brg"));
           hps.Hapus();
           response.sendRedirect("tampilBarang.jsp");
       }
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String data = request.getParameter("data");
       String proses = request.getParameter("proses");
       if(data != null){
           if(data.equals("user")){
               UserModel_master umm = new UserModel_master();
               umm.setKd_brg(request.getParameter("kd_brg"));
               umm.setNama_brg(request.getParameter("nama_brg"));
               umm.setHarga_jual(request.getParameter("harga_jual"));
               umm.setHarga_beli(request.getParameter("harga_beli"));
               umm.setSatuan(request.getParameter("satuan"));
               umm.setKategori(request.getParameter("kategori"));
               umm.setStok_brg(request.getParameter("stok_brg"));
               if(proses.equals("input-user")){
                   umm.simpan();
               }
               
               else if(proses.equals("edit-user")){
               umm.Update(); 
           }
               else if(proses.equals("hapus-user")){
                   umm.Hapus();
               }
               response.sendRedirect("tampilBarang.jsp");
           
           
           
       }
    }

   


    }
}
