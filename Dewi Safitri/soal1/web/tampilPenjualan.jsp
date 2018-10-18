<%-- 
    Document   : tampilPenjualan
    Created on : Oct 17, 2018, 9:42:06 PM
    Author     : A456UR
--%>

<%@page import="dewi.model.UserModel_pejualan"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
     <style>
		table#tb1{
			text-align:center;
		}
		table, th, td {
    border: 1px solid blue;
    border-collapse: collapse;
}
h2,h1#judul1{
	text-align : center;
	color : blue;
}
th, td {
    padding: 5px;
    text-align: center;
}
table#t01 {
    width: 100%;    
    background-color: #f1f1c1;
}
th#bg1 {
	background-color: pink;
	}
th#bg2 {
	background-color: yellow;
	}
	tr#bg2 {
	background-color: yellow;
	}

	#menu {
    background:#26A4C5;
    width: 100%;
    height: 65px;
    margin: 0px;
    padding: 0px;
    
}
#menu ul {
    list-style: none;

}
#menu ul li {
    float: left;
    line-height: 65px;
}
#menu ul li a {
    float:left; 
    width:100px; 
    display:block; 
    text-align:center; 
    color:#FFF; 
    text-decoration:none; 
}
#menu ul ul {
    display:none; 
    list-style:none; 
    position:absolute; 
    background-color:#26C4C2;
    float: none;
    top:65px; 
    width:190px;
}
#menu ul li a:hover {
    background-color:#2E9EA2; 
    display:block;
}
#menu ul li:hover ul {
    display:block;
}
#menu ul ul li a {
    display:block;
    padding-left:30px; 
    text-align:left; 
    width:160px;
    height: 60px;
    line-height: 60px;
}
#menu ul ul li a:hover {
    color:#fff;
}

	</style>

	<body>
		<table id='tb1' border='1' width='100%'>
			<tr>
				<th colspan='2' ><h1>DEWI SPARE</h1>
				<h2>WEBSITE PENJUALAN SPAREPART MOTOR</h2></th>
			</tr>
			<tr height='100%'>
				<td colspan='2'>
				<nav id="menu">
     <ul>
       
        <li><a href="#">Master Barang</a>
            <ul>
                <li> <a href="tampilBarang.jsp">Tampil Barang</a></li>
                <li> <a href="tambahBarang.jsp">Tambah Barang</a></li>
                
            </ul>
        </li>
        <li><a href="#">Penjualan</a>
			<ul>
                <li> <a href="tambahPenjualan.jsp">Tambah Penjualan</a></li>
                <li> <a href="tampilPenjualan.jsp">Riwayat Transaksi</a></li>
				
            </ul>
		</li>
        <li> <a href="index.jsp">Home</a></li>
    </ul>
</nav>
</td>
			</tr>
			<tr rowspan='7'>
				<td><img src ="gambar2.jpg"></td>
				<td><table style="width:100%" id='t01'>
				
				
                                <th>Nomor</th>
                                <th>Tanggal Faktur</th>
				<th>Nomor Faktur</th>
				<th>Nama Konsumen</th>
				<th>Kode Barang</th>
				<th>Jumlah</th>
				<th>Harga Satuan</th>
                                <th>Harga Total</th>
                                
                                <th>Action</th>
                                
                        <%
                            UserModel_pejualan km = new UserModel_pejualan();
                            List<UserModel_pejualan> data = new ArrayList<UserModel_pejualan>();
                            String ket = request.getParameter("ket");
                            if(ket == null){
                                data = km.tampil();
                            }
                            for (int x=0; x < data.size(); x++){
                        %>
				<tr>
					<td><%=x+1%></td>
                                        <td><%=data.get(x).getTgl_faktur()%></td>
                                        <td><%=data.get(x).getNo_faktur()%></td>
                                        <td><%=data.get(x).getNama_konsumen()%></td>
                                        <td><%=data.get(x).getKd_brg()%></td>
                                        <td><%=data.get(x).getJumlah()%></td>
                                        <td><%=data.get(x).getHarga_satuan()%></td>
                                        <td><%=data.get(x).getHarga_total()%></td>
                                       
                                        
                                        
                                        
                                        <td>
                                            <a href="UserController_penjualan?proses=hapus-jual&no_faktur=<%=data.get(x).getNo_faktur()%>">Hapus</a>
                                             
                                        </td>
				</tr>
                             <%}%>
			
			
			
	</table>

				
			<tr>
				<td colspan='3' id="menu"><a href='facebook.com'><img src='fb1.png'></a>
				<a href='facebook.com'><img src='icdres.png'></a>
				<a href='facebook.com'><img src='tw1.png'></a></td>
			</tr>
		</table>
	</body>
</html>
