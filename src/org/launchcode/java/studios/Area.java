package org.launchcode.java.studios;

/**
 * Created by catub on 6/26/2017.
 */
public class Area {
    public static void main(String[] args) {
    double area;
    double radius;
    java.util.Scanner in;

    in = new java.util.Scanner(System.in);
    do {
        System.out.println("Enter the radius of your circle: ");
        radius = in.nextDouble();
        if (radius < 0) {
            System.out.println("Please enter a positive value.");
        }
    }
    while (radius < 0);
        area = 3.14 * radius * radius;
        System.out.println("The area of that circle is " + area);
    }
}
