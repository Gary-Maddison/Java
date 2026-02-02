import java.util.Arrays;

public class MultiDemensionalArrays {

    public static void main(String[] args) {
        int[][] numbers = new int[2][3]; // Here we have 2 rows and 3 columns
        numbers[0][0] = 1; // We are placing the number 1 in column 1

        System.out.println(Arrays.deepToString(numbers));

        int[][] numberNew = { { 1, 2, 3 }, { 4, 5, 6 } }; // This is creating 2 arrays with these numbers
        System.out.println(Arrays.deepToString(numberNew));

    }
}
