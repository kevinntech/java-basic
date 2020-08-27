package ch14.etc.lamda.andthen_compose;

import java.util.function.Function;

class Member{
    private String name;
    private String id;
    private Address address;

    public Member(String name, String id, Address address){
        this.name = name;
        this.id = id;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Address getAddress() {
        return address;
    }
}

class Address{
    private String country; // 국가
    private String city; // 도시

    public Address(String country, String city){
        this.country = country;
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }
}

public class AndThenComposeExample {
    public static void main(String[] args) {
        Function<Member, Address> functionA; // Member를 매개변수 값으로 전달하면 Address으로 반환하는 functionA를 선언 합니다.
        Function<Address, String> functionB; // Address를 매개변수 값으로 전달하면 String으로 반환하는 functionB를 선언 합니다.
        Function<Member, String> functionAB; // Member를 매개변수 값으로 전달하면 String으로 반환하는 functionAB를 선언 합니다.

        functionA = m -> m.getAddress();
        functionB = a -> a.getCity();

        /* 함수형 인터페이스 functionAB의 apply 메서드를 호출하면서 member 객체를 전달하면
           functionA가 address 객체로 반환하고 이것을 functionB의 매개변수로 전달해서
           functionB가 서울을 얻어 내어 반환 합니다. */
        functionAB = functionA.andThen(functionB);

        String city = functionAB.apply(
                new Member("홍길동", "hong", new Address("한국", "서울"))
        );


        System.out.println("거주 도시: " + city);

        functionAB = functionB.compose(functionA);

        city = functionAB.apply(
                new Member("홍길동", "hong", new Address("한국", "서울"))
        );

        System.out.println("거주 도시: " + city);
    }
}

