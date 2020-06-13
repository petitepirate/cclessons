let athleteFinalPosition = 'first place';

switch (athleteFinalPosition) {
	case 'first place':
		console.log('You get the gold medal!');
		break;
	case 'second place':
		console.log('You get the silver medal!');
		break;
	case 'third place':
		console.log('You get the bronze medal!');
		break;
	default:
		console.log('No medal awarded.');
		break;
}

userName = '';
userName ? console.log(`{Hello, $userName}`) : console.log('Hello');
let userQuestion = 'Will I become a werewolf tonight?';
console.log(`The user asked: ${userQuestion}`);
const randomNumber = Math.floor(Math.random() * 8);
let eightBall = '';
switch (randomNumber) {
	case 0:
		eightBall = 'It is certain';
		break;
	case 1:
		eightBall = 'It is decidedly so';
		break;
	case 2:
		eightBall = 'Reply hazy try again';
		break;
	case 3:
		eightBall = 'Cannot predict now';
		break;
	case 4:
		eightBall = 'Do not count on it';
		break;
	case 5:
		eightBall = 'My sources say no';
		break;
	case 6:
		eightBall = 'Outlook not so good';
		break;
	case 7:
		eightBall = 'Signs point to yes';
		break;
}
console.log(`The eight ball answered: ${eightBall}`);
