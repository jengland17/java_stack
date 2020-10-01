// Given a value N, return the corresponding row from Pascal's triangle as an array

// N      Array
// ----------------------
// 0 => [1]
// 1 => [1, 1]
// 2 => [1, 2, 1]
// 3 => [1, 3, 3, 1]
// 4 => [1, 4, 6, 4, 1]
// 5 => [1, 5, 10, 10, 5, 1]


function triangle(n) {

    var arr = {};

    for (var i = 0; i < n; i++) {

        arr[i] = [];

        for (var j = 0; j < i + 1; j++) {

            if (j === 0 || j === i) { 
                arr[i][j] = 1;
            }
            else {
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
            
        }
    }

    return arr;

}

console.log(triangle(6)); 