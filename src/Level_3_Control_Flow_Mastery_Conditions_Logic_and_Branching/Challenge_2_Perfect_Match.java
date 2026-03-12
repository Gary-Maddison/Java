/*
Store a secret passcode. Take a user's password attempt. If the attempt perfectly matches
the secret passcode, display a "Login successful" message. If it does not match, the program
must do absolutely nothing (no failure message).
 */

package Level_3_Control_Flow_Mastery_Conditions_Logic_and_Branching;

import java.util.Scanner;

public class Challenge_2_Perfect_Match {

    void main() {

        String secretPassword = "TinCanGallery";

        Scanner console = new Scanner(System.in);
        System.out.println("Please enter password: ");

        String userPassword = console.nextLine();

        if (userPassword.equals(secretPassword)) {
            System.out.println("Login Successful");
        }
    }
}
