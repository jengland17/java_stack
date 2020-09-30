// Remove array duplicates. Do not alter the original array 
// return the new array with the results 'stable', in the original order
// Given: [1, 2, 1, 3, 4, 2] return [1, 2, 3, 4]

function removeDuplicates1(arr) {

    var newArr = [];
    
    for (var i = 0; i < arr.length; i++) {
        let exists = false;
        for (var j = 0; j < newArr.length; j++) {
            if (arr[i] === newArr[j]) {
                exists = true;
                break;
            }
        }
        if (!exists) {
            newArr.push(arr[i]);
        }
    }
    return newArr;
}

x = removeDuplicates1([1, 2, 1, 3, 4, 2]);
console.log("First algo: ", x);




// Part 2: work 'in place' (alter the original array)
// alter the order if necessary
// Ex. [1, 2, 1, 3, 4, 2] could become [1, 2, 4, 3]

function removeDuplicates2(arr) {

    for (var i = 1; i < arr.length; i++) {
        for (var j = i-1; j >= 0; j--) {
            if (arr[i] === arr[j]) {
                arr[i] = arr.pop();
                i--;
            }
        }
    }

    return arr;

}

y = removeDuplicates2([1, 2, 1, 3, 4, 2]);
console.log("Second algo: ", y);




// Part 3: make the remove duplicates both
// 'in place' and 'stable'
function removeDuplicates3(arr) {
    // TODO: implement remove duplicates here
    return arr;
}