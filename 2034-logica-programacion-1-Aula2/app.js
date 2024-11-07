//Variables
let numeroSecreto = 2;
let numeroUsuario;
let intentos = 1;
let palabrasVeces = 'vez';

while (numeroUsuario != numeroSecreto) {

    numeroUsuario = prompt("Me indicas un número entre 1 y 10 por favor:");

    console.log(numeroUsuario);
    /*
    Este código realiza
    la comparación
    */
    if (numeroUsuario == numeroSecreto) {
        //Acertamos, fue verdadera la condición 
        alert(`Acertaste, el numero es: ${numeroUsuario}. Lo hiciste en ${intentos} ${palabrasVeces}`);
    } else {
        if (numeroUsuario > numeroSecreto){
            alert('El numero secreto es menor');
        } else{
            alert('El numero secreto es mayor');
        }
        intentos = intentos + 1;
        palabrasVeces = 'veces'
        //La condición no se cumplió
        alert('Lo siento, no acertaste el número');
    } 
}
