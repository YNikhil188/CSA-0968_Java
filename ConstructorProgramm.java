class CSE
{
    int regno;
    String sname;
    public CSE()
    {
        regno=100;
        sname="roy";
    }
    public CSE(int r,String n)
    {
        regno=r;
        sname=n;
    }   
    public CSE(CSE obj3)
    {
        regno=obj3.regno;
        sname=obj3.sname;
    }
    public void display()
    {
        System.out.println(regno);
        System.out.println(sname);
    }
}

public class ConstructorProgramm
{
    public static void main (String args [])
    {
        CSE obj1=new CSE();
        CSE obj2=new CSE(101,"roy");
        CSE obj3=new CSE(obj1);
        obj1.display();
        obj2.display();
        obj3.display();
    }
}