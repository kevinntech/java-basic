package ch14.etc.stream.exam12;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingAndReductionExample {
    public static void main(String[] args) {
        List<Student> totalList = Arrays.asList(
                new Student("홍길동", 10, Student.Gender.MALE),
                new Student("김수애", 12, Student.Gender.FEMALE),
                new Student("김자바", 10, Student.Gender.MALE),
                new Student("박수미", 12, Student.Gender.FEMALE)
        );

        // 성별(Gender)를 키(key)로, 남/여 학생 평균 점수를 값(Value)으로 갖는 Map을 반환
        Map<Student.Gender, Double> mapByGender = totalList.stream()
                .collect(Collectors.groupingBy(
                        Student::getGender,
                        Collectors.averagingDouble(Student::getScore)
                ));

        System.out.println("남학생 평균 점수: " + mapByGender.get(Student.Gender.MALE));
        System.out.println("여학생 평균 점수: " + mapByGender.get(Student.Gender.FEMALE));

        // 성별(Gender)를 키(key)로, 쉼표로 구분된 학생 이름 문자열을 값(Value)으로 갖는 Map을 반환
        Map<Student.Gender, String> mapByName = totalList.stream()
                .collect(Collectors.groupingBy(
                        Student::getGender,
                        Collectors.mapping(Student::getName, Collectors.joining(","))
                ));

        System.out.println("남학생 전체 이름: " + mapByName.get(Student.Gender.MALE));
        System.out.println("여학생 전체 이름: " + mapByName.get(Student.Gender.FEMALE));
    }
}
