import java.util.Scanner;
public class SimInt 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a principal:");
        int p = input.nextInt();
        System.out.println("Enter a time in years:");
        int t = input.nextInt();
        System.out.println("Enter the age of customer:");
        int a = input.nextInt();
        double r;
        if (a >= 60) 
        {
            r = 12.0;
        } 
        else 
        {
            r = 10.0;
        }
        double s = p * t * r / 100;
        System.out.println("Simple interest: " + s);
    }
}
