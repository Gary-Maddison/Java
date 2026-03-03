/*
So far, your programs only "speak." Make your program "listen." Write a program that pauses, waits for you to type
your name into the console, and then greets you using the name you just typed. _(Target: Find the tool used to read
user input).
 */

package Level_01_Basic_Output_and_Structure;

import java.util.Scanner;

public class Bonus_1_The_Interrogator {

    void main() {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please type your name: ");

        String userName = userInput.nextLine();
        System.out.println("Hello " + userName);

    }
}
