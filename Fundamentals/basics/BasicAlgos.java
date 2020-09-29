import java.util.*;


public class BasicAlgos {

    // Print 1-255
    public void print1To255() {
        for (int i = 1; i <=255; i++) {
            System.out.println("1-255: " + i);
        }
    }

    // Print odds 1-255
    public void  printOdds() {
        for (int i = 0; i < 256; i++) {
            if (i%2 == 1) {
                System.out.print("Odds: " + i);
            }
        }
    }

    // Print Sum 
    public void printSum() {
        int sum = 0;
        for (int i = 0; i < 256; i++) {
            System.out.println("New number: " + i);
            System.out.println("Sum: " + (sum += i));
        }
    }

    // Iterate through array
    public void iterateArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Iteratting: " + arr[i]);
        }
    }

    // find max
    public void findMax(int[] arr) {

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max: " + max); 
    }

    // find average
    public void findAvg(int[] arr) {
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int avg = sum/arr.length;
        System.out.println("Avg: " + avg);
    }

    // odd array
    public void oddArray() {
        ArrayList<Integer> newarr = new ArrayList<Integer>();
        for (int i = 1; i <= 255; i++) {
            if (i % 2 == 1) {
                newarr.add(i);
            }
        }
        System.out.println(newarr);
    }

    // Greater than Y

    public void greaterY(int[] arr, int y) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > y) {
                count++;
            }
        }
        System.out.println("Count: " + count);
    }

    // Square Values

    public void squareVal(int[] x) {
        ArrayList<Integer> z = new ArrayList<Integer>();
        for (int i = 0; i < x.length; i++){
            x[i] = x[i] * x[i];
            z.add(x[i]);
        }
        System.out.println(z);
    }

    // negative number to 0

    public void negNumber(int[] arr) {
        ArrayList<Integer> x = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
            x.add(arr[i]);
        }
        System.out.println("Neg: " + x);
    }

    //max min avg

    public void maxMinAvg(int[] arr) {
        ArrayList<Integer> x = new ArrayList<Integer>();
        int max = arr[0];
        int min = arr[0];
        int sum = 0; 
        for (int i = 0; i < arr.length; i++) {
            //max
            if (arr[i] > max) {
                max = arr[i];
            }
            //min
            if (arr[i] < min) {
                min = arr[i];
            }
            sum += arr[i]; 
        }
        int avg = sum/arr.length;
        Collections.addAll(x, max, min, avg);
        System.out.println("Max Min Avg: " + x);
    }

    //shift value

    public void shiftVal(int[] arr) {
        ArrayList<Integer> x = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                x.add(0);
            }
            else {
                x.add(arr[i+1]);
            }
        }
        System.out.println(x);
    }



}