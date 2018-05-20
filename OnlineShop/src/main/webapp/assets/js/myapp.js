$(function(){
	switch(menu){
	case 'about' : $('#about').adclass('active');
	              break;
	case 'contact' : $('#contact').adclass('active');
                    break;
	case 'listproduct' : $('#listproduct').adclass('active');
                   break;
	default : $('#home').adclass('active');
    break;
	}
});