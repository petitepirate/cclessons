// my age is 33 //
let myAge = 34;
// first 2 years of dogs are different//
let earlyYears = 2;
earlyYears *= 10.5;
console.log(earlyYears);
console.log(myAge);
// last 31 years behave differently //
let laterYears = myAge - 2;
laterYears *= 4;
console.log(earlyYears);
console.log(laterYears);
myAgeInDogYears = earlyYears + laterYears;
let myName = 'Megan McManus';
console.log(myName.toLowerCase());

console.log(
	`My name is ${myName}. I am ${myAge} years old in human years which is ${myAgeInDogYears} old in dog years.`
);
