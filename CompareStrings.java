import java.util.Scanner;
public class CompareStrings
{
    public static void main (String args[])
    {
        String s1,s2;
        Scanner input =new Scanner(System.in);
        s1=input.nextLine();
        s2=input.nextLine();
        int b=s1.compareTo(s2);
        if (b==0)
        {
        System.out.println("strings are same");
        }
        else if (b>0)
        {
        System.out.println("string1 is greater");
        }
        else
        {
        System.out.println("string2 is greater");
        }
    }
}