package pack3;
public class Student 
{
    private String name;
    private int rollNo;
    private int[] marks;
    public Student(String name, int rollNo, int[] marks) 
    {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
    public void display() 
    {
        System.out.println("Student Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: ");
        for (int mark : marks) 
        {
            System.out.println(mark);
        }
    }
    public int getTotalMarks() 
    {
        int total = 0;
        for (int mark : marks) 
        {
            total += mark;
        }
        return total;
    }
    public double getPercentage() 
    {
        int totalMarks = getTotalMarks();
        return (totalMarks / (double)(marks.length * 100)) * 100;
    }
}
