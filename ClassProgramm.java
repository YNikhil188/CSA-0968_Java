class cse
{
    int regno;
    String sname;
    public void setdata()
    {
        regno=100;
        sname="roy";
    }
    public void display()
    {
        System.out.println(regno);
        System.out.println(sname);
    }

}
public class ClassProgramm
{
    public static void main (String args [])
    {
        cse obj1=new cse();
        obj1.setdata();
        obj1.display();
    }
}