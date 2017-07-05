package exercises;

/**
 * Created by catub on 6/26/2017.
 */

public class Hello {
    public static void main(String[] args) {
        String name;
        java.util.Scanner in;

        in = new java.util.Scanner(System.in);
        System.out.println("What is your name?");
        name = in.next();
        System.out.println("Hello, " + name);
    }
}
