<div class="container">
<div class="row">
<div class="col-md-3">
<%@include file="./shared/sidebar.jsp" %>
</div>
<div class="col-md-9">
<div class="row">
   <div class="col-lg-12">
     <c:if test="${UserClicklistproduct == true}">
     
     <script>
     window.cateogryId='';
     </script>
           
         <ol class="breadcrumb pink lighten-4">
        <li class="breadcrumb-item"><a href="${contextRoot}/home">home</a></li>
        <li class="breadcrumb-item active">All Product</li>
    </ol>
     </c:if>
    <c:if test="${userClickCateogryproduct == true}">
    <script>
    window.cateogryId='${cateogry.id}';
    </script>
      
        <ol class="breadcrumb">
         <li class="breadcrumb-item active"><a href="${contextRoot}/home">home</a></li>
         <li class="breadcrumb-item active">Cateogry</li>
         <li class="breadcrumb-item active">${cateogry.name}</li>
         </ol>
         
    </c:if>
    
</div>
</div>

<div class="row">

<div class="col-xs-12">

<table id="producttablelist" class="table table-striped table-border">

<thead>
<tr>
<th></th>
<th>Name</th>
<th>brand</th>
<th>price</th>
<th>available</th>
<th></th>
</tr>

</thead>

<tfoot>
<tr>
<th></th>
<th>Name</th>
<th>brand</th>
<th>price</th>
<th>avaiv</th>
<th></th>
</tr>

</tfoot>
</table>

</div>
</div>

</div>

</div>
</div>