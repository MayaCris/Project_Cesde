// let variasCosas = [1, "hola", true, 4.5, {nombre: "Juan", edad: 23}, 
// [1, 2, 3, 4, 5], function() {console.log("Hola mundo")}];

// console.log(variasCosas[5]); //Se accede a un elemento de un arreglo anidado

// let variasCosas1 = [true, false];
// console.log(variasCosas1)

// variasCosas1.pop();
// console.log(variasCosas1)

// variasCosas1.push("Cristian");
// console.log(variasCosas1)

// variasCosas1.push("false","121212");
// console.log(variasCosas1)

// variasCosas1.shift();
// console.log(variasCosas1)

// variasCosas1.unshift("Estudiante","3127845");
// console.log(variasCosas1)

let personas = [
    {
        "id": "1841970123",
        "first_name": "Gerardo",
        "last_name": "MacCleod",
        "email": "gmaccleod0@ustream.tv",
        "gender": "Male",
        "age": 45
      },
      {
        "id": "3809818011",
        "first_name": "Lenard",
        "last_name": "Brokenshaw",
        "email": "lbrokenshaw1@uol.com.br",
        "gender": "Male",
        "age": 33
      },
      {
        "id": "5147807268",
        "first_name": "Joane",
        "last_name": "Guerin",
        "email": "jguerin2@blog.com",
        "gender": "Female",
        "age": 39
      },
      {
        "id": "7272139846",
        "first_name": "Adlai",
        "last_name": "Dyke",
        "email": "adyke3@reuters.com",
        "gender": "Male",
        "age": 51
      },
      {
        "id": "1390533697",
        "first_name": "Aveline",
        "last_name": "Dorrington",
        "email": "adorrington4@amazonaws.com",
        "gender": "Female",
        "age": 53
      },
      {
        "id": "8484413950",
        "first_name": "Thorsten",
        "last_name": "Bill",
        "email": "tbill5@soundcloud.com",
        "gender": "Male",
        "age": 22
      },
      {
        "id": "3396414020",
        "first_name": "Maddy",
        "last_name": "Cappel",
        "email": "mcappel6@senate.gov",
        "gender": "Female",
        "age": 36
      },
      {
        "id": "3396520122",
        "first_name": "Timmie",
        "last_name": "Dominici",
        "email": "tdominici7@godaddy.com",
        "gender": "Male",
        "age": 41
      },
      {
        "id": "7702895608",
        "first_name": "Camilla",
        "last_name": "Jeffs",
        "email": "cjeffs8@opensource.org",
        "gender": "Female",
        "age": 45
      },
      {
        "id": "8399889156",
        "first_name": "Naoma",
        "last_name": "Bartocci",
        "email": "nbartocci9@tinypic.com",
        "gender": "Female",
        "age": 25
      },
      {
        "id": "7307315009",
        "first_name": "Seamus",
        "last_name": "Ellerton",
        "email": "sellertona@google.com.hk",
        "gender": "Genderqueer",
        "age": 19
      },
      {
        "id": "9548705966",
        "first_name": "Marcos",
        "last_name": "Spender",
        "email": "mspenderb@squidoo.com",
        "gender": "Male",
        "age": 17
      },
      {
        "id": "4413606515",
        "first_name": "Zach",
        "last_name": "Salan",
        "email": "zsalanc@vistaprint.com",
        "gender": "Male",
        "age": 18
      },
      {
        "id": "5114780921",
        "first_name": "Bradford",
        "last_name": "Blakely",
        "email": "bblakelyd@usda.gov",
        "gender": "Male",
        "age": 28
      },
      {
        "id": "1550409948",
        "first_name": "Coleman",
        "last_name": "Windous",
        "email": "cwindouse@bizjournals.com",
        "gender": "Male",
        "age": 34
      }
]

// let newPerson = personas.map((item) => item.edad = item.age + 10);
// console.log(newPerson);

let newPerson1 = personas.filter((personas) => personas.age > 40);
console.log(newPerson1);
