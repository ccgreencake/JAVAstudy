package last;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : LiuDongBin
 * @create 2023/8/25 09:50
 */
public class Student extends Person {
    long number;
    int math;
    int english;
    int computer;

    public Student(String name, char sex, int age, long number, int math, int english, int computer) {
        super(name, sex, age);
        this.number = number;
        this.math = math;
        this.english = english;
        this.computer = computer;
    }

    public double aver(){
        return (math+english+computer)/3.0;
    }

    public int max(){
        int max = math>english?math:english;
        return max>computer?max:computer;
    }

    public int min(){
        int min = math<english?math:english;
        return min<computer?min:computer;
    }

    @Override
    public String toString() {
        return "last.Student{" +
                "number=" + number +
                ", math=" + math +
                ", english=" + english +
                ", computer=" + computer +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }
}
