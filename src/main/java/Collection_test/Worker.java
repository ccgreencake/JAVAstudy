package Collection_test;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : LiuDongBin
 * @create 2023/9/10 01:00
 */
public class Worker {
    private int age;
    private String name;
    private double salary;

    @Override
    public String toString() {
        return "Worker{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Worker(int age, String name, double salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    public Worker() {
    }

    @Override
    public boolean equals(Object obj) {
        return this.age == ((Worker) obj).age && this.name.equals(((Worker) obj).name) && this.salary == ((Worker) obj).salary;
    }

    @Override
    public int hashCode() {
        return this.age + this.name.hashCode() + (int) this.salary;
    }
}
