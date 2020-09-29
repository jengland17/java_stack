public class StringManipulatorTesting {
    
    public static void main(String[] args){


        // trimAndConcat
        StringManipulator manipulator = new StringManipulator();
        String str = manipulator.trimAndConcat("   Hello   ", "   World    ");
        System.out.println(str);

        // getIndexOrNull String char
        Character letter = 'o';
        Integer a = manipulator.getIndexOrNull("Coding", letter);
        System.out.println("a: " + a);
        Integer b = manipulator.getIndexOrNull("Hello World", letter);
        System.out.println("b: " + b);
        Integer c = manipulator.getIndexOrNull("Hi", letter);
        System.out.println("c: " + c);

        // getIndexOrNull String String
        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer d = manipulator.getIndexOrNull(word, subString);
        System.out.println("d: " + d);
        Integer e = manipulator.getIndexOrNull(word, notSubString);
        System.out.println("e: " + e);


        // concatSubstring String int int String
        String test = manipulator.concatSubString("Hello", 1, 2, "World");
        System.out.println(test);

        



    }

}
