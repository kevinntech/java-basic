package ch14.etc.stream.exam03;

import java.util.Arrays;
import java.util.List;

class Member{
    public static int MALE = 0;
    public static int FEMALE = 1;

    private String name;
    private int gender;
    private int age;

    public Member(String name, int gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public int getGender() { return gender; }
    public int getAge() { return age; }
}

public class StreamPipelinesExample {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
            new Member("홍길동", Member.MALE, 30),
            new Member("김나리", Member.FEMALE, 20),
            new Member("김자바", Member.MALE, 45),
            new Member("박수미", Member.FEMALE, 27)
        );

        double ageAvg = list.stream()
                            .filter(m -> m.getGender() == Member.MALE)
                            .mapToInt(m -> m.getAge())
                            .average()
                            .getAsDouble();

        System.out.println("남자 평균 나이 : " + ageAvg);
    }
}
