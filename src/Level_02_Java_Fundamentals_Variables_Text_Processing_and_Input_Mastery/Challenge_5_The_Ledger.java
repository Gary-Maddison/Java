/*
Establish a starting balance of 1500. Using only the variable itself and shorthand
operators (do not write the variable name twice in a single calculation), simulate a deposit of 400,
followed by a withdrawal of 250. Finally, increase the balance by exactly one unit using the shortest
possible syntax. Output the final balance.
 */

package Level_02_Java_Fundamentals_Variables_Text_Processing_and_Input_Mastery;

public class Challenge_5_The_Ledger {

    void main() {

        int startingBalance = 1500;
        startingBalance += 400;
        startingBalance -= 250;
        startingBalance++;

        System.out.println("The final balance is: " + startingBalance);
    }
}
