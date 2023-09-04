/**
 * Created by IntelliJ IDEA.
 *
 * @Author : LiuDongBin
 * @create 2023/9/4 22:05
 */
public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(2);
        cylinder.setLength(3);
        System.out.println(cylinder.findVolume());
    }
}
