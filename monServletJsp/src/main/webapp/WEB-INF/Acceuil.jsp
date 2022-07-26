<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<%@page import="Regulator.archive" %> 
<%@page import="java.util.List" %>  
<%@page import="java.util.ArrayList" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



		<h1>
			<center>Bonjour ${nom} ${prenom}</center>
			<form action="manuel" method="post" >
			<button class="but" name="connexion"
				 type="submit">Déconnexion</button>
		</h1>


<table class="tab">
	<thead>
		<tr>
		
		<th>Nom</th>
		<th>Prénom</th>
		<th>email</th>
		<th>Pseudo</th>
		</tr>
	</thead>
	<tbody>
	<%
		List<archive> users = (ArrayList <archive>) session.getAttribute("good");
		for(archive user : users)
		{
	%>
		
		<tr>
		<td><% out.print (user.getNom()); %></td>
		<td><% out.print (user.getPrenom()); %></td>
		<td><% out.print (user.getPseudo()); %></td>
		<td><% out.print (user.getPassword()); %></td>
		</tr>
		
		<%
		}
		%>
	</tbody>

</table>

</body>
</html>
<style>
.tab {
	border: solid-black;
	border-collapse:collapse;
	left:35%;
	top:25%;
	position:relative;
	
}
th{

background-color:blue;
color: #fff;

}
th,td{
border: 2px solid black;
border-collapse:collapse;
}
.but{
	float: rigt;
	top: 80%;
	left: 70%;
	position: relative;
}
{


}
</style>