import java.util.Arrays;
import java.util.Scanner;
public class MeMoMeA 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = input.nextInt();
        int a[] = new int[n];
        int c = 0, i, j;
        System.out.println("Enter the elements of the array:");
        for (i = 0; i < n; i++) 
        {
            a[i] = input.nextInt();
        }
        int sum = 0;
        for (i = 0; i < n; i++) 
        {
            sum += a[i];
        }
        double mean = (double) sum / n;
        System.out.println("Mean of array is " + mean);
        int mode = a[0];
        int mc = 0;
        for (i = 0; i < n; i++) 
        {
            c = 0;
            for (j = 0; j < n; j++) 
            {
                if (a[j] == a[i]) 
                {
                    c++;
                }
            }
            if (c > mc) 
            {
                mc = c;
                mode = a[i];
            }
        }
        System.out.println("Mode of array is " + mode);
        Arrays.sort(a);
        double median;
        if (n % 2 == 0) 
        {
            median = (a[n / 2 - 1] + a[n / 2]) / 2.0;
        } 
        else 
        {
            median = a[n / 2];
        }
        System.out.println("Median of array is " + median);
    }
}
