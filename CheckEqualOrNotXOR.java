import java.util.*;
public class CheckEqualOrNotXOR
{
    public static void main(String[] args)
    {
        Scanner  sc=new  Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if((a^b)==0)
        {
            System.out.println("two numbers are equal");
        }
        else
        {
            System.out.println("two numbers are not equal");
        }
    }
}