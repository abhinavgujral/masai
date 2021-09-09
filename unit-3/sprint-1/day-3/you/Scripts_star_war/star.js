var timerId;
async function search(input){
    // let input=document.getElementById("input").value;     
    let res= await fetch(`https://swapi.dev/api/people/?search=${input}`); //https://swapi.dev/api/people/?search=luke
     
     let data=await res.json();
     //console.log(data.results);
     return data.results;
}

let div_cont=document.createElement("div");
function append_data(a){
    console.log(a);
    console.log("append");

 
   
    div_cont.innerHTML='';
    div_cont.setAttribute("id","input_cont");
    
    a.forEach(({name})=>{
        let a=document.createElement("a");
         a.href="./search_star1.html";
        a.setAttribute("class","selection");
         a.setAttribute("onclick","get(event)");
        a.innerText=name;
        div_cont.appendChild(a);
    
    });
    let main_cont=document.getElementById("main_cont");
    main_cont.appendChild(div_cont);
}
var data;
async function main(input){
 data=await search(input);
append_data(data);
}

function debounce(func,delay)
{
    let input=document.getElementById("input").value;
    
    if(timerId){
      clearTimeout(timerId);
    }
    timerId=setTimeout(()=>{func(input);},delay);
}
function get(e){
  //  e.preventDefault();
    console.log("event:",e.path[0].innerText);
    console.log(data);
     var name=[e.path[0].innerText,data];
     var name_json=JSON.stringify(name);
    localStorage.setItem('selected',name_json);

 }




