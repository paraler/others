public class initial
{
    private static int a=1;
    private int b=2;
    private static int c;
    private int d;
    public void first_manner(int c,int d)
    {
        this.c=c;
        this.d=d;
        System.out.println("a is: "+a);
        System.out.println("b is: "+b);
        System.out.println("c is: "+c);
        System.out.println("d is: "+d);
    }
    public void second_manner(int a,int b,int c,int d)
    {   
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        System.out.println("a is: "+a);
        System.out.println("b is: "+b);
        System.out.println("c is: "+c);
        System.out.println("d is: "+d);
    }
    public void three_manner()
    {
        
        System.out.println("a is: "+a);
        System.out.println("b is: "+b);
        System.out.println("c is: "+c);
        System.out.println("d is: "+d);
    }
    public static void main(String[]  args)
    {
        initial var=new initial();
        var.first_manner(3,4);
        var.second_manner(5,6,7,8);
        var.three_manner();
    }
}
