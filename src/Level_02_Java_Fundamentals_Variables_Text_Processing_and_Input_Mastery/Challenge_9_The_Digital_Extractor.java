/*
Ask the user for a strictly three-digit whole number (e.g., 456). Without converting the number into text,
mathematically extract the hundreds digit, the tens digit, and the ones digit. Output the sum of these three
isolated digits.
 */

package Level_02_Java_Fundamentals_Variables_Text_Processing_and_Input_Mastery;

import java.util.Scanner;

public class Challenge_9_The_Digital_Extractor {

    void main() {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a three digit number: ");

        int digitalNumber = userInput.nextInt();
        int hundreds = digitalNumber / 100;
        int tens = (digitalNumber / 10) % 10;
        int single = digitalNumber % 10;

        System.out.println(hundreds + tens + single);

    }
}
