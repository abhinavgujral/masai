
var avengers={
    name:"Avengers",
    release_date:"30/09/2020",
    url:"https://rihnogames.com/wp-content/uploads/2020/10/Marvels-Avengers-Free-Download-full-Game.jpg",
    IMDb_rating:4 
}
var avengers1={
    name:"Avengers",
    release_date:"30/09/2020",
    url:"https://www.ourvadodara.com/wp-content/uploads/2015/04/age-of-ultron-10-things-that-will-make-you-cry-in-avengers-age-of-ultron.jpeg",
    IMDb_rating:6
}
var avengers2={
    name:"Avengers",
    release_date:"30/09/2020",
    url:"https://rihnogames.com/wp-content/uploads/2020/10/Marvels-Avengers-Free-Download-full-Game.jpg",
    IMDb_rating:8 

}
var avengers3={
    name:"Avengers",
    release_date:"30/09/2020",
    url:"https://wallpaperbat.com/img/227405-avengers-endgame-2019-poster-wallpaper-avengers-movie-posters.jpg",
    IMDb_rating:3

}
var avengers4={
    name:"Avengers",
    release_date:"30/09/2020",
    url:"http://images2.fanpop.com/image/photos/12800000/Avengers-desktop-the-avengers-12873866-1920-1200.jpg",
    IMDb_rating:1

}
var avengers5={
    name:"Avengers",
    release_date:"30/09/2020",
    url:"https://wallpaperbat.com/img/227405-avengers-endgame-2019-poster-wallpaper-avengers-movie-posters.jpg",
    IMDb_rating:10,

}
var avengers6={
    name:"Avengers",
    release_date:"30/09/2020",
    url:"https://rihnogames.com/wp-content/uploads/2020/10/Marvels-Avengers-Free-Download-full-Game.jpg",
    IMDb_rating:2 

}
var avengers7={
    name:"Avengers",
    release_date:"30/09/2020",
    url:"http://images2.fanpop.com/image/photos/12800000/Avengers-desktop-the-avengers-12873866-1920-1200.jpg",
    IMDb_rating:5

}
var avengers8={
    name:"Avengers",
    release_date:"30/09/2020",
    url:"https://rihnogames.com/wp-content/uploads/2020/10/Marvels-Avengers-Free-Download-full-Game.jpg",
    IMDb_rating:7

}
var avengers9={
    name:"Avengers",
    release_date:"30/09/2020",
    url:"http://images2.fanpop.com/image/photos/12800000/Avengers-desktop-the-avengers-12873866-1920-1200.jpg",
    IMDb_rating:8

}
var movies=[avengers,avengers1,avengers2,avengers3,avengers4,avengers5,avengers6,avengers7,avengers8];

var div_cont=document.createElement("div");
    div_cont.setAttribute("class","div_cont_box");

function show_movies(movies){
        
    movies.forEach(function(movies) {
        var div_box=document.createElement("div");
        div_box.setAttribute("class","div_box");
        var img=document.createElement("img");
        img.src=movies.url;
        img.style.width="80%";
        var name=document.createElement("p");
        name.innerText=movies.name;
        var release_date= document.createElement("span");
        release_date.innerHTML=movies.release_date;
        var IMDb_rating=document.createElement("p");
        IMDb_rating.innerText="Rating: "+movies.IMDb_rating;
        
        div_box.append(img,name,release_date,IMDb_rating);
        div_cont.append(div_box);
        
        document.getElementById("movies").parentNode.insertBefore(div_cont,document.getElementById("movies"));
}) ;
}

show_movies(movies);

function low_high(){
    movies.sort(function (a, b) {
        return a.IMDb_rating - b.IMDb_rating;
      });
      console.log(movies);


     var cont=document.querySelectorAll(".div_box");
     console.log(cont);
    for(var i=0;i<cont.length;i++)
    cont[i].remove();
    console.log("removed");

   
    
    var div_con=document.createElement("div");
    div_con.setAttribute("class","div_cont_box");
    show_movies(movies);

}
function high_low(){
    
        movies.sort(function (a, b) {
            return b.IMDb_rating - a.IMDb_rating;
          });
          console.log(movies);
    
    
         var cont=document.querySelectorAll(".div_box");
         console.log(cont);
        for(var i=0;i<cont.length;i++)
        cont[i].remove();
        console.log("removed");
    
       
        
        var div_con=document.createElement("div");
        div_con.setAttribute("class","div_cont_box");
        show_movies(movies);
    
    }
