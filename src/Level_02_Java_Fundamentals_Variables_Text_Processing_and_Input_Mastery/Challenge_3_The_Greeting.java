/*
Prompt the user to type in their favourite colour, followed by their hometown. Capture both
inputs and combine them into a single, highly readable sentence that is output back to the screen.
 */

package Level_02_Java_Fundamentals_Variables_Text_Processing_and_Input_Mastery;

import java.util.Scanner;

public class Challenge_3_The_Greeting {

    void main() {

        Scanner console = new Scanner(System.in);
        System.out.println("Please enter your favourite colour: ");
        String favColour = console.nextLine();

        System.out.println("Where do you live? ");
        String hometown = console.nextLine();

        System.out.println("Your favourite colour is " + favColour + " and you live in " + hometown + ".");

    }
}
