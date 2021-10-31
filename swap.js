//JavaScript program to swap two variables

//take input from the users
let c = prompt('Enter the first variable: ');
let d = prompt('Enter the second variable: ');

//create a temporary variable
let temp;

//swap variables
temp = c;
c = d;
d = temp;
console.log(`The value of a after swapping: ${c}`);
console.log(`The value of b after swapping: ${d}`);
