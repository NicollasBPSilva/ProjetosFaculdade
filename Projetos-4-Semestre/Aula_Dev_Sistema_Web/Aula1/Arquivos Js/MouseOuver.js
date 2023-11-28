document.getElementById("botao").addEventListener(
    "mouseover", mouseEmCima
);

document.getElementById("botao").addEventListener(
    "mouseout", MouseFora
);

function mouseEmCima(){
    let elemento = document.getElementById("botao");
    elemento.style.cursor = "hand";
    elemento.style.backgroundColor = "cyan";
    elemento.innerHTML = "Mouseover";
}

function MouseFora(){
    let elemento = document.getElementById("botao");
    elemento.style.backgroundColor = "white";
    elemento.innerHTML = "Mouseout";
}