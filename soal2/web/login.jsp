<%-- 
    Document   : login
    Created on : Oct 20, 2018, 8:30:52 PM
    Author     : A456UR
--%>

<%@page import = "java.sql.*"%>
<!DOCTYPE html>

<% 
    String userid = request.getParameter("username");
    String pass = request.getParameter("pass");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/univdb",
            "root", "");
    Statement st = con.createStatement();
    ResultSet rs;
    rs = st.executeQuery("SELECT * FROM login WHERE username ='"+userid+"' and pass ='"+pass+"'");
    if (rs.next()){
        session.setAttribute("userid", userid);
        out.println("welcome "+ userid);
        out.println("<a href='logout.jsp'>LOG OUT</a>");
        response.sendRedirect("tampilFakultas.jsp");
    }
    else { 
        out.println("Username dan Password anda tidak cocok silahkan coba lagi"
                + "<a href='index.jsp'>Coba Lagi</a>");
        
    }
%>

