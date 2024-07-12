class Bank
{
    public void  rate_of_intrest()
    {
        System.out.println("Bank Rate of intrest is 0.00");
    }
}
class SBI extends Bank
{
    public void rate_of_intrest()
    {
        System.out.println("SBI Rate of intrest is: 8:4 ");
    }
}
class ICICI extends Bank
{
    public void rate_of_intrest()
    {
        System.out.println("ICICI Rate of intrest is: 7:3");
    }
}
class AXIS extends Bank
{
    public void rate_of_intrest()
    {
        System.out.println("AXIS Rate of intrest is: 9:7");
    }
}
public class BankROI
{
    public static void main(String[] args)
    {
        Bank b = new Bank();
        b.rate_of_intrest();
        Bank d1 = new SBI();
        d1.rate_of_intrest();
        Bank d2 = new ICICI();
        d2.rate_of_intrest();
        Bank d3 = new AXIS();
        d3.rate_of_intrest();
    }
}
