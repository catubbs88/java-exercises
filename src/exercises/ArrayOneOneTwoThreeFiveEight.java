package exercises;

/**
 * Created by catub on 6/27/2017.
 */
public class ArrayOneOneTwoThreeFiveEight {
    public static void main(String[] args){
        int[] theArray = new int[6];

        theArray[0] = 1;
        theArray[1] = 1;
        theArray[2] = 2;
        theArray[3] = 3;
        theArray[4] = 5;
        theArray[5] = 8;

        for (int i = 0; i < theArray.length; i++) {
            System.out.println(theArray[i]);
        }

    }
}
