<div class="container">
<div class="row">
<div class="col-md-3">
<%@include file="./shared/sidebar.jsp" %>
</div>
<div class="col-md-9">
<div class="row">
   <div class="col-lg-12">
     <c:if test="${UserClicklistproduct == true}">
         <ol class="breadcrumb">
             <li class="breadcrumb-item active"><a href="${contextRoot}/home">home</a></li>
              <li class="breadcrumb-item active">All Product</li>
         </ol>
     </c:if>
    <c:if test="${userClickCateogryproduct == true}">
        <ol class="breadcrumb">
         <li class="breadcrumb-item active"><a href="${contextRoot}/home">home</a></li>
         <li class="breadcrumb-item active">Cateogry</li>
         <li class="breadcrumb-item active">${cateogry.name}</li>
         </ol>
    </c:if>
    
</div>
</div>
</div>

</div>
</div>