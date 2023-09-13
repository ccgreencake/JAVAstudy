package Object_test;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : LiuDongBin
 * @create 2023/9/10 22:28
 */
public class Student {
    private int age;
    private String name;
    private double score;

    public Student() {
    }

    public Student(int age, String name, double score) {
        this.age = age;
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return name+ " " + age;
    }


}
