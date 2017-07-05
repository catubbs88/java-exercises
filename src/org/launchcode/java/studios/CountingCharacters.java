package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by catub on 6/27/2017.
 */

public class CountingCharacters {
    public static void main(String[] args) {
        String testString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";

        char[] theCharacters = testString.toCharArray();
        HashMap<Character, Integer> counts = new HashMap<>();

        for (Character c : theCharacters) {
            // check to see if there is a key equal to c
            if (counts.containsKey(c)) {
                // if so, increment the corresponding count
                int storage = counts.get(c);
                counts.put(c, storage+1 );
            }
            // if not, add new entry with (c, 1)
            else {
                counts.put(c, 1);
            }

        }

        // print out all of the counts
        for (Map.Entry<Character, Integer> count : counts.entrySet()) {
            System.out.println(count.getKey() + " (" + count.getValue() + ")");
        }

    }
}