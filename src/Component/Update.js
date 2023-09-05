import axios from 'axios';
import React, { Component } from 'react'

export default class Update extends Component {

    constructor(props) {
        super(props);
        this.state = {
          name: '',       
          age: '',
         gender: '',
         mobileno: '',
          source: '',
          degination: '',
          bookdate: '',
        };
      }
      

      componentDidMount() {
        const { mobileno} = this.props;
      
        axios
          .get(`http://localhost:8090/showbyid/${mobileno}`)
          .then((response) => {
            const { name, age,  gender,mobileno, source,degination,bookdate } = response.data;
            this.setState({
                name,
                age,
                gender,
                mobileno,
                source,
                degination,
                bookdate,
            });
          })
          .catch((error) => {
            console.log(error);
          });
      }
      


    handleSubmit= (e)=>{
        e.preventDefault();
        
        const formData={
            name:this.state.name,
            age:this.state.age,
            gender:this.state.gender,
            mobileno:this.state.mobileno,
            source:this.state.source,
            degination:this.state.degination,
            bookdate:this.state.bookdate,
        };
        
      axios.put(`http://localhost:8090/put`,formData)
      .then(response => {
        console.log(response.data);
      })
      .catch(error => {
        console.error(error);
      })
      alert("Sucessfullyupdated")
  };

  render() {
    return (
      <div id='box5'>
      <form id="text1" onSubmit={this.handleSubmit}>
        <br/>
        <label>Name</label>
        <input type="text" id="uname" class="field1" value={this.state.name} onChange={(e)=>{this.setState({name:e.target.value})}}/>
        <br/><br/>

        <label>Age</label>
        <input type="number" id="age" class="field1" value={this.state.age} onChange={(e)=>{this.setState({age:e.target.value})}}/>
        <br/><br/>

        <label>Gender</label>
        <input type="text" id="num" class="field1" value={this.state.gender} onChange={(e)=>{this.setState({gender:e.target.value})}}/>
        <br/><br/>

        <label>Mobile Number</label>
        <input type="number" id="num" class="field1" value={this.state.mobileno} onChange={(e)=>{this.setState({mobileno:e.target.value})}}/>
        <br/><br/>

        <label>source :</label>
        <input type="text" id="num" class="field1" value={this.state.source} onChange={(e)=>{this.setState({source:e.target.value})}} />
        <br/><br/>

        <label>degination :</label>
        <input type="text" id="num" class="field1" value={this.state.degination} onChange={(e)=>{this.setState({degination:e.target.value})}} />
        <br/><br/>

        <label> bookdate :</label>
        <input type="text" id="num" class="field1" value={this.state.bookdate} onChange={(e)=>{this.setState({bookdate:e.target.value})}}/>
        <br/><br/>
        <button type="submit" id="reg">Submit!</button>
        </form>
      </div>
    )
  }
}
