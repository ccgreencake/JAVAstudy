package Collection_test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : LiuDongBin
 * @create 2023/9/10 01:24
 */
public class Exam10_13 {
    public static void main(String[] args) {
        HashMap<Integer, String > Champion = new HashMap<>();
        Champion.put(1930, "乌拉圭");
        Champion.put(1934, "意大利");
        Champion.put(1938, "意大利");
        Champion.put(1950, "乌拉圭");
        Champion.put(1954, "德国");
        Champion.put(1958, "巴西");
        Champion.put(1962, "巴西");
        Champion.put(1966, "英格兰");
        Champion.put(1970, "巴西");
        Champion.put(1974, "德国");
        Champion.put(1978, "阿根廷");
        Champion.put(1982, "意大利");
        Champion.put(1986, "阿根廷");
        Champion.put(1990, "德国");
        Champion.put(1994, "巴西");
        Champion.put(1998, "法国");
        Champion.put(2002, "巴西");
        Champion.put(2006, "意大利");
        System.out.println("请输入年份");
        int year = new Scanner(System.in).nextInt();
        if (Champion.containsKey(year)) {
            System.out.println(year + "年的冠军是" + Champion.get(year));
        } else {
            System.out.println("没有举办世界杯");
        }
        System.out.println("请输入国家");
        Set<Integer> years = Champion.keySet();
        String country = new Scanner(System.in).next();
        if (Champion.containsValue(country)) {
            // 遍历所有的key
            for (Integer key : years) {
                if (Champion.get(key).equals(country)) {
                    System.out.print(key+"\t");
                }
            }
        } else {
            System.out.println(country + "没有获得过世界杯冠军");
        }
        
    }
}
