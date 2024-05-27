//*Ejercicio de cajero Electronico
//1- Inicio de sesión
//2- Consultar saldo
//3- Retirar dinero
//4- Transferencia y/o consignación
//5- Salir



var balance = 0;
let intentos = 3;



function mainMenu() {
    console.log("Bienvenido al cajero electronico");
    let opcion = Number(prompt('Seleccione una opción: \n1. Iniciar sesión \n2. Salir')); 
    switch (opcion) { 
        case 1:
            logIn();
            break;
        case 2:
            console.log('Gracias por usar nuestros servicios');
            break;
        default:
            console.log('Opción no válida');
            mainMenu();
            break;
    }

}

function selectionMenu() {
    let opcion = Number(prompt('Seleccione una opción: \n1. Consultar saldo \n2. Retirar dinero \n3. Transferencia y/o consignación \n4. Salir')); //Esto debe ser una función que retorne un valor
    return opcion;
}

function operationExecution(user) {
    console.log('Bienvenido Sr,/Sra.' + user);
    let continuar = true;
    
    while (continuar) {
        let opcion = Number(prompt('Seleccione una opción: \n1. Consultar saldo \n2. Retirar dinero \n3. Transferencia y/o consignación \n4. Salir')); //Esto debe ser una función que retorne un valor
        switch (opcion) { //Esto debe ser una función que reciba un valor
           case 1:
                checkBalance(balance);
                break;
            case 2:
                balance = withdrawMoney(balance); //Esto se debe almacenar en una variable para que se actualice el saldo
                
                break;
            case 3:
                balance = transferMoney(balance);
                break;
            case 4:
                console.log('Gracias por usar nuestros servicios');
                continuar = false;
                break;
            default:
                console.log('Opción no válida');
                operationExecution(user);
                break;
        
        }
       
    }
}


let checkBalance = (value) => {
    console.log("Su saldo es: " + value);
}

const withdrawMoney = (value) => {
    let withdraw = Number(prompt('Ingrese el monto a retirar: '));
    if (withdraw > value) {
        alert(`El valor a retirar ${withdraw} es mayor al saldo disponible ${value}`);
        return;
    }
    value -= withdraw;
    console.log(`Has retirado ${withdraw}. Su nuevo saldo es${value}`)
    return value;
}

const transferMoney = (value) => {
    let transfer = Number(prompt('Ingrese el monto a transferir a su cuenta: '));
    if (transfer <= 0) {
        alert("Ingrese un valor mayor a 0");
        return;
    }
    value = value + transfer;
    console.log(`Has transferido ${transfer}. Su nuevo saldo es ${value}`);
    return value;
}       

const logIn = () => {
    while (intentos > 0) {

        let user = prompt('Ingrese su usuario: ');
        let password = Number(prompt('Ingrese su contraseña: '));
        
        if (user === 'cristian' && password === 1234) {
            operationExecution(user);
            // let repetir = true;
            // while (repetir) {
            //     operationExecution(user);
            //     let continuar = Number(prompt('¿Desea cerrar sesión? \n1. Si \n2. No'));
            //     if (continuar === 1) {
            //         repetir = false;
            //     }else if (continuar === 2) {
            //         operationExecution(user);
            //     } 
            // }
            return user;           
        }else {
            alert('Usuario o contraseña incorrectos');
            
            intentos--;
            if (intentos === 0) {
                console.log("Usuario bloqueado. Contacte al administrador del sistema");
                break
            }
            // alert('Le quedan ' + intentos + ' intentos');
            alert(`Le quedan ${intentos} de 3 intentos`);
        }
    }
}


mainMenu();


//! Tarea
//1. Validar variable saldo para que descuente las transferencias y/o consignaciones
//2. Cada opcion que sea una función independiente y se llame en el switch
//3. Que el menu de opciones sea una función
//4. Que el menu de ejecución sea una función
