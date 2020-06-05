const kelvin = 293
const celsius = kelvin - 273;
let farenheight = celsius * (9 / 5) + 32;
farenheight = Math.floor(farenheight);
console.log(`The temperature is ${farenheight} degrees Farenheight.`);
let newton = celsius * (33 / 100);
newton = Math.floor(newton);
console.log(`The temperature is ${newton} newtons.`);
