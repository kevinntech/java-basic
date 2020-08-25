package ch14.etc.exam01;

/* 매개변수가 없고 리턴 값도 없는 람다식 작성 */
interface MyFunctionInterface{
    public void method();
}

public class MyFunctionalInterfaceExample {
    public static void main(String[] args) {
        MyFunctionInterface fi;

        fi = () -> {
            String str = "method call1";
            System.out.println(str);
        };
        fi.method();

        fi = () -> {System.out.println("method call2");};
        fi.method();

        fi = () -> System.out.println("method call3");
        fi.method();

        fi = new MyFunctionInterface() {
            @Override
            public void method() {
                System.out.println("method call4");
            };
        };
        fi.method();

    }
}
