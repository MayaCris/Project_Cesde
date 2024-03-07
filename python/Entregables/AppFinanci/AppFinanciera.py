from email import header
import sqlite3
from sqlite3 import Error
from datetime import datetime
import random
from tabulate import tabulate
import pandas as pd


class AppFi:
    #Constructor
    def __init__(self, DbBanks):
        self.DbBanks = DbBanks
        self.conn = None
        self.createConnection()
        self.mainMenu()
        self.closeConnection()
       
    #Llama a las funciones de conexión, y crear tabla de usuarios y transacciones       
    def createConnection(self):
        try:
            self.conn = sqlite3.connect(self.DbBanks)
            self.createTableUser()
            self.createTableTransaction()
        except Error as e:
            print("Error al conectar ", e)
        
    #Crear la conexión con la base de datos    
    def closeConnection(self):
        if  self.conn:
            self.conn.close()
    
    #Crear la tabla de usuarios en la base de datos        
    def createTableUser(self):
        cur = self.conn.cursor()
         
        queryUsers = """
        CREATE TABLE IF NOT EXISTS users (
        iduser INTEGER PRIMARY KEY,
        name VARCHAR(100),
        email VARCHAR(100),
        password VARCHAR(50))
        """
        cur.execute(queryUsers)
    
    #Crear la tabla de transacciones en la base de datos
    def createTableTransaction(self):
        cur = self.conn.cursor() #--> Instancia el metodo del cursor para ejecutar la query 
         
        queryTransactions = """
        CREATE TABLE IF NOT EXISTS transactions (
        idtransaction INTEGER PRIMARY KEY,
        iduser INTEGER,
        date DATE,
        typetransaction VARCHAR(100),
        description VARCHAR(200),
        amount REAL,
        balance REAL,
        FOREIGN KEY (iduser) REFERENCES users(iduser))
        """
        try:
            cur.execute(queryTransactions) #--> Ejecuta la query de creación de tabla
        
        except Error as e:
            print("Error al crear la tabla Transactions: ", e)
    
    #Función para mostrar el menu principal        
    def mainMenu(self):
        
        while True: #--> Ejecuta un while para repetir el menu
            print("\nBienvenido a su banco de confianza")
            print("┌" + "".center(35, "─") + "┐")
            print("|" + "Banco OPQ".center(35, " ") + "|")
            print("└" + "".center(35, "─") + "┘\n")
            print("""Menu Principal\n
    Ingrese una de las siguientes opciones:\n
        1. Registrarse
        2. Iniciar sesión
        3. Salir""")
            opc = int(input())
            
            if  opc == 1:
                self.registerUser() #--> Llama a la función de registro
                
            elif opc == 2:
                self.loginUser() #--> Llama a la función de inicio de sesión
                
                
            elif opc == 3: #--> Opción para salir
                print("Saliendo del sistema. Hasta pronto")
                break
            
            else: #--> Opción si se ingresa un número diferente
                print("Ingrese una opción válida")
    

    #Función para registrar un nuevo usuario        
    def registerUser(self):
        
        idUser= int(input("Ingrese su número de identificación:\n"))
        nameUser= str(input("Ingrese su nombre completo: \n"))
        emailUser= str(input("Ingrese su email: \n"))
        
        while True: #--> Ejecuta un while para realizar la validación de la contraseña 2 veces
            
            passwordUser= str(input("Ingrese su contraseña: \n"))
            repeatPassword= str(input("Repita su contraseña: \n"))
            
            #Valida que las contraseñas digitadas sean iguales
            if passwordUser == repeatPassword:
                print("\nUsuario registrado exitosamente\n")
                self.insertUser(idUser, nameUser, emailUser, passwordUser)
                break
            
            #En caso de no coincidir, imprime mensaje
            else:
                print("Las contraseñas no coinciden. Intente de nuevo\n")
        
    #Función para insertar la información del usuario en la base de datos
    def insertUser(self, idUser, nameUser, emailUser, passwordUser):
        
        cur = self.conn.cursor() 
         
        queryInsertUser = """
        INSERT INTO users (iduser, name, email, password) values (?, ?, ?, ?)
        """
        #Ejecuta un try para validar si la inserción de los datos de usuario se realizan correctamente
        try:
            cur.execute(queryInsertUser, (idUser, nameUser, emailUser, passwordUser ))
            self.conn.commit()
        
        except Error as e: #--> Para imprimir el error si se genera
            print("Error al insertar usuario en la base de datos: ", e)                           
                
    #Función para iniciar sesión        
    def loginUser(self):
        tryBlock = 0
        while tryBlock < 3: #--> While para validar los 3 intentos de inicio de sesión
            
            id = int(input("Ingrese su número de identificación:\n"))
            password = str(input("ingrese su contraseña:\n"))
            
            #Query para consultar la información del usuario y realizar la validación de inicio de sesión
            try:
                cur = self.conn.cursor()
                queryConsultUser = "SELECT * FROM users WHERE iduser = ? AND password = ?"
                cur.execute(queryConsultUser, (id, password)) #--> Valida en la base de datos si encuentra un id y password iguaal a los que se ingresaron
                self.currentUser = cur.fetchone() #--> Se almacena la consulta de la base de datos en una variable self. instanciada en la clase
            except Error as e:
                print("Error al seleccionar el ID de la tabla usuario en la base de datos: ", e)

            #Validación si la consulta arroja un resultado --> inicia la sesión
            if self.currentUser is not None:
                print("Inicio de sesión exitoso.") #--> Imprime mensaje
                self.secondMenu() #-->Lleva al menu de operaciones
                return self.currentUser[0] #--> Retorna la información del Id actual para ser usada posteriormente en las demás funciones
                                
            #--> Si no, consume un intento e imprime mensaje    
            else: 
                tryBlock += 1
                print(f"\nError al iniciar sesión. Intento {tryBlock} / 3")
        
        #Si el while se rompe despues de los 3 intentos, imprime mensaje de bloqueo y regresa al menu principal       
        print("Cuenta bloqueada por 24 horas. Comuniquese con nosotros")
        return None
    
    #Muestra el menu secundario o de operaciones        
    def secondMenu(self):
        currentId = self.currentUser[0]
        # Valida si el retorno de la lista self.currentUser[0] en la primera posición está vacío
        if currentId is not None:
            
            while True:
                print("┌" + "".center(35, "─") + "┐")
                print("|" + "Bienvenido al menu de operaciones".center(35, " ") + "|")
                print("└" + "".center(35, "─") + "┘\n")
                
                opc= int(input("""Ingrese una de las siguientes opciones para:
                1. Retirar
                2. Consignar
                3. Consultar saldo
                4. Consultar movimientos
                5. Cambiar Clave
                6. Salir\n"""))
                        
                if opc == 1:
                    self.withdrawal(currentId)
                    
                
                elif opc == 2:
                    self.deposit(currentId)
                
                elif opc == 3:
                    self.consultBalance(currentId)
                
                elif opc == 4:
                    self.consultTransactions(currentId)
                
                elif opc == 5:
                    self.changePassword(currentId)
                
                elif opc == 6:
                    print("\nSaliendo de la sesión. Hasta pronto. \n")
                    return False
                
                else:
                    print("Ingrese una opción válida ")
    
    #Función para realizar un retiro de la cuenta
    def withdrawal(self, currentUser):
        currentId = self.currentUser[0] #--> Instancia el usuario actual
        
        amount = int(input("Ingrese la cantidad a retirar:\n ")) #-->Solicita información del valor
        description = str(input("Ingrese una breve descripción:\n ")) #--> Solicita descripcion
        
        currentBalance = self.getBalance(currentId) #-->Llama a la función que consulta el saldo del usuario.
        
        if currentBalance == 0: #--> Si el saldo es 0, imprime mensaje y retorna de nuevo al menu de operaciones
            print("\nRevisa tu balance, no cuentas con saldo para realizar esta operación")
            self.secondMenu()
        
        if amount > currentBalance:
            print("\nEl valor a retirar supera su saldo. Por favor valide\n")
            self.secondMenu()
        
        #Valida si la cantidad a retirar es positiva                        
        if amount > 0:
            newBalance = currentBalance - amount #-->Actualiza el saldo
            idTransaction = random.randint(1000,9999) #-->Genera un id de la transaccion
            date = datetime.now() #-->Guarda la fecha y hora de la transaccion
            typeTransaction = "Retiro" #-->Asgina un tipo de transaccion
            print("\nFelicidades, su retiro ha sido exitoso") 
            print(f"Su nuevo saldo es  {newBalance}\n") #-->Imprime mensaje con el saldo
            self.insertTransaction(idTransaction, currentId, date, typeTransaction, description, amount, newBalance) #-->Llama a la función insertTransaction y le pasa las variables almacenadas
            
        #Si el valor del retiro no es positivo, imprime mensaje y lo regresa al menu de operaciones   
        else:
            print("Error al realizar el retiro. Ingrese una cantidad válida")
            self.secondMenu()
            
    #Función para insertar las transacciones en la base de datos, a la cual se le pasan las variables que debe ingresar
    def insertTransaction(self, idtransaction, currentId, date, typetransaction, description, amount, newBalance):
        try:
            cur = self.conn.cursor()
            queryInsertTransaction = """
            INSERT INTO transactions (idtransaction, iduser, date, typetransaction, description, amount, balance) values (?, ?, ?, ?, ?, ?, ?)
            """
            cur.execute(queryInsertTransaction, (idtransaction, currentId, date, typetransaction, description, amount, newBalance))
            self.conn.commit() #-->Metodo para que se finalice la inserción en la base de datos
        
        except Error as e:
            print("Error al ingresar el retiro en la base de datos: ", e)     
        
    #Función para consultar e imprimir el saldo de la cuenta y se le pasa como atributo el usuario actual    
    def consultBalance(self, currentUser):
        currentId = self.currentUser[0]

        currentBalance = self.getBalance(currentId) #-->Llama a la función para consultar el saldo en la base de datos
        
        print(f"\nEl saldo actual es de: {currentBalance}" ) #-->Imprime el saldo actual
    
    #Función para realizar el deposito, se le pasa el atributo del usuario actual                    
    def deposit(self, currentUser):
        currentId = self.currentUser[0]
        
        amount = int(input("Ingrese el valor a consignar:\n "))
        description = str(input("Ingrese una breve descripción:\n "))
        
        currentBalance = self.getBalance(currentId)
        
        #Valida si el valor a consignar es positivo    
        if amount > 0 :
            newBalance = currentBalance + amount #--> Actualiza el saldo
            idTransaction = random.randint(1000,9999) #-->Crea un id para la transacción
            date = datetime.now() #-->GGuarda la fecha de la transacción
            typeTransaction = "Consignación"
            print("\nFelicidades, su consignación ha sido exitosa")
            print(f"Su nuevo saldo es  {newBalance}\n")
            self.insertTransaction(idTransaction, currentId, date, typeTransaction, description, amount, newBalance)
            
        #Si el valor es negativo, imprime mensaje y regresa al menu de operaciones    
        else:
            print("Error al realizar la consignación. Ingrese un valor positivo\n ")
            self.secondMenu()
    
    #Función para mostrar transacciones realizadas consultando la base de datos transactions     
    def consultTransactions(self, currentUser):
        currentId = self.currentUser[0]
        
        queryConsultTransactions = "SELECT * FROM transactions WHERE iduser = ? ORDER BY date ASC"
                        
        try:
            cur = self.conn.cursor()
            cur.execute(queryConsultTransactions, (currentId,))
            transactions = cur.fetchall()
        except Error as e:
            print("Error al obtener el saldo actual del usuario", e)
        
        pdtransactions = pd.DataFrame(transactions, columns=['idtransaction', 'iduser', 'date', 'typetransaction', 'description', 'amount', 'balance'])
        tableTransactions = [
            [
                pdtransactions['idtransaction'].values[i],
                pdtransactions['date'].values[i],
                pdtransactions['typetransaction'].values[i],
                pdtransactions['description'].values[i],
                pdtransactions['amount'].values[i],
                pdtransactions['balance'].values[i],
                
            ] for i in range(len(pdtransactions))
        ]
        print("El detalle de los movimientos realizados es:\n")
        
        print(tabulate(tableTransactions, headers=['Código', 'Fecha', 'Tipo', 'Descripción', 'Valor', 'Saldo'],tablefmt='rounded_grid', disable_numparse=True))
        
        self.secondMenu()
    
    #Función para obtener el balance desde la base de datos, pasandole el atributo del usuario actual
    def getBalance(self, userId):
        currentId = self.currentUser[0]
        queryConsultBalance = "SELECT balance FROM transactions WHERE iduser = ? ORDER BY date DESC LIMIT 1"
                
        try:
            cur = self.conn.cursor()
            cur.execute(queryConsultBalance, (currentId,))
            currentBalance = cur.fetchone()
            if currentBalance is None:
                return 0
            else:
                newCurrentBalance = currentBalance[0]
                return newCurrentBalance
            
        except Error as e:
            print("Error al obtener el saldo actual del usuario", e)
    
    #Función para cambiar la contraseña del usuario actual        
    def changePassword(self, userId):
        currentId = self.currentUser[0] #-->Instanciar el usuario actual
        queryConsultPassword = "SELECT password FROM users WHERE iduser = ?" #-->Query para consultar la contraseña
        
        try:
            cur = self.conn.cursor()
            cur.execute(queryConsultPassword, (currentId,)) #-->Ejecuta la consulta
            currentPassword = cur.fetchone() #--> Guarda la consulta en currentPassword
        except Error as e:
            print("Error al obtener la contraseña actual del usuario", e)
        
        passwordUser = str(input("Ingrese su contraseña actual: \n"))
        
        #Ejecución del While para validar la contraseña actual y las nuevas contraseñas ingresadas
        while True:
            self.newPassword = str(input("Ingrese su nueva contraseña: \n"))
            repeatPassword = str(input("Repita su nueva contraseña: \n"))
            
            #Si la contraseña actual coincide con la digitada
            if passwordUser == currentPassword[0]:
                if self.newPassword == repeatPassword: #-->Valida si las dos contraseñas coinciden
                    self.updatePassword(self.newPassword, currentId) #-->Llama la función de actualizar contraseña en la base de datos 
                    return False #-->Rompe el While
                
                #Si no coinciden las dos contraseñas, validar y repite el While    
                else:
                    print("Las contraseñas ingresadas no coinciden")
            
            #Si la contraseña actual no coincide, imprime mensaje
            else:
                print("La contraseña actual es incorrecta")
            
    #Función para actualizar la contraseña en la base de datos
    def updatePassword(self,newPassword,userId):
        currentId = self.currentUser[0]
        newPassword =self.newPassword
           
        queryUpdatePassword = """UPDATE users SET password = ? WHERE iduser = ?"""
        
        try:
            cur = self.conn.cursor()
            cur.execute(queryUpdatePassword, (newPassword, currentId,)) #-->Actualiza la base de datos con la query de update según las variables suministradas
            self.conn.commit()
            
        except Error as e:
            print("Error al obtener la contraseña actual del usuario", e)
        
        print("Su cambio de contraseña ha sido exitoso")
                

#Función para llamar la ejecución de todo el programa
def ejecucion():

    DbBanks = r"Entregables\AppFinanci\DbBanks.db" #--> Se le asigna la ubicación del archivo de la base de datos
    dbManager = AppFi(DbBanks) #-->Se instancia la clase AppFi, que maneja todo el programa

if __name__ == '__main__':
    ejecucion() 
    
    