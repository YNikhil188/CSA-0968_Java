public class ExceptionHandling1
{
    public static void main(String[] args)
    {
        try
        {
            String  a="abc";
            int b=Integer.parseInt("a");
        }
        catch (NumberFormatException e)
        {
            System.out.println(e);
        }
        try
        {
            String b=null;
            System.out.println(b.length());
        }
        catch (NullPointerException e)
        {
            System.out.println(e);
        }
        try
        {
            int a[]=new int[3];
            System.out.println(a[5]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        {
            System.out.println("remaining code");
        }
    }
}
