package ch14.etc.stream.exam11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Student{
    public enum Gender { MALE, FEMALE }
    public enum City { Seoul, Pusan }

    private String name;
    private int score;
    private Gender gender;
    private City city;

    public Student(String name, int score, Gender gender) {
        this.name = name;
        this.score = score;
        this.gender = gender;
    }

    public Student(String name, int score, Gender gender, City city) {
        this.name = name;
        this.score = score;
        this.gender = gender;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public Gender getGender() {
        return gender;
    }

    public City getCity() {
        return city;
    }
}

public class ToListExample {
    public static void main(String[] args) {
        List<Student> totalList = Arrays.asList(
            new Student("홍길동", 10, Student.Gender.MALE),
            new Student("김수애", 6, Student.Gender.FEMALE),
            new Student("김자바", 10, Student.Gender.MALE),
            new Student("박수미", 6, Student.Gender.FEMALE)
        );

        // 학생 List에서 남학생들만 별도의 List로 생성
        List<Student> maleList = totalList.stream()
                                .filter(s -> s.getGender() == Student.Gender.MALE)
                                .collect(Collectors.toList());

        maleList.stream()
                .forEach(s -> System.out.println(s.getName()));
        System.out.println();

        Set<Student> femaleList = totalList.stream()
                                            .filter(s -> s.getGender() == Student.Gender.FEMALE)
                                            .collect(Collectors.toCollection(HashSet::new));
        femaleList.stream()
                .forEach(s -> System.out.println(s.getName()));
        System.out.println();

    }
}
