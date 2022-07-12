function js_style(){
    //Font style added by JS
    text.style.fontSize="14pt";
    text.style.fontFamily="Comic Sans MS";
    text.style.color="green";
}
function getFromValue(){
    var x = document.getElementById("form1");
    for(var i ; i< x.length; i++){
        if(x.elements[i].value!='Submit'){
            console.log(x.elements[i].value)
        }
    }
}
function getAttributes(){
    var u = document.getElementById("w3d").href;
    alert('The value of the codes are the basic :' + u);
    var v = document.getElementById("w3d").href;
    alert('The value of the codes are the basic :' + v);
    var w = document.getElementById("w3d").href;
    alert('The value of the codes are the basic :' + w);
    var x = document.getElementById("w3d").href;
    alert('The value of the codes are the basic :' + x);
    var y = document.getElementById("w3d").href;
    alert('The value of the codes are the basic :' + y);
}
function insert_Row(){
    var x = document.getElementById('sampletable').insertRow(0);
    var y = x.insertCell(0);
    y.innerHTML ="New Cell1";
    y.innerHTML = "New Cell2";
}