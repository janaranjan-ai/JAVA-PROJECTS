import java.io.IOException;

public class stream {
    public static void main(String[] args) {
        System.out.println("Enter a character:");

        try {
            // Read a single byte from keyboard
            int input = System.in.read();
            
            // Print the character
            System.out.println("You entered: " + (char) input);
        } 
        catch (IOException e) {
            System.out.println("Error reading input!");
        }
    }
}
