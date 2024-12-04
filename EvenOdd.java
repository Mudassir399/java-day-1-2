import java.util.*;
public class EvenOdd
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int c=1;
        if((num&c)==0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }
    }
}