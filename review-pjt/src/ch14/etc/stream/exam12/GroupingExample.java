package ch14.etc.stream.exam12;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student{
    public enum Gender { MALE, FEMALE }
    public enum City { Seoul, Pusan }

    private String name;
    private int score;
    private Student.Gender gender;
    private Student.City city;

    public Student(String name, int score, Student.Gender gender) {
        this.name = name;
        this.score = score;
        this.gender = gender;
    }

    public Student(String name, int score, Student.Gender gender, Student.City city) {
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

    public Student.Gender getGender() {
        return gender;
    }

    public Student.City getCity() {
        return city;
    }
}

public class GroupingExample {
    public static void main(String[] args) {
        List<Student> totalList = Arrays.asList(
                new Student("홍길동", 10, Student.Gender.MALE, Student.City.Seoul),
                new Student("김수애", 6, Student.Gender.FEMALE, Student.City.Pusan),
                new Student("김자바", 10, Student.Gender.MALE, Student.City.Pusan),
                new Student("박수미", 6, Student.Gender.FEMALE, Student.City.Seoul)
        );

        Map<Student.Gender, List<Student>> mapByGender = totalList.stream() // 스트림을 얻어냄
                                                                .collect(Collectors.groupingBy(Student::getGender));
        System.out.print("[남학생] ");
        mapByGender.get(Student.Gender.MALE).stream() // mapByGender 맵에서 키가 Student.Gender.MALE인 List(값)을 가져온 다음, Stream을 생성
                                            .forEach(s-> System.out.print(s.getName() + " ")); // Student 객체의 이름을 출력

        System.out.print("\n[여학생] ");
        mapByGender.get(Student.Gender.FEMALE).stream() // mapByGender 맵에서 키가 Student.Gender.MALE인 List(값)을 가져온 다음, Stream을 생성
                .forEach(s-> System.out.print(s.getName() + " ")); // Student 객체의 이름을 출력


        Map<Student.City, List<String>> mapByCity = totalList.stream()
                                                            .collect(
                                                                    Collectors.groupingBy(
                                                                            Student::getCity, // 키(key)로 사용할 요소 지정한다.
                                                                            Collectors.mapping(Student::getName, Collectors.toList()) // 값(value)으로 사용할 요소를 지정한다.
                                                                    )
                                                            );
        System.out.print("\n[서울] ");
        mapByCity.get(Student.City.Seoul)
                .stream()
                .forEach(name-> System.out.print(name + " "));

        System.out.print("\n[부산] ");
        mapByCity.get(Student.City.Pusan)
                .stream()
                .forEach(name-> System.out.print(name + " "));
    }
}
