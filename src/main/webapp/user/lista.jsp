<%@page import="br.com.voffice.aw2.model.Usuario"%>
<%@page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
 
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>AWTF - 29</title>

    <jsp:include page="../fragments/css-import.jsp"/>

</head>

<body>

    <div id="wrapper">

        <!-- Navigation -->
        <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
			
			<jsp:include page="../fragments/header.jsp"/>
            <!-- /.navbar-top-links -->

			<jsp:include page="../fragments/menu.jsp"/>

        </nav>

        <div id="page-wrapper">
        
			<jsp:include page="../fragments/titulo.jsp">
				<jsp:param value="Usuarios" name="titulo"/>
			</jsp:include>
			
			<div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Striped Rows
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-striped">
                                    <thead>
                                        <tr>
                                            <th>#</th>
                                            <th>Nome Completo</th>
                                            <th>Username</th>
                                            <th>Password</th>
                                        </tr>
                                    </thead>
                                    <tbody>
	                                   	<c:forEach var="usuario" items="${usuarios}">                               
	                                        <tr>
	                                            <td>${usuario.id}</td>
	                                            <td><a href="usuario/${usuario.id}">${usuario.fullName}</a></td>
	                                            <td>${usuario.username}</td>
	                                            <td>${usuario.password}</td>
	                                        </tr>
	                                    </c:forEach>    
                                    </tbody>
                                </table>
                            </div>
                            <!-- /.table-responsive -->
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
			
		</div>
        <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->
 
    <jsp:include page="../fragments/js-import.jsp"/>

</body>

</html>
			