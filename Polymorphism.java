class Add
{
    int i;
    public void setdata()
    {
        i=10;
    }
    public void addition()
    {
        System.out.println("Addition of two numbers is "+(i+10));
    }
    public void addition(int x)
    {
        System.out.println("Addition of two numbers is "+(i+x));
    }
    public void addition(int x,int y)
    {
        System.out.println("Addition of two numbers is "+(i+x+y));
    }
}
public class Polymorphism
{
    public static void main(String[] args)
    {
        Add a=new Add();
        a.setdata();
        a.addition();
        a.addition(20);
        a.addition(20,30);
        }
}
