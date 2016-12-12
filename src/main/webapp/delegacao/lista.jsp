<%@page import="br.com.voffice.aw2.model.Delegacao"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<table>
	<tr>
		<td>Nome</td>
		<td>Data Cadastro</td>
	</tr>

	<c:forEach items="${delegacoes}" var="d">
		<tr>
			<td>${d.nome}</td>
			<td><fmt:formatDate value="${d.dataCadastro}"/></td>
		</tr>
	</c:forEach>
	
	</teble>
</body>
</html>