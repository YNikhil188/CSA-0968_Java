class Base
{
    public void  display()
    {
        System.out.println("Base class");
    }
}
class Derived1 extends Base
{
    public void display()
    {
        System.out.println("Derived1 class");
    }
}
class Derived2 extends Base
{
    public void display()
    {
        System.out.println("Derived2 class");
    }
}
public class RuntimePolymorphism
{
    public static void main(String[] args)
    {
        Base b = new Base();
        b.display();
        Base d1 = new Derived1();
        d1.display();
        Base d2 = new Derived2();
        d2.display();
    }
}
