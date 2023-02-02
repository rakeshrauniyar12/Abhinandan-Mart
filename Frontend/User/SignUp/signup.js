
  document.querySelector("#submit").addEventListener("click",()=>{
    registerUser();
  })
let registerUser= async ()=>{
    let firstName=document.querySelector("#name").value;
    let lastName=document.querySelector("#lname").value;
    let userEmail=document.querySelector("#email").value;
    let password=document.querySelector("#password").value;
    let userMobile=document.querySelector("#mobile").value;
    let city=document.querySelector("#city").value;
    let state=document.querySelector("#state").value;
    let pincode=document.querySelector("#pincode").value;
    let country=document.querySelector("#country").value;
    let userData={
        firstName,lastName,userEmail,password,userMobile,address:{
            city,state,pincode,country
        }
    };
  console.log(userData)
    let res = await fetch("http://localhost:8090/registeruser",{
        method:"POST",
        body:JSON.stringify(userData),
        headers:{
            "Content-Type":"application/json"
        }
    })
    res = await res.json();
    document.querySelector("#name").value="";
    document.querySelector("#lname").value="";
    document.querySelector("#email").value="";
    document.querySelector("#password").value="";
    document.querySelector("#mobile").value="";
    document.querySelector("#city").value="";
    document.querySelector("#state").value="";
    document.querySelector("#country").value="";
    document.querySelector("#pincode").value="";
}