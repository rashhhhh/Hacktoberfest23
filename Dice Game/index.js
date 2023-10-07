var randomVariable1=Math.floor(Math.random()*6 + 1);
var randomVariable2=Math.floor(Math.random()*6 + 1);

var randomDiceImage1 = "images/dice" + randomVariable1 + ".png";
var randomDiceImage2 = "images/dice" + randomVariable2 + ".png";

document.querySelector(".img1").setAttribute("src", randomDiceImage1);
document.querySelector(".img2").setAttribute("src", randomDiceImage2);


if(randomVariable1===randomVariable2){
  document.querySelector("h1").textContent = "Draw";
}
else if (randomVariable1>randomVariable2) {
  document.querySelector("h1").textContent = "Player 1 Wins";
}
else if (randomVariable1<randomVariable2) {
  document.querySelector("h1").textContent = "Player 2 Wins";
}
