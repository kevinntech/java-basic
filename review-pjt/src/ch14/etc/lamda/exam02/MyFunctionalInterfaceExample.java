package ch14.etc.lamda.exam02;

/* 매개변수가 있고 리턴 값 없는 람다식 작성 */
interface MyFunctionInterface{
    public void method(int x);
}

public class MyFunctionalInterfaceExample {
    public static void main(String[] args) {
        MyFunctionInterface fi;

        fi = (x) -> {
            int result = x*5;
            System.out.println(result);
        };

        fi.method(2);

        fi = (x) -> { System.out.println(x*5); };
        fi.method(2);

        fi = x -> System.out.println(x*5);
        fi.method(2);
    }
}
