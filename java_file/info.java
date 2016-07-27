public class info
{   
    private String  name="paral";
    private int height=175;
    private int weight=60;
    private int age=20;
    public void info_out(){
        System.out.println("name: "+name+"\nage: "+age+"\nheight: "+height+"\nweight: "+weight);
    } 
    public static void main(String[] args)
    {
        info person=new info();
        person.info_out();
    }
}
