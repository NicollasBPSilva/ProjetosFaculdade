document.getElementById("botao").onclick = mudarDiv;

function mudarDiv(){
    let texto = document.getElementById("texto").value;
    document.getElementById("divTitulo").innerHTML = `<h1>${texto}</h1>`;
}