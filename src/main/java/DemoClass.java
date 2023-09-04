import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 这是一个示例类，用于展示文档注释的使用。
 */
public class DemoClass {

    public static void main(String[] args) throws IOException {
        Student student = new Student("abc", '男', 18, 123456789, 100, 80, 90);
        System.out.println(student.toString());
    }
}