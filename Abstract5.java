interface Shape
{
    abstract double calculatearea();
    abstract double calculateperimeter();
    abstract public void display();
}
class Circle implements Shape
{
    double radius;
    public Circle(double radius)
    {
        this.radius=radius;
    }
    public double calculatearea()
    {
        return 3.14*radius*radius;
    }
    public double calculateperimeter()
    {
        return 2*3.14*radius;
    }
    public void display()
    {
        System.out.println("Area of the shape is "+calculatearea());
        System.out.println("Perimeter of the shape is "+calculateperimeter());
    }
}
class Rectangle implements Shape
{
    double length,breadth;
    public Rectangle(double length,double breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    public double calculatearea()
    {
        return length*breadth;
    }
    public double calculateperimeter()
    {
        return 2*(length+breadth);
    }
    public void display()
    {
        System.out.println("Area of the shape is "+calculatearea());
        System.out.println("Perimeter of the shape is "+calculateperimeter());
    }
}
public class Abstract5
{
    public static void main(String args[])
    {
        Shape s1=new Circle(7);
        s1.display();
        Shape s2=new Rectangle(9,7);
        s2.display();
    }
}
