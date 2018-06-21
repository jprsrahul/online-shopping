$(function(){
	switch(menu){
	case 'about' : $('#about').addClass('active');
	              break;
	case 'contact' : $('#contact').addClass('active');
                    break;
	case 'listproduct' : $('#listproduct').addClass('active');
                   break;
	default : if(menu == "Home") break;
	         $('#a_'+menu).addClass('active');
    break;
	}
	
	
});
 
$(document).ready(function() {
	var jsonUrl = '';
	if(window.cateogryId==''){
		jsonUrl=window.contextRoot + '/json/data/all/products';
	}
	else{
		jsonUrl=window.contextRoot + '/json/data/cateogry/'+ window.cateogryId +'/products';

	}
    $('#producttablelist').DataTable( {
    	lengthMenu : [[3,5,10,-1],['3Records','5Record','10Records','All']],
        pagLength : 5,	
        ajax:{
        	url : jsonUrl,
        	dataSrc : ''
        },
        columns : [
        	{
        		data : 'code',
        		mRender : function(data,type,row){
        			return '<img src="'+window.contextRoot+'/resources/images/'+data+'.jpeg" class="dataTableImg"/>';
        		}
        	},
        	{
        		data : 'name'
        		
        	},
        	{
        		data : 'brand'
        		
        	},
        	{
        		data : 'unit_price',
        			mRender : function(data,type,row){
        				return '&#8377;' + data
        			}
        		
        	},
        	{
        		data : 'quantity',
        			mRender : function(data,type,row){
        				if(data < 1){
                        return '<span style="color:red">Out Of stock</span>';
        				}
        				return data;
        			}
        		
        	},
        	{
        		data : 'id',
        		bSortable : false,
        		mRender : function(data,type,row){
        			var str='';
        			
        			str+='<a href="'+window.contextRoot+'/show/'+data+'/product" class="btn btn-primary"><span class="glyphicon glyphicon-eye-open"></span></a>&#160;';
        			if(row.quantity <1){
        				str+='<a href="javascript:void(0)" class="btn btn-primary disabled"><span class="glyphicon glyphicon-shopping-cart"></span></a>';
            			
        			}
        			else{
        				str+='<a href="'+window.contextRoot+'/cart/add/'+data+'/product" class="btn btn-primary"><span class="glyphicon glyphicon-shopping-cart"></span></a>';
            			
        			}
        			
        			
        		return str;
        		}
        	}
        	
        ]
    } );
} );