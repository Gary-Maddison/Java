/*
Create an identifier pointing to a specific text message. Create a second identifier and point it to the exact
same text message using the first identifier. Modify the second identifier by attaching a new word to the end of it.
Output both identifiers to the screen to prove whether altering the second one affected the original first one.
 */

package Level_02_Java_Fundamentals_Variables_Text_Processing_and_Input_Mastery;

public class Challenge_10_The_Clone_Check {

    void main() {

        String firstWord = "Hello", secondWord = firstWord;

        secondWord = secondWord + " World";

        System.out.println(firstWord);
        System.out.println(secondWord);

    }
}
