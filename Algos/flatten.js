// flatten a given array eliminating nested and empty arrays. Do not alter the array
// instead return a new array (you can assume subarrays don't contain more subarrays)
// Given: [1, [2, 3], 4, [ ], 5] return [1, 2, 3, 4, 5]


function flattenArray(arr) {

    var new_arr = [];

    for(var i = 0; i < arr.length ; i++){
        if(typeof(arr[i]) == 'object' ){
            for(var j = 0; j < arr[i].length; j++) {
                new_arr.push(arr[i][j]);
            }
        }
        else{
            new_arr.push(arr[i]);
        }
    }
    return new_arr;
}


x = [1, [2,3], 4, [], 5]
console.log(flattenArray(x));