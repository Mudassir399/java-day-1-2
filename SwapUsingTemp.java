class SwapUsingTemp
{
    public static void main(String[] args)
    {
        int girl=20;
        int boy=50;
        int temp=girl;
            girl=boy;
            boy=temp;
        System.out.println(girl);
        System.out.println(boy);
    }
}
