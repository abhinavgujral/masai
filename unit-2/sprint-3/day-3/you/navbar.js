var nav_cont = document.getElementById('nav_cont');
nav_cont.style.border = "2px solid black";
nav_cont.style.fontSize="30px";
nav_cont.style.fontWeight="bold";
nav_cont.style.height="30px";
nav_cont.style.padding="1%";
nav_cont.style.margin="1%";
nav_cont.style.paddingBottom="2%";


var nav_home = document.createElement('a');
nav_home.setAttribute('href','Home.html');
nav_home.style.textDecoration="none";
nav_home.style.color = "black";
nav_home.innerText="Home";
nav_home.style.cssFloat = "right";
nav_home.style.margin="1%";

var nav_login = document.createElement('a');
nav_login.setAttribute('href','Login.html');
nav_login.style.textDecoration="none";
nav_login.style.color = "black";
nav_login.textContent="Login";
nav_login.style.cssFloat = "right";
nav_login.style.margin="1%";


var nav_signup = document.createElement('a');
nav_signup.setAttribute('href','Signup.html');
nav_signup.style.textDecoration="none";
nav_signup.style.color = "black";
nav_signup.textContent="Sign Up";
nav_cont.style.overflow = "right";
nav_signup.style.cssFloat = "right";
nav_signup.style.margin="1%";

nav_cont.append(nav_signup,nav_login,nav_home);



var img1=document.getElementById("img1");
var img2=document.getElementById("img2");
var img3=document.getElementById("img3");
function carousel(){
    if(x==1){
    img1.remove();
    img2.remove();
    }
    else if(x==2)
    {
        img2.remove();
    }

}


/* ------signup------- */
function signupsubmitForm(e){
    e.preventDefault()
    console.log("In Js")
     var credentials={
  name:document.getElementById("name").value,
  phone:document.getElementById("phone").value,
  email:document.getElementById("email").value,
  password:document.getElementById("password").value,
 };
 

 console.log(credentials);
 var json_credentials=JSON.stringify(credentials);
 localStorage.setItem("credentials",json_credentials);


}
/* ------login----- */
function loginsubmitForm(e){
    
       e.preventDefault();
    let get_credentials =JSON.parse(localStorage.getItem('credentials'));
    console.log(get_credentials);
    var get_form={
        name:document.getElementById('name').value,
        password:document.getElementById('password').value,

    }
    console.log(get_form);
    if(get_form.name==get_credentials.name&&get_form.password==get_credentials.password)
    {
        window.location.href = 'Home.html';
      
        
    }
    else{
        console.log("login fail");
        alert("login Failed Check credentials!");
    }

}