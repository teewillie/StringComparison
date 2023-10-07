/**
 * @class: StringComparison
 * @author: Fuaineaitee Willie
 * @version: 1.0
 * @written on: October 6, 2023
 * @course:  ITEC 2140 - 13 , Fall 2023
 *
 * Description:
 */

import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String string1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String string2 = scanner.nextLine();

        // Check if string1 is longer than string2
        if (string1.length() > string2.length()) {
            System.out.println("String \"" + string1 + "\" is longer than String \"" + string2 + "\"");
        } else if (string2.length() > string1.length()) {
            System.out.println("String \"" + string2 + "\" is longer than String \"" + string1 + "\"");
        } else {
            System.out.println("Both strings are of equal length.");
        }

        // Check the lexicographic order
        int comparison = string1.compareTo(string2);
        if (comparison < 0) {
            System.out.println("String \"" + string1 + "\" appears before String \"" + string2 + "\" in lexicographic order");
        } else if (comparison > 0) {
            System.out.println("String \"" + string2 + "\" appears before String \"" + string1 + "\" in lexicographic order");
        } else {
            System.out.println("Both strings are the same in lexicographic order.");
        }

        // Combine the strings
        String combinedString = string1 + " " + string2;
        System.out.println("New sentence created is \"" + combinedString + "\"");

        scanner.close();
    }
}
