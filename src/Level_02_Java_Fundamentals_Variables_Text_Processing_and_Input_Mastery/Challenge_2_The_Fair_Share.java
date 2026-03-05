/*
Imagine you have 237 gold coins and a party of 5 adventurers. Calculate how
many whole coins each adventurer receives, and calculate how many coins are left
over for the guild master. Output both results clearly.
 */

package Level_02_Java_Fundamentals_Variables_Text_Processing_and_Input_Mastery;

public class Challenge_2_The_Fair_Share {

    void main() {

        int goldCoins = 237, people = 5;
        int coinsPerPerson = goldCoins / people;
        int coinsLeft = goldCoins % people;

        System.out.println("Each person will receive " + coinsPerPerson + " coins and " + coinsLeft + " coins will be left.");

    }
}
