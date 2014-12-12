function add(ref){
  var val = ReadCookie ("shoppingcart");
 
	if(val == null){
		initCart();
		val=ref;
	}
	else{
 	 val=ref+","+val;
   }
   date=new Date;
   date.setMonth(date.getMonth()+6);
   WriteCookie ("shoppingcart",val,date);

}

function initCart(){
      date=new Date;
      date.setMonth(date.getMonth()+6);
      WriteCookie("shoppingcart", "", date);
}

function WriteCookie(nom, valeur)
{
   var argv=WriteCookie.arguments;
   var argc=WriteCookie.arguments.length;
   var expires=(argc > 2) ? argv[2] : null;
   var path=(argc > 3) ? argv[3] : null;
   var domain=(argc > 4) ? argv[4] : null;
   var secure=(argc > 5) ? argv[5] : false;
   document.cookie=nom+"="+escape(valeur)+
      ((expires==null) ? "" : ("; expires="+expires.toGMTString()))+
      ((path==null) ? "" : ("; path="+path))+
      ((domain==null) ? "" : ("; domain="+domain))+
      ((secure==true) ? "; secure" : "");
}

function getCookieVal(offset)
{
   var endstr=document.cookie.indexOf (";", offset);
   if (endstr==-1) endstr=document.cookie.length;
   return unescape(document.cookie.substring(offset, endstr));
}

function ReadCookie(nom)
{
   var arg=nom+"=";
   var alen=arg.length;
   var clen=document.cookie.length;
   var i=0;
   while (i<clen)
   {
      var j=i+alen;
      if (document.cookie.substring(i, j)==arg) return getCookieVal(j);
      i=document.cookie.indexOf(" ",i)+1;
      if (i==0) break;
   }
   return null;
}    
