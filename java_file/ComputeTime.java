import java.lang.*;
import CalTime.all.Common;
public class ComputeTime
{
    public static void main(String[] args)
    {
        System.out.println("class is:"+args[0]);
        System.out.println("A is:"+args[1]);
        System.out.println("B is:"+args[2]);
        System.out.println("C is:"+args[3]);
        double A=Double.parseDouble(args[1]);
        double B=Double.parseDouble(args[2]);
        double C=Double.parseDouble(args[3]);
        double v,t;
        try
        {
            Common d=(Common)Class.forName("CalTime."+args[0]).newInstance();
            v=d.runTimer(A,B,C);
            t=1000/v;
            System.out.println("average speed is: "+v+"km/h");
            System.out.println("run time is: "+t+"hours");
        }catch(Exception e)
        {
            System.out.println("class not found");
        }
    }
}
