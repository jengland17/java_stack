public class JavaFun {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        name("Joshua");
        age(24);
        home("Midlothian", "TX");

    }

    public static void name(String name) {
        System.out.println("My name is " + name);
    }

    public static void age(Number age) {
        System.out.println("I am " + age + " years old");
    }

    public static void home(String city, String state) {
        System.out.println("My hometown is " + city + "," + state);
    }


}