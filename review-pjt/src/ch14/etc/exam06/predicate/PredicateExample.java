package ch14.etc.exam06.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Student{
    private String name;
    private String gender;
    private int score;

    public Student(String name, String gender, int score){
        this.name = name;
        this.gender = gender;
        this.score = score;
    }

    public String getGender() {
        return gender;
    }

    public int getScore() {
        return score;
    }

}

public class PredicateExample {

    private static List<Student> list = Arrays.asList(
            new Student("홍길동", "남자", 90),
            new Student("김순회", "여자", 90),
            new Student("김자바", "남자", 95),
            new Student("박한나", "여자", 92)
    );

    public static double avg(Predicate<Student> predicate){
        int count = 0, sum = 0;

        // list에서 Student 객체를 하나씩 가져온다.
        for(Student student : list){
            if(predicate.test(student)){
                count++;
                sum += student.getScore();
            }
        }

        return count > 0 ? (double) sum / count : 0;
    }

    public static void main(String[] args) {
        // 남자 평균 점수
        // predicate.test()의 실행 내용은 아래 람다식이다.
        double maleAvg = avg( t -> t.getGender().equals("남자"));
        System.out.println("남자 평균 점수 : " + maleAvg);

        // 여자 평균 점수
        double femaleAvg = avg( t -> t.getGender().equals("여자"));
        System.out.println("여자 평균 점수 : " + femaleAvg);
    }
}
