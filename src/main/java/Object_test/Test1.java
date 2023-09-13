package Object_test;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : LiuDongBin
 * @create 2023/9/10 22:14
 */
class Test1 {
    private int a1=1;
    private static int a2=2;
    public void method(int a3){
        final int a4 = 4;
        class Inner{
            public void print(){
                System.out.println(a1);
                System.out.println(a2);
                System.out.println(a3);
                System.out.println(a4);
            }
        }
    }
}
