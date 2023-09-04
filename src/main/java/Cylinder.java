/**
 * Created by IntelliJ IDEA.
 *
 * @Author : LiuDongBin
 * @create 2023/9/4 22:05
 */
public class Cylinder extends Circle{
    double length;

    public Cylinder() {
        this.length = 1;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double findVolume(){
        return findArea()*length;
    }
}
