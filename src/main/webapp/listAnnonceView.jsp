<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="Entity.Annonces" %>   
<%@ page import="Service.AnnonceService" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<link type="text/css" rel="stylesheet" href="New.css" />
	<body>
		<h1>Liste des annonces </h1>
		<a href="AnnonceController">Create</a>
		<table>
			<thead>
				<tr> 
					<th>id_user</th> 
					<th>nom</th>
					<th>description</th>
					<th>prix</th>
					<th>url photo</th>
					<th>Categorie</th>
					<th>SousCategorie</th>
				</tr>
			</thead>

			<tbody>
				<% for ( Annonces a : new AnnonceService().getAll() ) {%>
					<tr>
						<td> <%= a.getUser_id() %> </td>
						<td> <%= a.getNom() %> </td>
						<td> <%= a.getDescription() %> </td>
						<td> <%= a.getPrix() %> </td>
						<td> <img src=<%=a.getURLphoto()%> width=80 height=60 ></td>
						<td> <%= a.getCategorie() %> </td>
						<td> <%= a.getSousCategorie() %> </td>
					</tr>
				<% } %>
			</tbody>
		</table>
		
	</body>
</html>