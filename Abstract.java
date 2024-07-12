import java.util.Scanner;
abstract class A
{
    abstract void display();
}
class B extends A
{
    void display()
    {
        System.out.println("class B");
    }
}
public class Abstract
{
    public static void main(String[] args)
    {
        A obj= new B();
        obj.display();
    }
}