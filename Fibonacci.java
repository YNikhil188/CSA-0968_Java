import java.util.Scanner;
public class Fibonacci
{
    public static void main (String args[])
    {
        int f1=0,f2=1,fib,n,i;
        Scanner input =new Scanner(System.in);
        n=input.nextInt();
        System.out.println(f1);
        System.out.println(f2);
        for (i=3;i<=n;i++)
        {
            fib=f1+f2;
            System.out.println(fib);
            f1=f2;
            f2=fib;
        }
    }
}