public class Catchtest
{
    public void catchThrowException(String str) throws NullPointerException,ArrayIndexOutOfBoundsException,ArithmeticException
    {
        System.out.println(str+"");
        if(str.equalsIgnoreCase("除零异常")){
            int a=0;
            int b=6/a;
        }else if(str.equalsIgnoreCase("空指针异常")){
            String s[]=new String[5];
            s[0].toCharArray();
        }else if(str.equalsIgnoreCase("数组越界异常")){
            int[] a=new int[5];
                a[10]=10;
        }else{
            System.out.println("没有发现异常");
        }
    }
    public static void main(String[] args)
    {
        Catchtest te=new Catchtest();
        try{
            te.catchThrowException("无异常");
        }catch(Exception e){
            System.out.println("："+e.getMessage());  
        }
        try{
            te.catchThrowException("除零异常");
        }catch(Exception e){
            System.out.println(":"+e.toString());
        }
        try{
            te.catchThrowException("空指针异常"); 
        }catch(Exception e){
            System.out.println(":"+e);
        }
        try{
            te.catchThrowException("数组越界异常");
        }catch(Exception e){
            System.out.println("异常"+e);
        }
    }
}
