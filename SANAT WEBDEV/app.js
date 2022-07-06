const express = require('express');

const path = require('path');
const app = express();
const port =2505;


//Express Releated 
app.use("/static", express.static("static"));//serv static files
app.use(express.urlencoded());//This middle where is used to take theform data to express
//Pug releated
app.get('/',(req,res)=>{
    const con ='The best webpage'
    const params = {'title':'shadow of tomb rider is best',"content":con};
    res.status(200).render('index.pug',params);//the page want to render
});
//start the server
app.listen(port,()=>{
    console.log(`this app runs sucessfully on port ${port}`)
});