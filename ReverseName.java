import java.util.Scanner; // Import Scanner class
public class ReverseName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Initialize Scanner object
        System.out.print("Enter your name: ");
        String name = input.nextLine(); // Read input
        StringBuilder reversedName = new StringBuilder(); // Use StringBuilder for efficient string manipulation
        int len = name.length();
        for (int i = len - 1; i >= 0; i--) {
            reversedName.append(name.charAt(i)); // Append characters to StringBuilder
        }
        System.out.println("Reversed name: " + reversedName.toString()); // Print reversed name
    }
}
