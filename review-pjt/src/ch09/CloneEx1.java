package ch09;

/*
class Point implements Cloneable {
    int x, y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "x=" + x + ", y=" + y;
    }

    public Point clone(){
        Object obj = null;

        try{
            obj = super.clone(); // clone()는 반드시 예외 처리를 해주어야 한다.
        }catch(CloneNotSupportedException e){ }

        return (Point) obj;
    }
}

public class CloneEx1 {
    public static void main(String[] args) {
        Point original = new Point(3, 5);
        Point copy = original.clone();

        System.out.println(original);
        System.out.println(copy);
    }
}

*/