// byte - 1 Bytes - Range [-128,127]
// short - 2 Bytes - Range [-32k, 32k]
// int - 4 Bytes - Range [-2B, 2B]
// long - 8 Bytes 
// float - 4 Bytes
// double - 8 Bytes
// char - 2 Bytes - A,B,C, ...
// boolean - 1 Bytes - true/false

public class PrimitiveTypes {

    public static void main(String[] args) {
        byte age = 30;
        long viewsCount = 2_123_456_789_5555L; // You can use _ just like using , to split up long numbers. The L shows
                                               // its a long.
        float price = 10.99F; // We us the F to say this is a float and not a double
        char letter = 'A';
        boolean isEligible = false;

        System.out.println("This is a byte: " + age);
        System.out.println("This is a long: " + viewsCount);
        System.out.println("This is a float: " + price);
        System.out.println("This is a char: " + letter);
        System.out.println("This is a boolean: " + isEligible);

    }
}