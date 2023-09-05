import React, { Component } from 'react';

import axios from 'axios'

class Ticketbook extends Component {
  constructor(props) {
    super(props);
    this.state = {
        name:'',
        age:'',
        gender: '',
       mobileno: '',
        source:'',
        degination:'',
        bookdate:''
    };
  }

  handlenameChange = (event) => {
    this.setState({name: event.target.value });
  };

  handleageChange = (event) => {
    this.setState({age: event.target.value });
  };

  handlegenderChange = (event) => {
    this.setState({gender: event.target.value });
  };

  handlemobilenoChange = (event) => {
    this.setState({mobileno: event.target.value });
  };

  handlesourceChange = (event) => {
    this.setState({source: event.target.value });
  };
  handledeginationChange = (event) => {
    this.setState({degination: event.target.value });
  };
  handlebookdateChange = (event) => {
    this.setState({bookdate: event.target.value });
  };

  

  handleSubmit = (event) => {
    event.preventDefault();
    const data = {
        name: this.state.name,
        age: this.state.age,
        gender: this.state.gender,
        mobileno: this.state.mobileno,
        source: this.state.source,
        degination: this.state.degination,
        bookdate: this.state.bookdate,
        
      };
    alert("Successfully you have ticket booked");
      axios.post('http://localhost:8090/post', data)
  };

  render() {
    return (
    <div>
    <a href='/Home'><img  id="pic6" src='https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTBPalrDNnb3tSfDVzPUiS2fO0vXPN4T0bjhl7KG_e2cZAsjeQq&s'></img> </a>
      <form onSubmit={this.handleSubmit} className="book-form">
      <h1>Ticket  Book</h1>  
      <label className="sign-label">Name : </label>
        <input
          className="sign-input"
          type="text"
          value={this.state.name}
          onChange={this.handlenameChange}
        />
   <br></br>
   <br></br>
   <br></br>
        <label className="sign-label">Age : </label>
        <input
          className="sign-input"
          type="number"
          value={this.state.age}
          onChange={this.handleageChange}
        />
        <br></br>
        <br></br>
        <br></br>
        <label className="sign-label">Gender : </label>
        <input
          className="sign-input"
          type="text"
          value={this.state.gender}
          onChange={this.handlegenderChange}
        />
        <br></br>
   <br></br>
   <br></br>
        <label className="login-label">Mobile Number : </label>
        <input
          className="login-input"
          type="number"
          value={this.state.mobileno}
          onChange={this.handlemobilenoChange}
        />
        <br></br>
   <br></br>
   <br></br>

        <label className="sign-label">Source : </label>
        <input
          className="sign-input"
          type="text"
          value={this.state.source}
          onChange={this.handlesourceChange}
        />
        <br></br>
   <br></br>
   <br></br>
        <label className="sign-label">Designation : </label>
        <input
          className="sign-input"
          type="text"
          value={this.state.degination}
          onChange={this.handledeginationChange}
        />
        <br></br>
   <br></br>
   <br></br>
        <label className="sign-label">BookDate : </label>
        <input
          className="sign-input"
          type="text"
          value={this.state.bookdate}
          onChange={this.handlebookdateChange}
        />
        <br></br>
   <br></br>
   <br></br>
        
        <button className="login-button" type="submit">
         submit
        </button>
      </form>
      </div>
    );
  }
}

export default Ticketbook;
