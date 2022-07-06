const express = require('express');

const path = require('path');
const fs = require('fs');
const app = express();
const port = 2555;
//Express Releated Stuffs
app.use("/static",express.static("static"));//serv static files
app.use(express.urlencoded());//This is used to take the form data to express
//Pug releated stuff
app.set("view engine", "pug");//set the template engine to pug
app.set('view', path.join(__dirname,'views'))
