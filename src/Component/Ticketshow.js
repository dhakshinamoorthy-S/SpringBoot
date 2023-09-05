import axios from "axios";
import React, { Component } from "react";
import Update from "./Update";
class Ticketshow extends Component {
  state = {
  data: []
  }

  componentDidMount() {
  axios.get('http://localhost:8090/showdetails')
    .then(response => {
      this.setState({ data:response.data });
    })
    .catch(error => {
      console.log(error);
    });
}


deleteBooking = (e, mobileno) => {
    e.preventDefault();
  alert(`The id is ${mobileno}`)
    axios
      .delete(`http://localhost:8090/deletebyid/${mobileno}`)
      .then((response) => {
        // Check if the response data is an array (or whatever structure you expect)
        if (Array.isArray(response.data)) {
          // Update the state with the updated data received from the server
          this.setState({ data: response.data });
          // Show an alert message to inform the user
        } else {
          // Handle unexpected response here (e.g., log an error)
          console.error('Unexpected response data:', response.data);
        }
        alert(`The booking ID: ${mobileno} has been cancelled! Kindly refresh the page.`);
      })
      .catch((error) => {
        console.log(error);
      });
  };
  
  updateBooking= (e,mobileno)=>{
    e.preventDefault();

    this.setState({editData: true , mobileno:mobileno})
  }


  render() {   
    return (
        <div id="log">
      <table border={1}>
      <thead id="as" >
        <tr >
        <th>Name</th>
          <th>Age</th> 
          <th>Gender</th>
          <th>Mobile Number</th>
          <th>Source</th>
          <th>Degination</th>
          <th>BookDate</th>
          
        </tr>
      </thead>
      <tbody id="sd">
        {this.state.data.map(user => (
          <tr key={user.mobileno}>
          <td>{user.name}</td>
            <td>{user.age}</td> 
            <td>{user.gender}</td> 
            <td>{user.mobileno}</td>
            <td>{user.source}</td>
            <td>{user.degination}</td>
            <td>{user.bookdate}</td>
            
            <button id='but2' class="butts" onClick={(e)=>{this.deleteBooking(e,user.mobileno)}}>Cancel Booking!</button>
            <button id='but3' class="butts" onClick={(e)=>{this.updateBooking(e,user.mobileno)}}>Update Details</button>
            
          </tr>
        ))}
      </tbody>
      {this.state.editData && <Update mobileno={this.state.mobileno}/>}

    </table>
    </div>
    );
  }}
  
export default Ticketshow;