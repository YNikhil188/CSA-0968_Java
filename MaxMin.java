import java.util.Scanner;
public class MaxMin 
{
    public static void main(String args[]) 
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        int max, min, i;
        for (i = 0; i < n; i++) 
        {
            arr[i] = input.nextInt();
        }
        max = arr[0];
        min = arr[0];
        for (i = 0; i < n; i++) 
        {
            if (arr[i] > max) 
            {
                max = arr[i];
            }
            if (arr[i] < min) 
            {
                min = arr[i];
            }
        }
        System.out.println("max=" + max);
        System.out.println("min=" + min);
    }
}