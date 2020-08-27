package ch14.etc.lamda.exam03;

/* 매개변수가 있고 리턴 값도 있는 람다식 작성 */
interface MyFunctionInterface{
    public int method(int x, int y);
}

public class MyFunctionalInterfaceExample {
    public static void main(String[] args) {
        MyFunctionInterface fi;

        fi = (x, y) -> {
            int result = x+y;
            return result;
        };

        System.out.println(fi.method(2, 5));

        fi = (x, y) -> { return x + y; };
        System.out.println(fi.method(2, 5));

        fi = (x, y) -> sum(x, y);
        System.out.println(fi.method(2, 5));
    }

    public static int sum(int x, int y){
        return x + y;
    }
}
