
var arr=["https://rihnogames.com/wp-content/uploads/2020/10/Marvels-Avengers-Free-Download-full-Game.jpg",
"https://www.ourvadodara.com/wp-content/uploads/2015/04/age-of-ultron-10-things-that-will-make-you-cry-in-avengers-age-of-ultron.jpeg",
"http://images2.fanpop.com/image/photos/12800000/Avengers-desktop-the-avengers-12873866-1920-1200.jpg",
"https://wallpaperbat.com/img/227405-avengers-endgame-2019-poster-wallpaper-avengers-movie-posters.jpg"];
var div=document.createElement("div");
var img=document.createElement("img");
var i=0;
function showimage(url){

div.setAttribute("class","container");

img.src=url;
div.append(img);
document.getElementById("carousel").append(div);

    

}
setInterval(function(){
    if(i==4)
    i=0;
 
    console.log("image");
   
    showimage(arr[i]);
    i++;
  
},3000);

/* ------------------------------------------------ */
 


