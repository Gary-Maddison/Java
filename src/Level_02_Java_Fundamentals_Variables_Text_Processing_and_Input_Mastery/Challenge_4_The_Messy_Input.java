/*
Set up an input mechanism. Ask the user to enter a single word, but assume they
will accidentally type several spaces before and after the word. Capture their input,
strip away all the accidental outer spaces, and display the completely uppercase version
of the cleaned word, followed by a number representing exactly how many characters are
in that cleaned word.
 */

package Level_02_Java_Fundamentals_Variables_Text_Processing_and_Input_Mastery;

import java.util.Scanner;

public class Challenge_4_The_Messy_Input {

    void main() {

        Scanner console = new Scanner(System.in);
        System.out.println("Please enter a word: ");

        String chosenWord = console.nextLine().trim();

        System.out.println(chosenWord.toUpperCase());
        System.out.println("There are " + chosenWord.length() + " characters in this word.");
    }
}
