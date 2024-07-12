import java.util.Scanner;
public class Armstrong
{
    public static void main (String args[])
    {
        int n,a,total=0,r;
        Scanner input =new Scanner(System.in);
        n=input.nextInt();
        a=n;
        while (a>0)
        {
                r=a%10;
                total=total+(r*r*r);
                a=a/10;
        }
        if (n==total)
        {
            System.out.println("Armstrong number");
        }
        else
        {
            System.out.println("Not an Armstrong number"); 
        }
    }
}