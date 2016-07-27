package ticket;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
public class Ticket
{
    public static List<String> list=new ArrayList<String>();
    public static int counter=1;
    public static Random random=new Random();
    public static void main(String[] args)
    {
        initTicket();
        Ticket st=new Ticket();
        for(int i=1;i<=5;i++)
        {
            st.new Solder().start();
        }
    }
    private synchronized String getOneTicket()
    {
        if(list.size()<=0) return null;
        return list.remove(0);
    }
    private static void initTicket()
    {
        for(int i=1;i<=100;i++)
        {
            list.add("第"+i+"张票");
        }
    }
    class Solder extends Thread
    {
        public final int id=counter++;
        public Solder()
        {
            this.setName("售票窗口"+id);
        }
        @Override
        public void run()
        {
            while(!this.isInterrupted())
            {
                String ticket=getOneTicket();
                if(ticket==null)
                {
                    System.out.println(this.getName()+"票已售空");
                    break;
                }
                System.out.println(this.getName()+"卖出了"+ticket);
                try{
                    TimeUnit.MILLISECONDS.sleep(random.nextInt(5000));
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
