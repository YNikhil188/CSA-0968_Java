import java.util.Scanner;
public class SepVowACons
{
    public static void main (String args[])
    {
        String s1,s2,s3,vowel;
        int i;
        char ch;
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the string:");
        s1=input.nextLine();
        s2="";
        s3="";
        vowel="aeiouAEIOU";
        int len=s1.length();
        for (i=0; i<len ;i++)
        {
            ch=s1.charAt(i);
            if (vowel.indexOf(ch)==-1)
            {
                s2=s2+ch;
            }
            else
            {
                s3=s3+ch;
            }
        }
        System.out.println(s2);
        System.out.println(s3);
    }
}