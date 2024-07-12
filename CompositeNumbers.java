import java.util.Scanner;
public class CompositeNumbers 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = input.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) 
        {
            a[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) 
        {
            int c = 0;
            for (int j = 1; j <= a[i]; j++) 
            {
                if (a[i] % j == 0) {
                    c++;
                }
            }
            if (c > 2) 
            {
                System.out.println(a[i] + " is a composite number.");
            }
        }
    }
}