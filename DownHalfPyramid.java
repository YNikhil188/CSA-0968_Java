import java.util.Scanner;
public class DownHalfPyramid
{
    public static void main(String args[]) 
    {
        int n,i,j,k;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for (i=n;i>=1;i--)
        {
            for(j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for (k=1;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println(); 
        }  
    }
}