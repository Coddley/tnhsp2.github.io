
//if的多分支练习题
import java.util.Scanner;
public class if03{
       public static void main(String[] args) {
	    //做一个关于保国同志的芝麻信用分的判断
        //如果：
        //1、信誉分为100，输出 信用极好；
        //2、为(80-99), 输出 信用优秀；
        //3、为(60-80)，输出 信用一般；
        //4、其他情况则输出 信用不及格
        //使用键盘输入，并加以判断

        Scanner myScanner = new Scanner(System.in);
         System.out.println("请输入信用分");
           int grade = myScanner.nextInt();
           if (grade == 100) {
           	System.out.println("信用极好");
           } 
           else if (grade > 80 && grade <= 99) {
           	System.out.println("信用优秀");
           } 
           else if (grade >= 60 && grade <= 80) {
           	System.out.println("信用一般");
           } 
           else {
           	System.out.println("信用不合格");
           }
       }
   }