import java.util.*;
import java.io.*;
public class sum
{
        int sum=0;
        int data=0;
        public int cal()
        {
        Scanner reader=new Scanner(System.in);
            System.out.println("please input the data(999 end input): ");
            while(reader.hasNextInt())
            {
                try
                {
                     data=reader.nextInt();
                }catch(InputMismatchException e){
                    continue;
                }
                  
                if(data==999)
                   return sum;
                else if(data!=999&&data>=0)
                    sum=sum+data;
            }
        return sum;
        }
    public static void main(String[] args)
    {
        sum var=new sum();
        int data=var.cal();
        System.out.println("The data you input sum is: "+data);
    }
}
