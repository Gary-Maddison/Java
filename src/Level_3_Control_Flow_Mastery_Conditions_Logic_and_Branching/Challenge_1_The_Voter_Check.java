/*
Ask for a person's age. If they are old enough to vote (18 or older), display a welcoming
message. Otherwise, display a message stating they are too young.Ask for a person's age.
If they are old enough to vote (18 or older), display a welcoming message. Otherwise, display
a message stating they are too young.
 */

package Level_3_Control_Flow_Mastery_Conditions_Logic_and_Branching;

import java.util.Scanner;

public class Challenge_1_The_Voter_Check {

    void main() {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your age: ");

        int age = userInput.nextInt();

        if (age >= 18) {
            System.out.println("Please cast your vote");
        }
        else {
            System.out.println("Sorry you need to be 18 to vote");
        }
    }
}
