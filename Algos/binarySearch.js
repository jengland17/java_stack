// Given an array of numbers that are organized in ascending order and a number 'value' 
// return true if the value is present

function binarySearch(arr, value) {

    let start = 0;
    let end = arr.length - 1;

    while (start <= end) {

        let i = Math.floor((start + end) / 2);

        if (arr[i] === value) {
            return true;
        }
        else if (arr[i] < value) {
            start = i + 1;
        }
        else {
            end = i - 1;
        }

    }

    return false;

}

x = binarySearch([1, 2, 33, 44, 56, 78, 94], 33);
y = binarySearch([1, 2, 33, 44, 56, 78, 94], 100);

console.log("x: ", x);
console.log("y: ", y);

// do we need to check every value in the array? can we speed up the search process?


function binarySearch2(arr, value) {

    var start = 0;
    var end = arr.length - 1;

    while (start <= end) {

        var mid = Math.floor((end - start) / 2);

        if (arr[mid] === value) {
            return true;
        }

        if (value > arr[mid]) {
            start = mid + 1;
        }

        else if (value < arr[mid]) {
            end = mid - 1;
        }

    }

    return false;

}

a = binarySearch2([2,3,4,6,8,10,11,12,13,15,17,21,22], 17);
console.log("a: ", a);