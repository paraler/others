import java.lang.*;
public class water
{
    public static void main(String[] args)
    {
        int num;
        int ten;
        int hun;
        int all;
        for(int i=100;i<1000;i++)
        {
            hun=i/100;
            ten=i/10-i/100*10;
            num=i%10;
            all=(int)Math.pow(hun,3)+(int)Math.pow(ten,3)+(int)Math.pow(num,3);
            if(i==all)
                System.out.println("number is :"+i);
    
        }
    }
}
