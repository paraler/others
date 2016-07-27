class Father
{
    public void func1(int i)
    {
        System.out.println("XXX");
        func2();
    }
    public void func2(){
        System.out.println("AAA");
    } 
}
class Child extends Father
{
    public void func1(int i)
    {
        System.out.println("BBB");    
    }
    public void func2()
    {
        System.out.println("CCC");
    }
}
public class Polymorphism
{
    public static void main(String[] arga)
    {
        Father child=new Child();
        child.func1(1);
    }
}
