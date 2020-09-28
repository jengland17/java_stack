// Write a function that takes an array 'function balancePoint(arr)' and returns true if there exists a 'balance point' in the array
// between indicies, where one side's sum is equal to the others
// Example [1, 2, 4, 4, -1, 4] should return 'true'
// 1 + 2 + 4 = 7
// 4 + -1 + 4 = 7

function balancePoint(arr) {

    var left_sum = 0;
    var right_sum = 0;

    for(var i=0; i<arr.length; i++) {
        right_sum += arr[i];
    }

    for(var i=0; i<arr.length; i++) {
        if(left_sum === right_sum) {
            return true;
        }
        right_sum -= arr[i];
        left_sum += arr[i];
    }

    return false;

}

console.log(balancePoint( [1, 2, 4, 4, -1, 4] ));
console.log(balancePoint( [1, 2, 4, 4, 4] ));




// Write a function that takes an array 'function balanceIndex(arr)' that checks for a balance point 'on' a given index
// and returns the index if it exists and '-1' if there is no balance point
// Example [-2, 5, 7, 0, 3] should return '2'
// -2 + 5 = 3 
// 0 + 3 = 3
// the value at the index is not counted when considering the balance for this function

// function balanceIndex(arr) {
//     // our code here
//     // leftsum and rightsum
// }

// console.log(balanceIndex( [-2, 5, 7, 0, 3] ));
// console.log(balanceIndex( [9, 9] ));