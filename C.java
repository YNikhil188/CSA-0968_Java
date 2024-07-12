class Cse
{
        int regno;
        String studentname;
    public Cse()
    {
        regno = 100;
        studentname = "roy";
    }
    public Cse(int rno, String sname)
    {
        regno = rno;
        studentname = sname;
    }
    public Cse(Cse obj3)
    {
        regno = obj3.regno;
        studentname = obj3.studentname;
    }
    public void display()
    {
        System.out.println("regno = "+regno);
        System.out.println("studentname = "+studentname);
    }
}
class C
{
    public static void main(String args[])
    {
        Cse obj1 = new Cse();
        obj1.display();
        Cse obj2 = new Cse(500, "nikhil");
        obj2.display();
        Cse obj3 = new Cse(obj1);
        obj3.display();
    }
}