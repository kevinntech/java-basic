package ch03;

public class OperatorEx1 {
    public static void main(String[] args) {
        /* 증가 연산자를 단독으로 사용 했기 때문에 전위형과 후위형의 차이가 없다 */
        int i = 5;
        i++;
        System.out.println(i);  // 6

        i=5;
        ++i;
        System.out.println(i);  // 6
    }
}
