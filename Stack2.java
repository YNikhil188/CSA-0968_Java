import java.util.Scanner;
public class Stack2
{
    public static void main(String[] args)
    {
        Stack2<Integer> sta1=new Stack2<Integer>();
        sta1.push(11);
        sta1.push(22);
        sta1.push(33);
        sta1.push(44);
        System.out.println(sta1.pop());
        System.out.println(sta1.peek());
        System.out.println(sta1.search(22));
        System.out.println(sta1);
    }
}