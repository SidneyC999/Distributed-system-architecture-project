var body = document.body;
var date = new Date();
var h = date.getHours();
if(h>=17 && h<20){
    body.style.background = "url(image/黄昏.gif) no-repeat";
}else if(h<6 || h>=20){
    body.style.background = "url(image/夜景.gif) no-repeat";
}
    body.style.backgroundSize = "cover";
