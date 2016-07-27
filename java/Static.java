public class Static 
{
    private int serialNumber;
    public static int counter=0;
    public Static()
    {
        counter++;
        serialNumber=counter;
    }
    public static int getTotalNumber()
    {
        return counter;
    }
    public int getSerialNumber()
    {
        return serialNumber;
    }
    public static void main(String[] args)
    {
        Static sn1=new Static();
        System.out.println(Static.counter);
        System.out.println(Static.getTotalNumber());
        Static sn2=new Static();
        System.out.println(sn2.getTotalNumber());
    }
}
