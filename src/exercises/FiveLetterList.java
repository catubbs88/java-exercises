package exercises;

import java.util.ArrayList;

/**
 * Created by catub on 6/27/2017.
 */

public class FiveLetterList {
    public static void main(String[] args) {
        ArrayList<String> originalList = new ArrayList<>();
        char[] individualArray;
        ArrayList<String> finalList = new ArrayList<>();

        originalList.add("sally");
        originalList.add("freddie");
        originalList.add("bill");
        originalList.add("teddy");

        for (String targetWord : originalList) {
            individualArray = targetWord.toCharArray();
            if (individualArray.length == 5) {
                finalList.add(targetWord);
            }
        }

        for (String targetWord : finalList) {
            System.out.println(targetWord);
        }
    }
}