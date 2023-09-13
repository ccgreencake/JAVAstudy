package Sept_sixth;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : LiuDongBin
 * @create 2023/9/6 14:28
 */
public class exam1 {
public static void main(String[] args) {
    //    1、定义一个华氏度，转换成相应的摄氏度输出。（转换规则：摄氏度＝5/9*(华氏度－32)）
    double fahrenheit = 100;
    double celsius = 5.0/9*(fahrenheit-32);
    System.out.print("1.  ");
    System.out.println(celsius);
    //	2、定义一个三位整数，分别输出其个位、十位和百位
    int n = 123;
    System.out.print("2.  ");
    System.out.println("个位："+n%10);
    System.out.println("十位："+n/10%10);
    System.out.println("百位："+n/100);
//	3、定义一个四位整数，分别输出其个位、十位和百位、千位
    System.out.print("3.  ");
    int n1 = 1234;
    System.out.println("个位："+n1%10);
    System.out.println("十位："+n1/10%10);
    System.out.println("百位："+n1/100%10);
    System.out.println("千位："+n1/1000);
//	3、完成打印输出Java所有基本数据类型及所占字节数，格式如效果图。
//		类型       所占字节	   取值范围                  占多少位
//		byte       1字节       -2^7~2^7-1            8位
//		short      2字节	   -2^15~2^15-1       16位
//		int          4字节	   -2^31~2^31-1        32位
//		...
    System.out.println("3.  ");
    System.out.println("类型\t\t所占字节\t\t取值范围\t\t占多少位");
    System.out.println("byte\t\t1字节\t\t-2^7~2^7-1\t\t8位");
    System.out.println("short\t\t2字节\t\t-2^15~2^15-1\t\t16位");
    System.out.println("int\t\t4字节\t\t-2^31~2^31-1\t\t32位");
    System.out.println("long\t\t8字节\t\t-2^63~2^63-1\t\t64位");
    System.out.println("float\t\t4字节\t\t-2^31~2^31-1\t\t32位");
    System.out.println("double\t\t8字节\t\t-2^63~2^63-1\t\t64位");
    System.out.println("char\t\t2字节\t\t0~2^16-1\t\t16位");
    System.out.println("boolean\t\t1字节\t\ttrue/false\t\t8位");


//	4、从键盘输入三角形的底和高，并输出三角形的面积。
    Scanner scanner = new Scanner(System.in);
    System.out.print("4.  ");
    System.out.println("请输入三角形的底：");
    double bottom = scanner.nextDouble();
    System.out.println("请输入三角形的高：");
    double height = scanner.nextDouble();
    System.out.println("三角形的面积为："+bottom*height/2);
//
//	5、从控制台输入学员王浩3门课程(Java、SQL、Php)成绩，编写程序实现
    //	（1）Java课和SQL课的分数之差
//	（2）3门课的平均分
    System.out.println("5.  ");
    System.out.println("请输入Java课成绩：");
    double java = scanner.nextDouble();
    System.out.println("请输入SQL课成绩：");
    double sql = scanner.nextDouble();
    System.out.println("请输入Php课成绩：");
    double php = scanner.nextDouble();
    System.out.println("Java课和SQL课的分数之差："+(java-sql));
    System.out.println("3门课的平均分："+(java+sql+php)/3);

//
//    6、从控制台输入基本工资，题目1、计算输出实领工资  题目2、输出一张完整的工资条
//		其中物价津贴为基本工资的4%
//		房租津贴为基本工资的2.5%
//		社保为基本工资1.25%
//		话费补贴为100
    System.out.println("6.  ");
    System.out.println("请输入基本工资：");
    double baseSalary = scanner.nextDouble();
    System.out.println("实领工资："+(baseSalary+baseSalary*0.04+baseSalary*0.025-baseSalary*0.0125+100));
    System.out.println("工资条：");
    System.out.print("\t基本工资："+baseSalary);
    System.out.print("\t物价津贴："+baseSalary*0.04);
    System.out.print("\t房租津贴："+baseSalary*0.025);
    System.out.print("\t社保："+baseSalary*0.0125);
    System.out.print("\t话费补贴："+100);
//    五、思考题(选做)
//    1、定义两个变量int a = 10 int b = 20 ,交换两个变量的值
    System.out.println("思考题1");
    int a = 10;
    int b = 20;
    int c;
    c = a;
    a = b;
    b = a;
    System.out.println("交换后，a="+a+" b="+b);
//    2、某个公司采用公用电话传递数据，数据是四位的整数，在传递过程中是加密的，
//    加密规则如下：每位数字都加上3然后除以10的余数代替该数字，
//    再将第一位和第四位交换，第二位和第三位交换。
//    输入四位号码，求加密后的号码为多少？
    System.out.println("思考题2");
    System.out.println("请输入四位号码");
    int number = scanner.nextInt();
    int one = number/1000;
    int two = number/100%10;
    int three = number/10%10;
    int four = number%10;
    one = change(one);
    two = change(two);
    three = change(three);
    four = change(four);
    int secret = four*1000+three*100+two*10+one;
    System.out.println("加密后："+secret);
//    3、输入三角形的三条边，判断是否能构成三角形，如果能输出能够成三角形，如果不能输出不能构成三角形
    System.out.println("思考题3");
    System.out.println("请输入三条边");
    double side1 = scanner.nextDouble();
    double side2 = scanner.nextDouble();
    double side3 = scanner.nextDouble();
    if(side1+side2>side3&&side1+side3>side2&&side2+side3>side1){
        System.out.println("能构成三角形");
    }else{
        System.out.println("不能构成三角形");
    }

}
static int change(int n){
    return (n+3)%10;
}


}
