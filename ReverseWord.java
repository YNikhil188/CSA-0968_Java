import java.util.Scanner;
public class ReverseWord
{
    public static void main (String args[])
    {
        String s1,s2;
        int i;
        Scanner input =new Scanner(System.in);
        s1=input.nextLine();
        s2="";
        int len=s1.length();
        for (i=len-1; i>=0 ;i--)
            s2=s2+s1.charAt(i);
        System.out.println("Reverse word is:"+s2);
    }
}