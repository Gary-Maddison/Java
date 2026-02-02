import java.util.Arrays;

public class FixedArray {
    public static void main(String[] args) {
        int[] numbers = { 2, 3, 5, 5, 2 }; // Here is an array containing 5 items

        System.out.println(numbers.length); // How many items are in this array

        int[] numbersSort = { 2, 5, 6, 8, 3 };
        Arrays.sort(numbersSort); // This allows us to sort the array into order
        System.out.println(Arrays.toString(numbersSort));

    }

}
