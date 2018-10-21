<%-- 
    Document   : tambahFakultas
    Created on : Oct 20, 2018, 10:10:38 PM
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
				<th colspan='2' ><h1>UNIVERSITAS KU</h1>
				<h2>WEBSITE UNIVERSITAS DEWI</h2></th>
			</tr>
			<tr height='100%'>
				<td colspan='2'>
				<nav id="menu">
     <ul>
       
        <li><a href="#">Fakultas</a>
            <ul>
                <li> <a href="tampilFakultas.jsp">Tampil Fakultas</a></li>
                <li> <a href="tambahFakultas.jsp">Tambah Fakultas</a></li>
                
            </ul>
        </li>
        <li><a href="#">Jurusan</a>
			<ul>
                <li> <a href="tampilJurusan.jsp">Tampil Jurusan</a></li>
                <li> <a href="tambahJurusan.jsp">Tambah Jurusan</a></li>
				
            </ul>
		</li>
                
        <li><a href="#">Mata Kuliah</a>
			<ul>
                <li> <a href="tampilMatkul.jsp">Tampil Mata Kuliah</a></li>
                <li> <a href="tambahMatkul.jsp">Tambah Mata Kuliah</a></li>
				
            </ul>
		</li>
        <li><a href="#">Mahasiswa</a>
			<ul>
                <li> <a href="tampilMhs.jsp">Tampil Mahasiswa</a></li>
                <li> <a href="tambahMhs.jsp">Tambah Mahasiswa</a></li>
				
            </ul>
		</li>
                
        
        
                <li> <a href="index.jsp">Logout</a></li>
    </ul>
</nav>
</html>
</td>
			</tr>
			<tr>
				<td><img src ="gambarSP.jpg"></td>
				<td>
                                    <form action="FakultasController?data=fak&proses=input-fak" method="post">
                                    <table style="width:100%" id='t01'>
                                        <tr>
                                            <td>Kode Fakultas</td>
                                            <td><input type="text" name='kd_fakultas'></td>
                                        </tr>
                                        
                                        <tr>
                                            <td>Nama Fakultas</td>
                                            <td><input type="text" name='nama_fakultas'></td>
                                        </tr>
                                        
                                        <tr>
                                            <td colspan='2'><input type="submit" value="Tambah"></td>
                                        </tr>
			
	</table>
                                    </form>

				</td>
			</tr>
			<tr>
				<td colspan='3' id="menu"><a href='facebook.com'><img src='fb1.png'></a>
				<a href='facebook.com'><img src='icdres.png'></a>
				<a href='facebook.com'><img src='tw1.png'></a></td>
			</tr>
                        
		</table>
	</body>
</html>
