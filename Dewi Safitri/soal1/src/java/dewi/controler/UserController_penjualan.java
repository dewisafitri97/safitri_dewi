/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dewi.controler;

import dewi.model.UserModel_pejualan;
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
@WebServlet(name = "UserController_penjualan", urlPatterns = {"/UserController_penjualan"})
public class UserController_penjualan extends HttpServlet {

    

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String proses = request.getParameter("proses");
        String action = request.getParameter("action");
        if (proses.equals("input-jual")){
            response.sendRedirect("tambahPenjualan.jsp");
            return;
        }
        else if(proses.equals("hapus-jual")){
            UserModel_pejualan ump = new UserModel_pejualan();
            ump.setNo_faktur(request.getParameter("no_faktur"));
            ump.hapus();
            response.sendRedirect("tampilPenjualan.jsp");
        }
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     String data = request.getParameter("data");
     String proses = request.getParameter("proses");
     
     if (data != null){
         if(data.equals("jual")){
             UserModel_pejualan ump = new UserModel_pejualan();
            ump.setTgl_faktur(request.getParameter("tgl_faktur"));
            ump.setNo_faktur(request.getParameter("no_faktur"));
            ump.setNama_konsumen(request.getParameter("nama_konsumen"));
            ump.setKd_brg(request.getParameter("kd_brg"));
            ump.setJumlah(request.getParameter("jumlah"));
            ump.setHarga_satuan(request.getParameter("harga_satuan"));
            ump.setHarga_total(request.getParameter("harga_total"));
             if(proses.equals("input-jual")){
                 ump.simpan();
             }
             else if (proses.equals("hapus-jual")){
                 ump.hapus();
             }
             response.sendRedirect("tampilPenjualan.jsp");
         
     }
    }

    

}
}
