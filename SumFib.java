import java.util.Scanner;
public class SumFib 
{
    public static void main(String args[]) 
    {
        int f1 = 0, f2 = 1, fib, n, i, sum = 0;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        sum = f1 + f2;
        System.out.println(f1);
        System.out.println(f2);
        for (i = 2; i < n; i++) 
        {
            fib = f1 + f2;
            System.out.println(fib);
            sum += fib;
            f1 = f2;
            f2 = fib;
        }
        System.out.println("sum of fibonacci is:"+sum);
    }
}