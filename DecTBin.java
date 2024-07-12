import java.util.Scanner;
public class DecTBin 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a decimal number:");
        int decimal = input.nextInt();
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary representation: " + binary);
        String s2;
        int i;
        s2="";
        int len=binary.length();
        for (i=len-1; i>=0 ;i--)
        {
            s2=s2+binary.charAt(i);
        }
        System.out.println("Reverse word is:"+s2);
    }
}