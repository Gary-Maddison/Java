/*
Ask the user to type in the year they were born. Read this input from the console. Using the current year,
calculate their approximate age. Output a sentence that seamlessly mixes text with their calculated age.
 */

package Level_02_Java_Fundamentals_Variables_Text_Processing_and_Input_Mastery;

import java.util.Scanner;

public class Challenge_6_The_Contextual_Maths {

    void main() {

        int currentYear = 2026;
        Scanner userInput = new Scanner(System.in);
        System.out.println("What year were your born: ");
        int yearBorn = userInput.nextInt();
        int age = currentYear - yearBorn;

        System.out.println("You are " + age + " years old");

    }
}
