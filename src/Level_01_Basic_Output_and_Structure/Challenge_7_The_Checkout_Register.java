/*
Store the price of a single item, the quantity of items purchased, and a flat
discount amount in separate containers. Calculate the final cost
(price multiplied by quantity, minus the discount) and store it in a new container.
Display a formatted receipt message showing the final calculated cost.
 */

package Level_01_Basic_Output_and_Structure;

public class Challenge_7_The_Checkout_Register {

    void main() {
        double itemPrice = 10.99;
        int itemsPurchased = 2;
        int discountAmount = 10;
        double totalPrice = ((itemPrice * itemsPurchased) - discountAmount);

        System.out.println("Total Cost: " + totalPrice);
    }
}
