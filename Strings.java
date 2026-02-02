public class Strings {

    public static void main(String[] args) {
        String message = "Hello World" + "!!"; // Concatenating 2 strings
        System.out.println(message);

        System.out.println(message.endsWith("!!")); // Asking if string ends with

        System.out.println(message.startsWith("!!")); // Asking if string starts with

        System.out.println(message.length()); // Length of string

        System.out.println(message.indexOf("H")); // Index position of character

        System.out.println(message.replace("!", "*")); // Replace characters

        System.out.println(message.toLowerCase()); // Converts to lowercase

        System.out.println(message.toUpperCase()); // Converts to uppercase

        System.out.println(message.trim()); // Removes white space before and after text

    }
}