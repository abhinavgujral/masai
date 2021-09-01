let cart_data=JSON.parse(localStorage.getItem('cart_items'));
var total=0;
cart_data.forEach(function(cart_data){
 var main_cont=document.createElement("div");
     main_cont.setAttribute('id','main_cont');
     
     let div_cont=document.createElement("div");
     let p_name=document.createElement('p');
     p_name.innerText=cart_data.name;
     let p_price=document.createElement('p');
     p_price.innerText="₹"+cart_data.price;
     total=total+cart_data.price;
     let image=document.createElement("img");
   //  image.addEventListener("mouseover",image_hover_in);
     //image.addEventListener("mouseout",image_hover_out);
     image.src=cart_data.image;

     div_cont.append(image,p_name,p_price);
     main_cont.append(div_cont);
     document.body.append(main_cont);
 });
     
 var p_total=document.createElement('p');
 p_total.innerText="total= ₹"+total;
 document.body.append(p_total);
 var label=document.createElement('div');
 label.innerText="Enter discount coupon:"
 document.body.append(label);

 var input=document.createElement('input');
 input.setAttribute('id','promo');
 document.body.append(input);
 var button=document.createElement('button');
 button.innerHTML="enter"
 button.onclick=function(){ promo();}
 document.body.append(button);
 console.log(a);
 function promo(){
     var a=document.getElementById('promo').value;
     if(a==="masai30"){
     alert("promo code applied");
     p_total.innerText="discounted total= ₹"+total*0.70;
 }else 
 alert("try again");
}