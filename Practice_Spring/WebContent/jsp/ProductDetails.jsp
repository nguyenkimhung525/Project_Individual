 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div id="global">
    <h4>The product has been saved.</h4>
    <p>
        <h5>Details:</h5>
        Product Name: ${product.name}<br/>
        Description: ${product.description}<br/>
        Price: $${product.price}
        <br/>
    	FlastRedirect:${products.name}<br/>
    	 FlastRedirect: ${products.description}<br/>
        FlastRedirect: $${products.price}
    </p>
</div>
</body>
</html>