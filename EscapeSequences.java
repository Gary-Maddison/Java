public class EscapeSequences {

    public static void main(String[] args) {
        String message = "Hello \"Gary\""; // This ignores the next character in the string
        System.out.println(message);

        // c:\Windows\..
        String newMessage = "c:\\Windows\\"; // This allows us to insert \ into a string
        System.out.println(newMessage);

        String newLine = "Hello\nWorld!"; // This prints a new line
        System.out.println(newLine);

        String tabLine = "Hello\tWorld!"; // This gives us a tab
        System.out.println(tabLine);

    }

}