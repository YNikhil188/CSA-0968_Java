import pack3.Student;

public class MainClass 
{
    public static void main(String[] args) 
    {
        int[] marks = {85, 90, 78, 92, 88};
        Student student = new Student("John Doe", 123, marks);
        student.display();
        int totalMarks = student.getTotalMarks();
        double percentage = student.getPercentage();
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
    }
}
