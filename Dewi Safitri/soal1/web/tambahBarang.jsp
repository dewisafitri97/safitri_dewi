<%-- 
    Document   : tambahBarang
    Created on : Oct 17, 2018, 1:51:21 PM
    Author     : A456UR
--%>

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
        <form action="UserController_master?data=user&proses=input-user" method="post">    
                                    <table style="width:100%" id='t01'>
				<tr>
                                    <td>Kode Barang</td><td><select name='kd_brg'>
                                            <option value='A001'>A001</option>
                                            <option value='A002'>A002</option>
                                            <option value='A003'>A003</option>
                                            <option value='A004'>A004</option>
                                        </select></td>
				</tr>
				<tr>
				<td>Nama Barang</td><td><input type='text' name='nama_brg'></td>
				</tr>
				<tr>
				<td>Harga Jual</td><td><input type='text' name='harga_jual'></td>
				</tr>
				<tr>
				<td>Harga Beli</td><td><input type='text' name='harga_beli'></td>
				</tr>
				<tr>
				<td>Satuan</td><td><select name='satuan'>
				<option value='Unit'>Unit</option>
				<option value='Lembar'>Lembar</option>
				<option value='Keping'>Keping</option>
				<option value='Buah'>Buah</option>
				<option value='Potong'>Potong</option>
				<option value='Pasang'>Pasang</option>
				</select></td>
				</tr>
				<tr>
                                    <td>Kategori</td><td><select name='kategori'>
                                            <option value='Baru'>Baru</option>
                                            <option value="Bekas"> Bekas</option>
                                            <option value='Rusak'>Rusak</option>
                                        </select></td>
				</tr>
                                <tr>
                                    <td>Stok Barang</td>
                                    <td><input type="text" name='stok_brg'></td>
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
