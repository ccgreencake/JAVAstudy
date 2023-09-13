package String_test;

import org.junit.jupiter.api.Test;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : LiuDongBin
 * @create 2023/9/7 15:12
 */

public class Test1 {


    @Test
    public void test1(){
//        1、已知字符串："this is a test of java".
//按要求执行以下操作：
//(1) 统计该字符串中字母s出现的次数
//(2) 取出子字符串"test"
//(3) 用多种方式将本字符串赋值到一个字符数组char[] str中.
//(4) 用两种方式实现该字符串的倒序输出。(用StringBuffer和for循环方式分别实现)
//(5) 将本字符串转换成一个字符串数组，要求每个数组元素都是一个有意义的英文单词,并输出到控制台
//
        String str1 = "this is a test of java";
        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i)=='s'){
                count++;
            }
        }
        System.out.println("统计该字符串中字母s出现的次数:"+count);
        System.out.println("取出子字符串\"test\"");
        System.out.println(str1.substring(str1.indexOf("test"),str1.indexOf("test")+4));
        //方式一
        char[] charstr = str1.toCharArray();

//        方式二
        char[] charstr2 = new char[str1.length()];
        for (int i = 0; i < charstr2.length; i++) {
            charstr2[i] = str1.charAt(i);
        }

//        用两种方式实现该字符串的倒序输出。(用StringBuffer和for循环方式分别实现)
        StringBuffer stringBuffer = new StringBuffer(str1);
        stringBuffer.reverse();
        System.out.println(stringBuffer);

        String str2 = "";
        for (int i = str1.length()-1; i >= 0; i--) {
           str2 = str2.concat(String.valueOf(str1.charAt(i)));
        }
        System.out.println(str2);


        String[] strings = str1.split(" ");
        for (String string : strings) {
            System.out.println(string);
        }


    }

    @Test
    public void test2(){
//        2、 找出字符串里有几个java
//        "hello java ,java is XXX ,java is xxx";

        String str = "hello java ,java is XXX ,java is xxx";
        str = str.replace(",","");
        String[] strings = str.split(" ");
        int count = 0;
        for (String string : strings) {
            if(string.equals("java"))
                count++;
        }
        System.out.println("count = " + count);
    }
    @Test
    public void test3(){
//        输出一个字符串里的大写字母数，小写英文字母数，非英文字母数
        String str = "hello java ,java is XXX ,java is xxx";
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)>='A'&&str.charAt(i)<='Z'){
                count1++;
            }else if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
                count2++;
            }else{
                count3++;
            }
        }
        System.out.println("大写字母数:"+count1);
        System.out.println("小写英文字母数:"+count2);
        System.out.println("非英文字母数:"+count3);
    }
    @Test
    public void test4(){
//        输入自己的身份证号码，并由此号码输出自己的生日，如1998年8月20日
        String str = "445102200201080010";
        String year = str.substring(6, 10);
        String month = str.substring(10, 12);
        String day = str.substring(12, 14);
        System.out.println(year+"年"+month+"月"+day+"日");
    }

    @Test
    public void test5(){
//        1、 String s= "name=zhangsan height=180 classNo=90728";
//将上面的字符串拆分，结果如下:
//zhangsan 180 90728
        String s= "name=zhangsan height=180 classNo=90728";
        String[] strings = s.split(" ");
        for (String string : strings) {
            System.out.print(string.split("=")[1]+" ");
        }
    }
    @Test
    public void test6(){
//        模拟一个trim功能一致的方法。去除字符串两端的空白
        String str = "   asjdas   asd    ";
        str = trim_space(str);
        System.out.println(str);

    }
    static String trim_space(String str){
        while(str.indexOf(" ")==0 || str.lastIndexOf(" ") == str.length()-1){
            if (str.indexOf(" ")==0) {
                str = str.substring(str.indexOf(" ") + 1);
            }
            if (str.lastIndexOf(" ") == str.length()-1) {
                str = str.substring(0, str.lastIndexOf(" "));
            }
        }
        return str;
    }
}
