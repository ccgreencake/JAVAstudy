package Collection_test;

import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : LiuDongBin
 * @create 2023/9/10 01:30
 */
public class Exam11 {
    public static void main(String[] args) {
        HashMap<String , String> Teacher = new HashMap<>();
        Teacher.put("Tom","CoreJava");
        Teacher.put("John","Oracle");
        Teacher.put("Susan","Oracle");
        Teacher.put("Jerry","JDBC");
        Teacher.put("Jim","Unix");
        Teacher.put("Kevin","JSP");
        Teacher.put("Lucy","JSP");
        Teacher.put("Allen","JDBC");
        Teacher.put("Lucy","CoreJava");
        System.out.println(Teacher);
        System.out.println("教JSP的老师有：");
        for (String key : Teacher.keySet()) {
            if (Teacher.get(key).equals("JSP")) {
                System.out.println(key);
            }
        }

    }
}
