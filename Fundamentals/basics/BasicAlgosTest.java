public class BasicAlgosTest {
    
    public static void main(String[] args) {

        BasicAlgos basic = new BasicAlgos();


        basic.print1To255();
        basic.printOdds();
        basic.printSum();

        int[] a = {1,3,5,7,9,13};
        basic.iterateArray(a);

        int[] x = {1,3,5,7,9,-13};
        basic.findMax(x);

        int[] avg = {2,10,3};
        basic.findAvg(avg);

        basic.oddArray();

        int[] y = {1,3,5,7};
        basic.greaterY(y, 3);

        int[] test1 = {1,5,10,-2};
        basic.negNumber(test1);
        basic.squareVal(test);

        int[] test2 = {1,3,5,7,9,13};
        basic.maxMinAvg(test2);

        int[] test3 = {1,5,10,7,-2};
        basic.shiftVal(test3);


    }



}
