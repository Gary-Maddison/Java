/*
Create a numeric container and assign it an initial value. Using mathematical operations,
update that container (or use a sequence of new containers) to multiply the starting number
by 5, then divide it by 2, and finally subtract 3. Display only the final result.
 */

package Level_01_Basic_Output_and_Structure;

public class Challenge_8_The_Chain_Reaction {

    void main() {

        int number = 10;

        number = (number * 5) / 2 - 3;

        System.out.println(number);

    }
}
