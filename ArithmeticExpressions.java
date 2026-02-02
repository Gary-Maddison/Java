public class ArithmeticExpressions {

    public static void main(String[] args) {
        int result = 10 + 3;
        System.out.println(result);

        double doubleNumber = (double) 10 / (double) 3; // This is crearting a double
        System.out.println(doubleNumber);

        int x = 1;
        x++; // Here we are adding one to the int
        System.out.println(x);

        int y = ++x; // This adds the number before applying the variable
        System.out.println(y);

        x += 3; // This allows us to say how much we want to increase the number by
        System.out.println(x);

        x -= 1; // This decreses the int by the given number
        System.out.println(x);

        x *= 2; // This multiplies the int by the given number
        System.out.println(x);

        x /= 2; // This divides the int by the given number
        System.out.println(x);

    }
}