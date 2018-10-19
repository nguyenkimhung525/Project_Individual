<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div id="global">
<form:form commandName="book" action="book_save" method="post">
    <fieldset>
        <legend>Add a book</legend>
        <p>
            <label for="category">Category: </label>
             <form:select id="category" path="category.id">
             	<c:forEach items="${categories}" var="categorie">
             		<form:option value="${categorie.id}">${categorie.name}</form:option>
             	</c:forEach>
             </form:select>
        </p>
        <p>
            <label for="title">Title: </label>
            <form:input id="title" path="title"/>
        </p>
        <p>
            <label for="author">Author: </label>
            <form:input id="author" path="author"/>
        </p>
        <p>
            <label for="isbn">ISBN: </label>
            <form:input id="isbn" path="isbn"/>
        </p>
        
        <p id="buttons">
            <input id="reset" type="reset" tabindex="4">
            <input id="submit" type="submit" tabindex="5" 
                value="Add Book">
        </p>
    </fieldset>
</form:form>
</div>
</body>
</html>