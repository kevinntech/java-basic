package ch07.pointtest;

public class PointTest {
    public static void main(String[] args) {
        Point3D p3 = new Point3D();
        System.out.println("p3.x=" + p3.x);
        System.out.println("p3.y=" + p3.y);
        System.out.println("p3.z=" + p3.z);
    }
}

class Point{
    int x = 10;
    int y = 20;

    Point(int x, int y){
        System.out.println("안");
        this.x = x;
        this.y = y;
    }

}

class Point3D extends Point{
    int z = 30;

    Point3D(){
        this(100, 200, 300);
        System.out.println("하세요!");
    }

    Point3D(int x, int y, int z){
        super(x, y);
        System.out.println("녕");
        this.z = z;
    }

    String getLocation(){
        return "x : " + x + ", y : " + y + ", z : " + z;
    }
}
