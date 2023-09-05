import axios from "axios";
import React, { Component } from "react";
import './styles.css';

class Showdata extends Component {
  state = {
  data: []
  }

  componentDidMount() {
  axios.get('http://localhost:8090/showdetails1')
    .then(response => {
      this.setState({ data: response.data });
    })
    .catch(error => {
      console.log(error);
    });
}


  render() {   
    return (
      <div id="log">
      <table border={1} >
      <thead id="as" >
        <tr>
        <th>Mailid</th>
          <th>UserName</th> 
          <th>Password</th>
          
        </tr>
      </thead>
      <tbody id="sd">
        {this.state.data.map(user => (
          <tr key={user.mailid}>
          <td>{user.mailid}</td>
            <td>{user.username}</td>  
            <td>{user.password}</td>
            
          </tr>
        ))}
      </tbody>
    </table>
    
    </div>
    );
   
  }}
  
export default Showdata;