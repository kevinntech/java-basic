package ch14.etc.stream.exam09;

import java.util.Arrays;

public class AggregateExample {
    public static void main(String[] args) {
        long count =  Arrays.stream(new int[]{1, 2, 3, 4, 5})
                        .filter(n -> n%2 == 0)
                        .count();
        System.out.println("2의 배수 개수 : " + count);

        long sum =  Arrays.stream(new int[]{1, 2, 3, 4, 5})
                        .filter(n -> n%2 == 0)
                        .sum();
        System.out.println("2의 배수의 합 : " + sum);

        int max =  Arrays.stream(new int[]{1, 2, 3, 4, 5})
                        .filter(n -> n%2 == 0)
                        .max()
                        .getAsInt();
        System.out.println("최대 값 : " + max);

        int min =  Arrays.stream(new int[]{1, 2, 3, 4, 5})
                    .filter(n -> n%2 == 0)
                    .min()
                    .getAsInt();
        System.out.println("최소 값 : " + min);
    }
}
