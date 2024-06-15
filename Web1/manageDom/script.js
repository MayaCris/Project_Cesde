function cambiarColor(){
    // let color = document.querySelector('#color')
    let color1 = document.getElementById('color1').value;
    let text1 = document.getElementById('text1').textContent = color1;
    console.log(color1)
    console.log(text1)
    let fondo1 = document.querySelector('#fondo1')
    fondo1.style.backgroundColor = color1;

    let color2 = document.getElementById('color2').value;
    let text2 = document.getElementById('text2').textContent = color2;
    // console.log(color2)
    let fondo2 = document.querySelector('#fondo2')
    fondo2.style.backgroundColor = color2;

    let color3 = document.getElementById('color3').value;
    let text3 = document.getElementById('text3').textContent = color3;
    // console.log(color3)
    let fondo3 = document.querySelector('#fondo3')
    fondo3.style.backgroundColor = color3;
}