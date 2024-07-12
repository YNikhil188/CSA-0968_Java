import java.util.Scanner;
public class Greatest
{
    public static void main (String args[])
    {
        int a,b,c;
        Scanner input =new Scanner(System.in);
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        if ((a>b) && (a>c))
        {
            System.out.println(" a is greatest value:"+a);
        }
        else if (b>c)
        {
            System.out.println(" b is greatest value:"+b);
        }
        else
        {
            System.out.println(" c is greatest value:"+c);
        }
    }
}