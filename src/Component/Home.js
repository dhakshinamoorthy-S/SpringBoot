
import React from "react";
import './styles.css';
import Showdata from "./Logshow";
import Ticketbook from "./Ticketbook";
import Ticketshow from "./Ticketshow";
export default function Home() {
  return (
    <div>
    <div id="head">
    <h1 id="h1">Train Tickets Booking System</h1>
    </div>
    
    <img  id='pic' alt="pic1" src='https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT7hUZN-R6FsfXCu1ksI5ir8bx3cVdKsV3aaStWolG3eREc-Ag&s'></img>
    <img  id='pic1' alt="pic2" src='https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRWYLPV44KCj1H5twQe_8UVq98KqXAHc7fL8qCtnatRPP3pErc&s'></img>
   <a href="/Home"><button id="home">HOME</button></a>
   <a href="/about"><button id="about">ABOUT</button></a>
   <a href="/Contact"><button id="contact">CONTACT AS</button></a>
   <a href="/Signin"><button id="signin">LOGIN/REGISTER</button></a>
   <a href="/Ticketbook"><button id="ticketbook">TICKETBOOK</button></a>
<div>
   <img  id="pic5" src="https://news.cgtn.com/news/2023-07-21/101-killed-180-injured-in-Pakistan-s-monsoon-season-1lC5NvcUPGE/img/72cff03e2262433e8b6fb2cd22ef886e/72cff03e2262433e8b6fb2cd22ef886e.png"></img>
   </div> 
  <div id="io">
  <h2 id="we">Database for Ticket Booking Details : </h2>
  {<Ticketshow/>}
  </div>
    </div>
  )
}
