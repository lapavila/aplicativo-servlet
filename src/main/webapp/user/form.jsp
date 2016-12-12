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

	<jsp:include page="../fragments/css-import.jsp" />

</head>

<body>

    <div id="wrapper">

        <!-- Navigation -->
        <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
			
			<jsp:include page="../fragments/header.jsp"/>
            <!-- /.navbar-top-links -->

			<jsp:include page="../fragments/menu.jsp" />

        </nav>

        <div id="page-wrapper">
        
			<jsp:include page="../fragments/titulo.jsp">
				<jsp:param value="Usuarios" name="titulo"/>
			</jsp:include>
			
			<div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Usuario
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
							<form role="form" action="usuario" method="post" class="form-horizontal">
								<div class="form-group">
									<label for="inputEmail3" class="col-sm-2 control-label">ID</label>
									<div class="col-sm-10">
										<input type="hidden" name="id" value="${usuario.id}"/> 
										<p class="form-control-static">${usuario.id}</p>
									</div>
								</div>
								<div class="form-group">
									<label for="inputEmail3" class="col-sm-2 control-label">Nome Completo</label>
									<div class="col-sm-10">
										<input class="form-control" type="text" value="${usuario.fullName}" name="fullName">
									</div>
								</div>
								<div class="form-group">
									<label for="inputEmail3" class="col-sm-2 control-label">Username</label>
									<div class="col-sm-10">
										<input class="form-control" type="text" value="${usuario.username}" name="username">
									</div>
								</div>
								<div class="form-group">
									<label for="inputEmail3" class="col-sm-2 control-label">Password</label>
									<div class="col-sm-10">
										<input class="form-control" type="text" value="${usuario.password}" name="password">
									</div>
								</div>

								<div class="form-group">
									<div class="col-sm-offset-2 col-sm-10">
										<button type="submit" class="btn btn-primary">Salvar</button>
									</div>
								</div>
                         </form>
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
			