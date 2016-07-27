import java.util.Scanner;
 
public class Statics{
 
 
/*
 单词表结构
 */
static String[] word = new String[10];// 放单词，最多1000个
static int[] count = new int[10];    // 同一个单词出现总个数,与单词数对应
static String[] line =new String[10];//单词所在行数,与单词个数对应
static int all=0;//单词表总个数
static int l=0;//行号
 
public static void main(String[] args) {
 
Scanner input = new Scanner(System.in);  //输入函数
for(int i=0;i<10;i++){
   //初始化为空串
word[i]=line[i]="";  
 
}
 
while(input.hasNextLine()&&l<10){
  //当有下行输入时
//String txt = "I am Tom,I am a chinese.";// 测试
String txt=input.nextLine(); //输入一行文本
l++;            //行号加1
doline(txt,l);  //一行文本处理
 
}
 
resultTo();  //打印结果
 
}
 
 
/**
 * 结果输出函数
 */
private static void resultTo() {
 
// TODO Auto-generated method stub
for(int i=0;i<all;i++){
       //遍历整个单词表，最大个数是all
if(i==0){
 
System.out.println("word        count     line");  // 属性列名，word:单词；  count:出现次数；   line:出现行数
 
}
System.out.printf("%-13s%-10d%-10s\n",word[i],count[i],line[i]);  //格式输出
 
}
 
}
 
/**
 * 一行文本处理函数
 * @param txt
 */
private static void doline(String txt,int l) {
//txt是一行文本，l是当前行号
// TODO Auto-generated method stub
for(int i=0;i<txt.length();i++){
  //整个循环把一行中的非字母都变为空格
if(!Character.isLetter(txt.charAt(i))){
  //如果是非字母
txt=txt.replace(txt.charAt(i),' ');  //把当前非字母变为空格
 
}
 
}
 
String[] split = txt.split(" ");  //按一个空格，把当前一行文本分隔为一个个单词，把一个个单词放入split字符串数组中
for(int i=0;i<split.length;i++){
  //遍历split数组
//System.out.println(split[i]);
update(split[i],l);   //把split[i]中存入的单词，l代表的行号 用update函数更新单词表
 
}
    
 
}
 
/**
 * 单词更新函数 
 * 
 * @param w
 */
private static void update(String w,int l) {
 
// TODO Auto-generated method stub
int flag=0;//做标记，如果flag=0,表示w是新单词
for(int i=0;i<all;i++){
    //遍历当前单词表
if(word[i].equals(w)) {
   //如果在当前单词表中找到，说明这个w单词已存在
flag=1;//表示w已存在
count[i]++;//个数加1
String ls=""+l;  // 把行号l的格式由 int 转换为 String
if(!line[i].contains(ls)){
   // 若对应当前行号已存在
if(count[i]>1){
   //  如果对应count计数大于1
line[i]+=",";  // 在对应行号串后加个逗号
 
}
line[i]+=l;   // 在对应行号串中连接新的行号
 
}
break;
 
}
 
}
if(flag==0){
//为新单词
word[all]=w;  //all是上限，不取到，所以在word[all]中添加新单词
count[all]=1; // 对应计数变为1
line[all]+=l;  //写入行号
all++;       //上限all加1
 
}
 
 
}
 
 
 
 
}
