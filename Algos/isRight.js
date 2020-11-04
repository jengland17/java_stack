// Given 3 numbers, return true if they could be the sides of a right triangle (the Pythagorean theorem may prove useful a^2 + b^2 = c^2) and false if not. The values can be provided in any order, 'c' is not necessarily the largest.

// Given (4, 5, 3) return true
// Given (3, 3, 3) return false

function isRight(a, b, c) {

    if (a > 0 && b > 0 && c > 0) {

        const tri1 = (a*a) === (b*b) + (c*c);
        const tri2 = (b*b) === (a*a) + (c*c);
        const tri3 = (c*c) === (a*a) + (b*b);
    
        return tri1 || tri2 || tri3;

    }

    return false;

}

console.log(isRight(4,5,3));

console.log(isRight(3,3,3));