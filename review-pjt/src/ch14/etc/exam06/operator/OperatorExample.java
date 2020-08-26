package ch14.etc.exam06.operator;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
    private static int[] scores = { 92, 95, 87 };

    public static int maxOrMin(IntBinaryOperator operator){
        int result = scores[0];

        for(int score : scores){
            result = operator.applyAsInt(result, score);
        }

        return result;
    }

    public static void main(String[] args) {
        // 최대 값 얻기
        // operator.applyAsInt()를 호출하면 아래 람다식의 내용이 실행된다.
        int max = maxOrMin(
                (a, b) -> {
                    if(a >= b) return a;
                    else return b;
                }
        );
        System.out.println("최대 값: " + max );

        // 최소 값 얻기
        int min = maxOrMin(
                (a, b) -> {
                    if(a <= b) return a;
                    else return b;
                }
        );
        System.out.println("최소 값: " + min );

    }
}
