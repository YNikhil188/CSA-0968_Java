class UserDefinedException extends Exception
{
    public UserDefinedException(String str)
    {
        super (str);
    }
}
public class MyException
{
    public static void main(String args[])
    {
        int age=70;
        try
        {
            if (age>60)
            throw new UserDefinedException("age should not be >60");
        }
        catch(UserDefinedException e)
        {
            System.out.println(e.getMessage());
        }
    }
}

