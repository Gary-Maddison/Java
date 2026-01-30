import java.util.Date;

public class ReferenceTypes {

    public static void main(String[] args) {
        Date now = new Date(); // 'Date' is a Reference Type, unlike 'byte' or 'int' - // We use the 'new'
                               // keyword to allocate memory on the "Heap" for this object
        System.out.println(now); // Prints the current date and time held in the 'now' variable to the console

    }
}