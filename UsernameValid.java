import java.util.Scanner;
public class UsernameValid 
{
    public static void main (String args[]) 
    {
        String s1;
        char ch;
        boolean isValid = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string:");
        s1 = input.nextLine();
        int len = s1.length();
        if (len < 5 || len > 20) 
        {
            isValid = false;
        } 
        else 
        {
            for (int i = 0; i < len; i++) 
            {
                ch = s1.charAt(i);
                if (!Character.isLetterOrDigit(ch)) 
                {
                    isValid = false;
                    break;
                }
            }
        }
        if (isValid) 
        {
            System.out.println("Username is valid");
        } 
        else 
        {
            System.out.println("Username is invalid");
        }
    }
}
