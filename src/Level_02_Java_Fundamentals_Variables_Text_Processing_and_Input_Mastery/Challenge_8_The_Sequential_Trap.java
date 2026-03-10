/*
Write a program that asks the user for a highly precise decimal number (like their exact bank balance down to the cent).
Read it. Immediately after, ask them for their full name and read it. Output the name and the balance.

(Note: Watch carefully how the program behaves when you test this—you must ensure both pieces of information
are successfully captured!)
 */

package Level_02_Java_Fundamentals_Variables_Text_Processing_and_Input_Mastery;

import java.util.Scanner;

public class Challenge_8_The_Sequential_Trap {

    void main() {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter your bank balance: ");
        double bankBalance = userInput.nextDouble();

        userInput.nextLine();

        System.out.println("Please enter your full name: ");
        String fullName = userInput.nextLine().trim().toUpperCase();

        System.out.println(fullName + " your balance is £" + bankBalance);

    }
}
