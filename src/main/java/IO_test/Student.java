package IO_test;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : LiuDongBin
 * @create 2023/9/11 00:27
 */
public class Student {
    private int id;
    private int chinese;
    private int math;
    private int english;

    private int total;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", chinese=" + chinese +
                ", math=" + math +
                ", english=" + english +
                ", total=" + total +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public Student() {
    }

    public Student(int id, int chinese, int math, int english) {
        this.id = id;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    public void setTotal(){
        this.total = this.chinese + this.math + this.english;
    }

    public int getTotal() {
        return total;
    }
}
