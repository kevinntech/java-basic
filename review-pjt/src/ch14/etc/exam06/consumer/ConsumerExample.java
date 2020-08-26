package ch14.etc.exam06.consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumer = t -> System.out.println(t + "8");
        consumer.accept("java"); // "java"라는 매개변수 값이 t에 대입된다.

        BiConsumer<String, String> biConsumer = (t, u) -> System.out.println(t + u);
        // "JDK"라는 첫 번째 매개변수 값은 t에 대입되며 "1.8"이라는 두 번째 매개변수 값은 u에 대입된다.
        biConsumer.accept("JDK ", "1.8");

        DoubleConsumer doubleConsumer = d -> System.out.println("Java" + d);
        // 8.0이라는 매개변수 값은 d에 대입된다.
        doubleConsumer.accept(8.0);

        ObjIntConsumer<String> objIntConsumer = (t, i) -> System.out.println(t + i);
        // "Java"라는 첫 번째 매개변수 값은 i에 대입되며 8이라는 두 번째 매개변수 값은 i에 대입된다.
        objIntConsumer.accept("Java", 8);
    }
}
