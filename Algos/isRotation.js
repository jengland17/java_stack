// Given 2 strings, write a function that returns 'true' if they are rotations of each other (same letters in the same order just shifted by some number of characters) and false if they are not...


// Given ("bingo", "gobin") return true
// Given ("bingo", "oginb") return false 

function isRotation(str1, str2) {

    var s2 = str2 + str2;
    var count = 0;

    if (str1.length !== str2.length) {
        return false;
    }

    for (i of s2) {
        if(i == str1[count]){
            count++;
            if (count == str1.length) {
                return true;
            }
        } else {
            count = 0;
        }
    }

    return false;

}

console.log(isRotation("bingo", "gobin"));
console.log(isRotation("bingo", "oginb"));

