class Person
{
    private String name;
    public Person(String nama)
    {
        this.name=name;
    }
}
public class to_string
{
    public static void main(String[] args)
    {
        Person p=new Person("孙悟空");
        System.out.println(p);
    }
}
//此处输出是hashCode 如果想要输出的不是hashCode 必须自己重写toString方
