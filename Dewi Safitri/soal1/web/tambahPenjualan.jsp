<%-- 
    Document   : tambahPenjualan
    Created on : Oct 17, 2018, 9:51:23 PM
    Author     : A456UR
--%>

<%@page import="dewi.model.UserModel_master"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dewi.model.UserModel_pejualan"%>
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
        <li><a href='index.jsp'>Home</a></li>
                
    </ul>
</nav>
</td>
			</tr>
			<tr rowspan='7'>
				<td><img src ="gambar2.jpg"></td>
				<td>
        <form action="UserController_penjualan?data=jual&proses=input-jual" method="post" name='dewi'>    
                                    <table style="width:100%" id='t01'>
				<tr>
                                    <td>Tanggal Faktur</td><td><input type='date' name='tgl_faktur' placeholder="Tahun/Tanggal/Bulan"></td>
				</tr>
				<tr>
				<td>Nomor Faktur</td><td><input type='text' name='no_faktur'></td>
				</tr>
				<tr>
				<td>Nama Konsumen</td><td><input type='text' name='nama_konsumen'></td>
				</tr>
				<tr>
                                    <td>Kode Barang</td><td><select name='kd_brg'>
                                            <option value="kd_brg">Kode Barang</option>
                                            <option value="A001">A001</option>
                                            <option value="A002">A002</option>
                                            <option value="A003">A003</option>
                                            <option value="A004">A004</option>
                                        </select>
                                    </td>
				</tr>
				<tr>
                                    <td>Jumlah</td><td><input type="text" name='jumlah'>
                                    </td>
				</tr>
				<tr>
                                    
                                      <td><button type='button' onClick='harga(this.form)'>Harga Satuan</button></td><td><input type='text' name='harga_satuan'></td>
				</tr>
            
                                <tr>
                                    <td>Harga Total</td>
                                <script type='text/javascript'>
                                    function harga(form){
                                        var kd = (document.dewi.kd_brg.value);
                                        var jum = (document.dewi.jumlah.value);
                                        if(kd == "A001"){
                                            var hs= "30000";
                                        }
                                        else if (kd == "A002"){
                                            var hs= "40000";
                                        }
                                        else if(kd == "A003"){
                                            var hs="50000";
                                        }
                                        else if(kd=="A004"){
                                            var hs="60000";}
                                        
                                        document.dewi.harga_satuan.value = hs;
                                        var hrg_total = jum * hs;
                                        document.dewi.harga_total.value = hrg_total;
                                    }
                                    </script>
                                    <td><input type="text" name='harga_total'></td>
                                </tr>
                                
				<tr>
				<td colspan='2'><input type='submit' value='Tambah'>
				</td>
				</tr>
			
			
			
	</table>                       
    </form>
			<tr>
				<td colspan='3' id="menu"><a href='facebook.com'><img src='fb1.png'></a>
				<a href='facebook.com'><img src='icdres.png'></a>
				<a href='facebook.com'><img src='tw1.png'></a></td>
			</tr>
		</table>
                
	</body>
</html>
