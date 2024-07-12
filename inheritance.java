class A
{
 public void displayA()
{
 System.out.println("A");
}}
class B extends A
{
 public void displayB()
{
 System.out.println("B");
}}
class C extends A
{
public void displayC()
{
System.out.println("C");
}}
class D extends B
{ 
 public void displayD()
{
 System.out.println("D");
}}
public class Inheritance
{
 public static void main(String args[])
{
  B obj =new B();
  obj.displayB();
  obj.displayA();
  C obj1=new C();
  obj1.displayC();
  obj1.displayA();
  D obj2=new D();
  obj2.displayA();
  obj2.displayB();
  obj2.displayD();
}
}