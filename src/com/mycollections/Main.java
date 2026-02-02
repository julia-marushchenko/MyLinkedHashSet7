/**
 *  Java program to remove collection from LinkedHashSet.
 */

package com.mycollections;

import java.util.LinkedHashSet;

/**
 *  Main class.
 */
public class Main {

    // Main method to run java program.
    public static void main(String[] args) {

        // Creating an empty LinkedHashSet.
        LinkedHashSet<Float> mySet = new LinkedHashSet<>();

        // Adding elements to mySet.
        mySet.add(78f);
        mySet.add(12.7f);
        mySet.add(44.8f);
        mySet.add(95f);
        mySet.add(54f);

        // Creating another collection.
        LinkedHashSet<Float> mySet1 = new LinkedHashSet<>();
        mySet1.add(78f);
        mySet1.add(44.8f);
        mySet1.add(95f);

        // Removing elements of mySet1 from mySet.
        mySet.removeAll(mySet1);

        // Printing elements of mySet using iterator.
        System.out.print(mySet); // Output: [12.7, 54.0]

    }
}