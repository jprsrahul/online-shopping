<div class="container">
<div class="row">
<div class="col-xs-12">
<ol class="breadcrumb">
<li><a href="${contextRoot}/home">Home</a></li>
<li><a href="${contextRoot}/show/all/product">product</a></li>
<li class="active">${product.name}</li>


</ol>


</div>

</div>

<div class="row">

<div class="col-xs-12 col-sm-4">

<div class="thumnail">

<img src="${images}/${product.code }.jpeg" class="img img-responsive"/>

</div>

</div>

<div class="col-xs-12 col-sm-8">
<h3>${product.name }</h3>
<hr/>
<p>${product.description }</p>
<hr/>
<h4>price:<strong>&#8377; ${product.unit_price }</strong></h4>
<hr/>
<c:choose>

<c:when test="${product.quantity < 1}">
<h6>Qty. Available :<span style="color:red">Out Of stock</span></h6>
</c:when>
<c:otherwise>

<h6>Qty. Available :${product.quantity }</h6>
</c:otherwise>
</c:choose>
<c:choose>

<c:when test="${product.quantity < 1}">
<a href="javscript:void(0)" class="btn btn-primary disabled"><strike><span class="glyphicon glyphicon-shopping-cart"></span>Add to cart</strike></a>
</c:when>
<c:otherwise>

<a href="${contextRoot }/cart/add/${product.id}/product" class="btn btn-primary"><span class="glyphicon glyphicon-shopping-cart"></span>Add to cart</a>

</c:otherwise>
</c:choose>
<a href="${contextRoot }/show/All/product" class="btn btn-primary">back</a>

</div>
</div>



</div>