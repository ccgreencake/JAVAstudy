package String_test;

import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : LiuDongBin
 * @create 2023/9/7 21:03
 */
public class Tset2 {
    @Test
    public void test1(){
//        	a、完成一个抽查作业程序，定义一个字符串数组保存姓名，一次随机3个不重复的姓名并输出
        String[] names = new String[10];
        for (int i = 0; i < names.length; i++) {
            names[i] = "name"+i;
        }
        Random random = new Random();
        //随机3个不重复的整数并输出
        int[] ints = new int[3];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(10);
            for (int j = 0; j < i; j++) {
                if(ints[i]==ints[j]){
                    i--;
                    break;
                }
            }
        }
        for (int anInt : ints) {
            System.out.println(names[anInt]);
        }

    }
    @Test
    public void test2(){
        //	b、用两种方法将系统当前的时间并格式化成(2022-11-12 12 :30: 21)这种格式
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(date));
        System.out.println(simpleDateFormat.format(System.currentTimeMillis()));

    }

    @Test
    public void test3(){
        //	c、定义一个方法，可以计算出两个日期之间相差多少天例如：
//		2020年2月17日到2021年3月29日中间一共有多少天？
        Date date1 = new Date(2020-1900, 2-1, 17);
        Date date2 = new Date(2021-1900, 3-1, 29);
        long time = getDay(date1, date2);
        System.out.println(time+"天");
    }
    static long getDay(Date date1,Date date2){
        long time = date2.getTime() - date1.getTime();
        return time/1000/60/60/24;
    }

    public static void main(String[] args) {

//        完成一个猜拳的小游戏。
//       	由系统随机一个数(0表示石头1表示剪刀2表示布)，然后用户输入一个数(0表示石头1表示剪刀2表示布)。输出得出谁赢、谁输，还是平局。
//       	输出的时候要输出“石头”、“剪刀”、“布”，不要输出0、1、2
//	要求：可以写在一个循环里面。输入y表示还想玩，n表示退出游戏。结束之后要输出赢了多少次、输了多少次、平局多少次、记录游戏时长
        int win = 0;
        int lose = 0;
        int draw = 0;
        game: do {
            Random random = new Random();
            System.out.println("请输入你的出拳：");
            Scanner scanner = new Scanner(System.in);
            int user = scanner.nextInt();
            switch (user){
                case 0:
                    System.out.println("你出拳：石头");
                    break;
                case 1:
                    System.out.println("你出拳：剪刀");
                    break;
                case 2:
                    System.out.println("你出拳：布");
                    break;
            }
            int system = random.nextInt(3);
            switch (system){
                case 0:
                    System.out.println("系统出拳：石头");
                    if (user==0){
                        System.out.println("平局");
                        draw++;
                    }else if (user==1){
                        System.out.println("你赢了");
                        win++;
                    }else {
                        System.out.println("你输了");
                        lose++;
                    }
                    break;
                case 1:
                    System.out.println("系统出拳：剪刀");
                    if (user==0){
                        System.out.println("你输了");
                        lose++;
                    }else if (user==1){
                        System.out.println("平局");
                        draw++;
                    }else {
                        System.out.println("你赢了");
                        win++;
                    }
                    break;
                case 2:
                    System.out.println("系统出拳：布");
                    if (user==0){
                        System.out.println("你赢了");
                        win++;
                    }else if (user==1){
                        System.out.println("你输了");
                        lose++;
                    }else {
                        System.out.println("平局");
                        draw++;
                    }
                    break;
            }
            System.out.println("是否继续？y/n");
            String s = scanner.next();
            if (s.equals("n")){
                System.out.println("你赢了"+win+"次，输了"+lose+"次，平局"+draw+"次");
                break game;
            }
        }while (true);


    }

}
