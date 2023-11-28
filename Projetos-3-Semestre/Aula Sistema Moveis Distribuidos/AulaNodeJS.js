// Apresentação das variaveis

"Use stric"

var a = 1;
let b = 2;
const c = 50;

var a = 2;
let d = 10;
console.log(a, b, c, d);

// Testando a primeira função

var globalGreeting = "Good";

function testFunction(){
    var localGreeting = "Morning ";
    console.log("function: ");
    console.log(globalGreeting);
    console.log(localGreeting);
}

testFunction();

console.log("main program: ");
console.log(globalGreeting);

// Testando variaveis do tipo boolean

let isDateValid = true;
let isStringTooLong = false;
let isGameOver = false;
let continueLoop = true;

console.log(false);
console.log(typeof false);
console.log(isDateValid);
console.log(typeof isDateValid);

// Testando variaveis binarias

const year = 1991;
let delayInSeconds = 0.00016;
let area = (16*3.14);

console.log(year);
console.log(typeof year);

let a1 = 10;
let b1 = 0*10;
let c1 = 0o10;
let d1 = 0b10;

console.log(a1);
console.log(b1);
console.log(c1);
console.log(d1);

let x = 9e3;
let y = 123e-5;

console.log(x);
console.log(y);

let z = 0x21;
console.log(z);

// Testando variaveis String

let country = "Malawi";
let continent = "Africa";

console.log(country);
console.log(typeof country);
console.log(continent);
console.log(typeof continent);

let message1 = "The vessel 'Mars' called at port.";
let message2 = 'Cyclone "Cilida" to pass cloese to Mauritius';

console.log(message1);
console.log(message2);