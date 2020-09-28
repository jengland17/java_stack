import java.lang.Math;

public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {

        System.out.println("Here is legA: " + legA);
        System.out.println("Here is legB: " + legB);

        double legC = (legA * legA) + (legB * legB);
        System.out.println("Here is legC: " + legC);
        double squareRoot = Math.sqrt(legC);
        return squareRoot;
    }
}