/*
Create three individual containers representing the points earned in three separate
rounds of a game. Create a fourth container that calculates and stores the sum of the
first three. Display the final aggregated score.
 */

package Level_01_Basic_Output_and_Structure;

public class Challenge_6_The_Score_Aggregator {

    void main() {

        int roundOne = 25;
        int roundTwo = 35;
        int roundThree = 45;
        int totalScore = roundOne + roundTwo + roundThree;

        System.out.println("Total Score = " + totalScore);
    }
}
