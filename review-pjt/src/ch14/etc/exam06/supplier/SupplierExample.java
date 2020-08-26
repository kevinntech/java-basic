package ch14.etc.exam06.supplier;

import java.util.function.IntSupplier;

public class SupplierExample {
    public static void main(String[] args) {
        IntSupplier intSupplier = () -> {
            int num = (int) (Math.random() * 6) + 1; // 1~6까지 임의의 수
            return num;
        };

        int num = intSupplier.getAsInt();
        System.out.println("주사위 눈의 수: " + num);

    }
}
