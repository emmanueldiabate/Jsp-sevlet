<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inscire</title>
</head>
<body>
	<div class="background">
	</div>
	<div class="main">
		<input type="checkbox" id="chk" aria-hidden="true">
	<div class="signup">
	<form action="manu" method="post" >
	<label for="chk" aria-hidden="true" class="mon">Inscription</label>
	<%  if(request.getAttribute("erreur_mdp")!=null){
		%>
		<small class="eroor"<% out.println(request.getAttribute("erreur_mdp")); %>></small>
		<%
		}%>
	
			<label for="nom">Nom:</label><br/>
			<input type="text" id="nom" name="nom"/><br/><br/>
			<label for="Prenom">Prenom:</label><br/>
			<input type="text" id="Prenom" name="prenom"><br/><br/>
			<label for="Pseudo">pseudo:</label><br/>
			<input type="text" id="pseudo" name="pseudo"/><br/><br/>
			<label for="email">email:</label><br/>
			<input type="text" id="email" name="email"/><br/><br/>
			<label for="Password">Password:</label><br/>
			<input type="password" id="Password" name="password"/><br/><br/>
			<label for="Password">Password-Confirm:</label><br/>
			<input type="password" id="Password-Confirm" name="passconfirm"/><br/><br/>
			
			<button class="but" name="connexion"
				 type="submit">Connexion</button>
		
			</form>
	
		</div>
		
	</div>

</body>
</html>
<style>
body {
		background-color: #eddcd2;
	}
.main {
		border-style: solid;
		margin:auto;
		margin-top: 100px;
		width:13%;
		padding:55px;
		background-color:#168aad;
		border-radius:15px;
		
		
		
		border-radius:25;		
}

</style>