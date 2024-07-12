import java.util.Scanner;
public class NumPattern2
{
    public static void main(String args[]) 
    {
        int n,i,j,N=1;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for (i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(N+" ");
                N++;
            }
            System.out.println();
        }
    }
}