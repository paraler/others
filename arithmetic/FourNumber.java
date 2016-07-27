import java.io.*;
import java.util.*;
public class FourNumber
{
    public static void main(String[] args)throws IOException{     
        int m,n;
        int[] num=new int[10];
        Scanner br=new Scanner(System.in);
  //      BufferedReader bc=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入m: ");
        m=br.nextInt();
        System.out.println("请输入n: ");
        n=br.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("第"+i+"个数");
            num[i]=br.nextInt();
        }
        for(int a=0;a<n;a++)
            for(int b=0;b<n;b++)
                for(int c=0;c<n;c++)
                    for(int d=0;d<n;d++)
                        if(num[a]+num[b]+num[c]+num[d]==m)
                        {
                            System.out.println("Yes");
                            System.out.println("the combination is: "+num[a]+num[b]+num[c]+num[d]);
                        }
        System.out.println("No");
    }
}
