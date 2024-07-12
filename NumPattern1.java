import java.util.Scanner;
public class NumPattern1
{
    public static void main(String args[]) 
    {
        int n,i,j;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for (i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}