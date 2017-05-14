package pointlist;

import static pointlist.PointList.printArray;

/**
 * (Chapt 18, #3) PointList Class This class demonstrates the PointList class in
 * an application.
 *
 * @author olga.osinskaya
 * @param <Point>
 */

public class Demo<Point> {

    public static void main(String args[]) {

        // Create arrays of Integer, Double and Character         
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.println("Array integerArray contains:");
        printArray(intArray);   // pass an Integer array

        System.out.println("\nArray doubleArray contains:");
        printArray(doubleArray);   // pass a Double array

        System.out.println("\nArray characterArray contains:");
        printArray(charArray);   // pass a Character array
    }
}
