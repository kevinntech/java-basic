package ch14.etc.exam07.andthen_compose;

import java.util.function.Consumer;

public class AndThenExample {
    public static void main(String[] args) {

        Consumer<Member> consumerA = (m) -> {
            System.out.println("consumerA:" + m.getName());
        };

        Consumer<Member> consumerB = (m) -> {
            System.out.println("consumerB:" + m.getId());
        };

        Consumer<Member> consumerAB = consumerA.andThen(consumerB);
        consumerAB.accept(new Member("홍길동", "hong", null));
        /*
            consumerAB의 accept()를 호출할 때, 매개변수로 Member를 전달한다.
            그리고 consumerAB.accept()를 호출 하면 consumerA의 accept()가 먼저 실행되고
            그 다음 consumerB의 accept()가 실행됨
        */
    }
}


