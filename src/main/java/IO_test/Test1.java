package IO_test;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : LiuDongBin
 * @create 2023/9/11 00:26
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
//        1、假设2105班有60个学生，学号为210501~210560，全部参加语文、数学、英语三门考试，给出所有同学的各科成绩（成绩为整数、随机产生，范围为 [50,100]），并求出每位同学的总成绩。
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < 60; i++) {
            Student student = new Student();
            student.setId(210501 + i);
            student.setChinese((int) (Math.random() * 50 + 50));
            student.setMath((int) (Math.random() * 50 + 50));
            student.setEnglish((int) (Math.random() * 50 + 50));
            student.setTotal();
            students.add(student);
        }
        

//
//a、将各科成绩的第一名(并列第一取学号小的学生)的学生保存至a.txt文件中

        FileOutputStream fileOutputStream = new FileOutputStream("a.txt");
        int max = 0;
        ArrayList<Integer> ids = new ArrayList<>();
        for (Student student: students) {
            if (student.getChinese() > max){
                max = student.getChinese();
            }
        }
        for (Student student: students) {
            if (student.getChinese() == max){
                int id = student.getId();
                String s = String.valueOf(id);
                fileOutputStream.write("语文第一名：".getBytes());
                fileOutputStream.write(s.getBytes());
                break;
            }
        }
        max = 0;
        for (Student student: students) {
            if (student.getMath() > max){
                max = student.getMath();
            }
        }
        for (Student student: students) {
            if (student.getMath() == max){
                int id = student.getId();
                String s = String.valueOf(id);
                fileOutputStream.write("\n数学第一名：".getBytes());
                fileOutputStream.write(s.getBytes());
                break;
            }
        }
        max = 0;
        for (Student student: students) {
            if (student.getEnglish() > max){
                max = student.getEnglish();
            }
        }
        for (Student student: students) {
            if (student.getEnglish() == max){
                int id = student.getId();
                String s = String.valueOf(id);
                fileOutputStream.write("\n英语第一名：".getBytes());
                fileOutputStream.write(s.getBytes());
                break;
            }
        }
        fileOutputStream.close();

        
        
//b、将总成绩前10名的学生信息保存至b.txt文件中
        FileOutputStream fileOutputStream1 = new FileOutputStream("b.txt");
        for (int i = 0; i < 10; i++) {
            int max1 = 0;
            for (Student student: students) {
                if (student.getTotal() > max1){
                    max1 = student.getTotal();
                }
            }
            for (Student student: students) {
                if (student.getTotal() == max1){
                    String s = student.toString();
                    fileOutputStream1.write(s.getBytes());
                    fileOutputStream1.write("\n".getBytes());
                    students.remove(student);
                    break;
                }
            }
        }
        fileOutputStream1.close();
//c、将各科平均分保存至c.txt中
        FileOutputStream fileOutputStream2 = new FileOutputStream("c.txt");
        int chinese = 0;
        int math = 0;
        int english = 0;
        for (Student student: students) {
            chinese += student.getChinese();
            math += student.getMath();
            english += student.getEnglish();
        }
        chinese = chinese / 60;
        math = math / 60;
        english = english / 60;
        String s = "语文平均分：" + chinese + "\n数学平均分：" + math + "\n英语平均分：" + english;
        fileOutputStream2.write(s.getBytes());
        fileOutputStream2.close();
//d、将各科不及格的学员信息保存至d.txt中
        FileOutputStream fileOutputStream3 = new FileOutputStream("d.txt");
        for (Student student: students) {
            if (student.getChinese() < 60){
                String s1 = student.toString();
                fileOutputStream3.write(s1.getBytes());
                fileOutputStream3.write("\n".getBytes());
            }
        }
        for (Student student: students) {
            if (student.getMath() < 60){
                String s1 = student.toString();
                fileOutputStream3.write(s1.getBytes());
                fileOutputStream3.write("\n".getBytes());
            }
        }
        for (Student student: students) {
            if (student.getEnglish() < 60){
                String s1 = student.toString();
                fileOutputStream3.write(s1.getBytes());
                fileOutputStream3.write("\n".getBytes());
            }
        }
        fileOutputStream3.close();
//
//
//2、歌词内容如下
//Every night in my dreams
//I see you I feel you
//That is how I know you go on
//Far across the distance
//And spaces between us
//You have come to show you go on
//Near far
//Wherever you are
//I believe
//That the heart does go on
//Once more you open the door
//And you're here in my heart
//And my heart will go on and on
//Love can touch us one time
//And last for a lifetime
//And never let go till we're gone
//Love was when I loved you
//One true time I hold to
//In my life well always go on
//Near far
//Wherever you are
//I believe
//That the heart does go on
//Once more you open the door
//And you're here in my heart
//And my heart will go on and on
//you're here
//There's nothing I fear
//And I know
//That my heart will go on
//We'll stay forever this way
//You are safe in my heart
//And my heart will go on and on
//
//	1. 将上面歌词内容存放到本地磁盘D 根目录，文件命名为 `word.txt`
        //老师我没d盘
        FileOutputStream f2 = new FileOutputStream("word.txt");
        String str = "Every night in my dreams\n" +
                "I see you I feel you\n" +
                "That is how I know you go on\n" +
                "Far across the distance\n" +
                "And spaces between us\n" +
                "You have come to show you go on\n" +
                "Near far\n" +
                "Wherever you are\n" +
                "I believe\n" +
                "That the heart does go on\n" +
                "Once more you open the door\n" +
                "And you're here in my heart\n" +
                "And my heart will go on and on\n" +
                "Love can touch us one time\n" +
                "And last for a lifetime\n" +
                "And never let go till we're gone\n" +
                "Love was when I loved you\n" +
                "One true time I hold to\n" +
                "In my life well always go on\n" +
                "Near far\n" +
                "Wherever you are\n" +
                "I believe\n" +
                "That the heart does go on\n" +
                "Once more you open the door\n" +
                "And you're here in my heart\n" +
                "And my heart will go on and on\n" +
                "you're here\n" +
                "There's nothing I fear\n" +
                "And I know\n" +
                "That my heart will go on\n" +
                "We'll stay forever this way\n" +
                "You are safe in my heart\n" +
                "And my heart will go on and on";
        f2.write(str.getBytes());
        f2.close();

//
//	2. 选择合适的IO流读取word.txt文件的内容
        FileInputStream f1 = new FileInputStream("word.txt");
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = f1.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));
        }
        f1.close();
//
//	3. 统计每个单词出现的次数(单词忽略大小写)
//
//	4. 如果出现组合单词如 `you're`按一个单词处理
//
//	5. 将统计的结果存储到本地磁盘D根目录下的`wordcount.txt`文件
// 	  wordcout.txt每行数据个数如下
//		and 10个
//		konw 20个
        HashMap<String, Integer> times = new HashMap<>();
        str = str.replace("\n"," ");
        String[] s3 = str.split(" ");
        for (String s1 : s3) {
            if (times.containsKey(s1)) {
                times.put(s1, times.get(s1) + 1);
            }
            else {
                times.put(s1,1);
            }
        }
        System.out.println(times);
        FileOutputStream f4 = new FileOutputStream("wordcount.txt");
        Set<String> strings = times.keySet();
        for (String s1: strings) {
            String s2 = s1 + " " + times.get(s1)+"个";
            f4.write(s2.getBytes());
            f4.write("\n".getBytes());
        }
        f4.close();

    }
}
