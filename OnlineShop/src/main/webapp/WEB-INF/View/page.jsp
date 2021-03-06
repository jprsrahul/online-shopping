<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %> 
<c:set var="contextRoot" value="${pageContext.request.contextPath}"/>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<spring:url var="css" value="/resources/css"/>
<spring:url var="js" value="/resources/js"/>
<spring:url var="images" value="/resources/images"/>
<!DOCTYPE html>
<html lang="en">

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

     <title>OnlineShopping - ${title}</title>

    <!-- Bootstrap core CSS -->
    <link href="${css }/bootstrap.min.css" rel="stylesheet">
    
    <link href="${css }/bootstrap-theme-readable.min.css" rel="stylesheet">
    
    <link href="${css }/dataTables.bootstrap.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="${css}/myapp.css" rel="stylesheet">
    <script>
    window.menu='${title}';
    window.contextRoot = '${contextRoot}'
    </script>

  </head>


  <body>
<div class="wrapper">
   <!-- Navigation -->
    <%@include file="./shared/navbar.jsp" %>

    <!-- Page Content -->
    <div class="content">
    <c:if test="${UserClickhome == true}">
    <%@include file="Home.jsp" %>
    </c:if>
    
    <c:if test="${UserClicklistproduct == true or UserClickCateogryproduct== true}">
    <%@include file="listproduct.jsp" %>
    </c:if>
    
    <c:if test="${UserClickShowProduct == true }">
    <%@include file="singleProduct.jsp" %>
    </c:if>
    
    <c:if test="${UserClickAbout == true}">
    <%@include file="about.jsp" %>
    </c:if>
    
    <c:if test="${UserClickcontact == true}">
    <%@include file="contact.jsp" %>
    </c:if>
    
    
    
</div>
    <!-- Footer -->
    <%@include file="./shared/footer.jsp" %>
    <!-- Bootstrap core JavaScript -->
    <script src="${js}/jquery-3.2.1.js"></script>
    
    <script src="${js}/bootstrap.min.js"></script>
    
    
    
    <script src="${js}/jquery.dataTables.js"></script>
    
    <!-- - <script src="${js}/dataTables.bootstrap.js"></script>-->
    
    <script src="${js}/app.js"></script>
    </div>
  </body>

</html>
