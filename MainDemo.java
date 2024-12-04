import java.lang.*;
import java.io.*;
import java.util.*;
class Bitwise
{
    void m1()
    {
        int a=10;
        int b=12;
        System.out.println(a&b);
    }
    void demo()
    {
        System.out.println(10&12);
        System.out.println(12&18);
        System.out.println(18&15);
        System.out.println(16&14);
        System.out.println(12&11);
        System.out.println(10|12);
        System.out.println(12|18);

    }
}
class MainDemo
{
    public static void main(String []args)
    {
        Bitwise b=new Bitwise();
        b.m1();
        b.demo();
    }
}