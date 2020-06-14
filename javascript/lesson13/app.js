let raceNumber = Math.floor(Math.random() * 1000);
const registeredEarly = false;
const runnerAge = 18;
if (runnerAge > 18 && registeredEarly === true) {
	console.log((raceNumber += 1000));
}
if (runnerAge > 18 && registeredEarly === true) {
	console.log(`You will race at 09:30am as racer ${(raceNumber += 1000)}`);
} else if (runnerAge > 18 && !registeredEarly) {
	console.log(`You will race at 11:00am as racer ${raceNumber}`);
} else if (runnerAge < 18) {
	console.log(`You will race at 12:30pm as racer ${raceNumber}`);
} else if (runnerAge === 18) {
	console.log('Please see registration desk.');
}
