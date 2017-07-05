package exercises;

/**
 * Created by catub on 6/27/2017.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class EvenNumberSum {
    public static void main (String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        int sumOfEvenNumbers = 0;

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        for (Integer number : numbers) {
            if (number % 2 == 0) {
               sumOfEvenNumbers += number;
            }
        }
        System.out.println("The sum of the even numbers is " + sumOfEvenNumbers );
    }
}
