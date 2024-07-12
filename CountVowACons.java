import java.util.Scanner;
public class CountVowACons
{
    public static void main (String args[])
    {
        String s1,vowel;
        int i,c1=0,c2=0;
        char ch;
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the string:");
        s1=input.nextLine();
        vowel="aeiouAEIOU";
        int len=s1.length();
        for (i=0; i<len ;i++)
        {
            ch=s1.charAt(i);
            if (vowel.indexOf(ch)==-1)
            {
                c1++;
            }
            else
            {
                c2++;
            }
        }
        System.out.println("count the no of consonants is:"+c1);
        System.out.println("count the no of vowels is:"+c2);
    }
}