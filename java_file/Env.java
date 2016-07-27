public Env
{
    public static void main(String[] args)
    {
        //获取系统全部的系统变量
        Map<String,String> env=System.getenv();
       for(String name:env.KeySet())
       {
        System.out.println(name+"--->"env.get(name));
       } 
       //获取制定环境变量的值
       System.out.println(System.getenv("JAVA_HOME"));
       //获取所有系统属性
       Properties props=System.getPropeties();
       props.store(new FileOutputStream("props.txt"),"System Properties");
       System.out.println(System.getProperty("os.name"));
    }
}
