//*Ejercicio de cajero Electronico
//1- Inicio de sesión
//2- Consultar saldo
//3- Retirar dinero
//4- Transferencia y/o consignación
//5- Salir



let balance = 1000000;

function cajeroElectronico(user) {
    console.log('Bienvenido al cajero electronico' + user);
    let opcion = Number(prompt('Seleccione una opción: \n1. Consultar saldo \n2. Retirar dinero \n3. Transferencia y/o consignación')); //Esto debe ser una función que retorne un valor
    switch (opcion) { //Esto debe ser una función que reciba un valor
       case 1:
            console.log("Su saldo es: " + balance);
            break;
        case 2:
            let retiro = Number(prompt('Ingrese el monto a retirar: '));
            if (retiro > saldo) {
                alert(`El valor a retirar ${retiro} es mayor al saldo disponible ${balance}`); //comillas para concatenar AltGr + } = ${}
            }else {
                saldo -= retiro;
            }
            break;
        case 3:

    }
}

let intentos = 3;


while (intentos > 0) {

    let user = prompt('Ingrese su usuario: ');
    let password = Number(prompt('Ingrese su contraseña: '));
    
    if (user === 'cristian' && password === 1234) {
        let repetir = true;
        while (repetir) {
            cajeroElectronico(user);
            let continuar = Number(prompt('¿Desea cerrar sesión? \n1. Si \n2. No'));
            if (continuar === 1) {
                repetir = false;
            }else if (continuar === 2) {
                cajeroElectronico(user);
            } 
        }           
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

function operationMenu() {
    console.log('Seleccione una opción: \n1. Consultar saldo \n2. Retirar dinero \n3. Transferencia y/o consignación');
}

function operationExecution() {
    let option = Number(prompt('Seleccione una opción: \n1. Consultar saldo \n2. Retirar dinero \n3. Transferencia y/o consignación'));
    switch (option) {
        case 1:
            console.log('Consultar saldo');
            break;
        case 2:
            console.log('Retirar dinero');
            break;
        case 3:
            console.log('Transferencia y/o consignación');
            break;
        default:
            console.log('Opción no válida');
            break;
    }
}

let checkBalance = (balance) => {
    console.log('Consultar saldo');
}

let withdrawMoney = (balance) => {
    let withdraw = Number(prompt('Ingrese el monto a retirar: '));
    if (withdraw > balance) {
        alert(`El valor a retirar ${withdraw} es mayor al saldo disponible ${balance}`);
    }else {
        balance -= withdraw;
        return balance;
    }
}

let transferMoney = (balance) => {
    let ejemplo = "ejemplo"
    let transfer = Number(prompt('Ingrese el monto a transferir: '));
    if (transfer > 0) {
        balance += transfer;
        return balance, transfer, ejemplo;
    }else {
        alert("Ingrese un valor mayor a 0");
    }
}       


//! Tarea
//1. Validar variable saldo para que descuente las transferencias y/o consignaciones
//2. Cada opcion que sea una función independiente y se llame en el switch
//3. Que el menu de opciones sea una función
//4. Que el menu de ejecución sea una función


