<p class="my-4">Shop Name</p>





          <div class="list-group">
          
          <c:forEach items="${cateogries}" var="cateogry">
            <a href="${contextRoot}/show/cateogry/${cateogry.id}/product" class="list-group-item">${cateogry.id}</a>
           </c:forEach> 
           
          </div>
