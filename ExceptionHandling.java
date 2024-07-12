public class ExceptionHandling
{
    public static void main(String[] args)
    {
        try
        {
            int a=100/0;
        }
        catch (ArithmeticException e)
        {
            System.out.println("error");
        }
        {
            System.out.println("remaining code");
        }
    }
}
