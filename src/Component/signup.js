import React, { Component } from 'react';
import axios from 'axios'

class Signup extends Component {
  constructor(props) {
    super(props);
    this.state = {
        mailid:'',
        username:'',
        password: '',
        
    };
  }

  handleIdChange = (event) => {
    this.setState({   mailid: event.target.value });
  };

  handleNameChange = (event) => {
    this.setState({ username: event.target.value });
  };

  handleEmailChange = (event) => {
    this.setState({ password: event.target.value });
  };

 

  

  handleSubmit = (event) => {
    event.preventDefault();
    const data = {
      mailid: this.state.  mailid,
      username: this.state.username,
      password: this.state.password,
       
        
      };
    alert("You have successfully Signed")
      axios.post('http://localhost:8090/post1', data)
  };

  render() {
    return (
      <div>
      <a href='/Home'><img  id="pic4" src='https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTBPalrDNnb3tSfDVzPUiS2fO0vXPN4T0bjhl7KG_e2cZAsjeQq&s'></img> </a>
      <form onSubmit={this.handleSubmit} className="sign-form">
      
      <h1>Register</h1>
      <label className="sign-label">Mailid  </label>
        <input
          className="sign-input"
          type="email"
          value={this.state.  mailid}
          onChange={this.handleIdChange}
        />
        <br></br>
        <br></br>
        <label className="sign-label">UserName </label>
        <input
          className="sign-input"
          type="text"
          value={this.state.username}
          onChange={this.handleNameChange}
        />
        <br></br>
        <br></br>
        <label className="sign-label">Password   </label>
        <input
          className="sign-input"
          type="password"
          value={this.state.password}
          onChange={this.handleEmailChange}
        />
        <br></br>
        <br></br>
        <br></br>
        <button className="login-button" type="submit">
          Sign Up
        </button>
        <br></br>
        <br></br>
        <h2>You have account please login in</h2>
        <a href='/Signin'>Click here</a>
      </form>
      </div>
    );
  }
}

export default Signup;
