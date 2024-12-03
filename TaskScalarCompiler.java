import java.util.*;
public class TaskScalarCompiler
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        int b=sc.nextInt();
        String c=String.format("name=%s\nage=%d",a,b);
        System.out.println(c);
    }
    
}