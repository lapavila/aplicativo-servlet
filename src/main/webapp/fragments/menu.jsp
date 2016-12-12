<%@ page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="navbar-default sidebar" role="navigation">
	<div class="sidebar-nav navbar-collapse">
	    <ul class="nav" id="side-menu">
	        
	        <li>
	            <a href="index.jsp"><i class="fa fa-dashboard fa-fw"></i> Dashboard</a>
	        </li>
	        <li>
	            <a href="<c:url value="/usuario"/>"><i class="fa fa-user fa-fw"></i>Usuario</a>
	        </li>
	    </ul>
	</div>
	<!-- /.sidebar-collapse -->
</div>
<!-- /.navbar-static-side -->
    