import java.io.File;
import java.util.*;
import java.lang.*;
public class FileReader
{
    public static void main(String[] args)
    {
//        throws Exception
        {
            //将一个File对象作为Scanner的构造函数的输入
            Scanner sc=new Scanner(new File("info.java"));
            System.out.println("info.java的文件内容如下: ");
            while(sc.hasNextLine())
            {
                //输出文件的下一行
                System.out.println(sc.nextLine());
            }   
        }
    }
}
