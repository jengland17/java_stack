import java.util.*;
import java.util.concurrent.ThreadLocalRandom;


public class PuzzleJava {

    // public void sumAndGreater10(int[] arr) {
    //     ArrayList<Integer> x = new ArrayList<Integer>();
    //     // need sum and numbers greater than 10 from array
    //     int sum = 0;
    //     for (int i =  0; i < arr.length; i++) {
    //         sum += arr[i];
    //         if (arr[i] > 10) {
    //             x.add(arr[i]);
    //         }
    //     }
    //     System.out.println("Sum: " + sum);
    //     System.out.println("Greater: " + x);
    // }

    // public void shuffleNames(String[] arr) {
    //     ArrayList<String> x = new ArrayList<String>();
    //     ArrayList<String> y = new ArrayList<String>();

    //     for (int i = 0; i < arr.length; i++) {

    //         if (arr[i].length() > 5) {
    //             y.add(arr[i]);
    //         }
    //         x.add(arr[i]);
    //     }

    //     Collections.shuffle(x);
    //     System.out.println("List of all: " + x);
    //     System.out.println("List of longer names: " + y);

    // }

    // public void shuffleAlphabet() {
    //     ArrayList<String> x = new ArrayList<String>();
    //     for (char i = 'A'; i <= 'Z'; i++) {
    //         x.add(Character.toString(i));
    //     }

    //     System.out.println("The alphabet: " + x);
    //     Collections.shuffle(x);
    //     System.out.println("Shuffled alphabet: " + x);

    //     System.out.println("First letter: " + x.get(0));
    //     System.out.println("Last letter: " + x.get(25));

    //     String first = x.get(0);

    //     if ("AEIOU".indexOf(first) > 0) {
    //         System.out.println("The first vowel!");
    //     }

    // }

    // public void randNumber() {
    //     ArrayList<Integer> x = new ArrayList<Integer>();

    //     for (int i = 0; i < 10; i++) {
    //         int num = ThreadLocalRandom.current().nextInt(55,101);
    //         x.add(num);
    //     }
    //     System.out.println("Random numbers: " + x);
    // }


    // public void sortedRandNumbers() {
    //     ArrayList<Integer> x = new ArrayList<Integer>();

    //     int min = 101;
    //     int max = 55;

    //     for(int i = 0; i < 10; i++) {
    //         int num = ThreadLocalRandom.current().nextInt(55,101);
    //         x.add(num);
    //         if (num < min) {
    //             min = num;
    //         }
    //         if (num > max) {
    //             max = num;
    //         }
    //     }
    //     Collections.sort(x);
    //     System.out.println("Sorted Random numbers: " + x);
    //     System.out.println("Smallest: " + min);
    //     System.out.println("Largest: " + max);

    // }

    public void randStr() {

        Random rand = new Random();
        StringBuilder randStr = new StringBuilder();

        String alphaNum = "abcdefghijklmnopqrstuvwxyz0123456789";

        for (int i = 0; i < 5; i++) {
            randStr.append(alphaNum.charAt(rand.nextInt(alphaNum.length())));
        }

        String fin = randStr.toString();
        System.out.println("Random String: " + fin);

    }

    public void mutlRandStr() {

        Random rand = new Random();
        StringBuilder randStr = new StringBuilder();
        ArrayList<String> list = new ArrayList<String>();

        String alphaNum = "abcdefghijklmnopqrstuvwxyz0123456789";

        for(int j = 0; j < 10; j++) {
            for (int i = 0; i < 5; i++) {
                randStr.append(alphaNum.charAt(rand.nextInt(alphaNum.length())));
            }
            String fin = randStr.toString();
            list.add(fin);
            randStr.setLength(0);
        }

        System.out.println("Random list: " + list);

    }



}