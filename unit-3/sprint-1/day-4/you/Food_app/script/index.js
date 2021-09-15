var timerId;
async function search(search)
{
     let res= await fetch(`https://www.themealdb.com/api/json/v1/1/filter.php?i=${search}`);
      let data= await res.json();
      console.log("data: ",data);
      return data;
          }   


      function display(meal_data){
        console.log("meal",meal_data.meals);
           meal_data.meals.forEach((el) =>{
               let card=document.createElement("div");
                card.setAttribute("id","card");
            let meal_img=document.createElement("img");
              meal_img.src=el.strMealThumb;
            let name=document.createElement("h3");
              name.innerText=el.strMeal;
              
               card.append(meal_img,name);
              display_card_cont.appendChild(card);
              
          }
        );

      }

          async function main(input){
              let meal_data=await search(input);
              
                  // append_data(meal_data);
                 display(meal_data);

          }    
          function debounce(func,delay){
              let display_cont=document.getElementById("display_card_cont");
              display_cont.style.display="flex";
             let input=document.getElementById("search_input").value;
             if(timerId){
                 console.log("timerId: ",timerId);
               clearTimeout(timerId);
             }
             timerId=setTimeout(()=>{func(input);},delay);
          }