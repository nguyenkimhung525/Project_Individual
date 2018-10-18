<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="css/main_css.css">
<style type="text/css">
	body{
	padding: 0;
	margin: 0;
}
div{
	height: 260px;
	width: 500px;
	background: #f2f2f2;
	position: relative;
	}
div .col-field{
	width: 400px;
	position: absolute;
	bottom: 10%;
	left: 7%;	
}
table{
	padding: 0.5em 0.6em;
}
	
</style>
</head>
<body>
	<div >
	<form action="${pageContext.request.contextPath}/product_save" method="post">
	<fieldset class="col-field">
		<legend>Add a product</legend>
		<table>
			<tr>
				<td><label for="name">Product Name:</label></td>
				<td><input type="text" id="name" name="name"tabindex="1"></td>
			</tr>
			<tr>
				<td><label for="description">Description:</label></td>
				<td><input type="text" id="description" name="description" tabindex="2"> </td>
			</tr>
			<tr>
				<td><label for="price">Price: </label></td>
				<td><input type="text" id="price" name="price" 
                    tabindex="3"></td>
			</tr>
			<tr style="text-align: right;">
				<td colspan="2">
					<input id="reset" type="reset" tabindex="4">
					<input id="submit" type="submit" tabindex="5" 
                    value="Add Product">
				</td>
			</tr>
		</table>
	</fieldset>
	</form>
			
	</div>

</body>
</html>