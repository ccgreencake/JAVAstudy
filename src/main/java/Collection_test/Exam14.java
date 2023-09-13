package Collection_test;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : LiuDongBin
 * @create 2023/9/10 01:46
 */
public class Exam14 {
    public static void main(String[] args) {
        System.out.println("Please input a string:");
        String str = new Scanner(System.in).next();
        char[] chars = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char aChar : chars) {
            if (map.containsKey(aChar)) {
                map.put(aChar, map.get(aChar) + 1);
            } else {
                map.put(aChar, 1);
            }

        }
        System.out.println(map);

    }
}
