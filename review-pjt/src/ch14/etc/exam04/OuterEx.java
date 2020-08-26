package ch14.etc.exam04;

/* 매개변수가 없고 리턴 값도 없는 람다식 작성 */
interface MyFunction{
    public void method();
}

class Outer {
    int val = 10; // Outer.this.val

    class Inner{
        int val = 20; // this.val

        // 람다식 내에서 참조하는 지역 변수(i, val)는 final이 붙지 않았어도 상수로 간주된다.
        // 그래서 이 지역 변수(i, val)의 값을 번경 할 수 없다.
        void method(int i){
            int val = 30;
            // i = 10; // 에러. 상수의 값을 변경 할 수 없음

            MyFunction f = () -> {
                System.out.println("                i : " + i );
                System.out.println("              val : " + val );
                System.out.println("         this.val : " + ++this.val );
                System.out.println("   Outer.this.val : " + ++Outer.this.val );
            };

            f.method(); // 인터페이스의 method() 호출
        }
    }
}

public class OuterEx {

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner(); // Outer 클래스의 내부 클래스인 Inner 클래스의 인스턴스 생성
        inner.method(100);
    }
}
