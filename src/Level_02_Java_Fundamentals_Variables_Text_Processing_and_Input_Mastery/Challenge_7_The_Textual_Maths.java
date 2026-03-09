/*
Create two text-based variables, both holding negative numerical values wrapped in quotes. Transform these
text values into actual mathematical values. Add them together to find the total, transform that final total
back into a text format, and merge it with a congratulatory message to display on the screen.
 */

package Level_02_Java_Fundamentals_Variables_Text_Processing_and_Input_Mastery;

public class Challenge_7_The_Textual_Maths {

    void main() {

       String negativeOne = "-1977";
       String negativeTwo = "-1966";

       int numberOne = Integer.parseInt(negativeOne);
       int numberTwo = Integer.parseInt(negativeTwo);

       int total = numberOne + numberTwo;

       String totalInString = String.valueOf(total);

       System.out.println("Here I have converted two sum of integers into a string " + totalInString);

    }
}
