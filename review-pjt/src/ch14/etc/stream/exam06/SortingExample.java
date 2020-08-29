package ch14.etc.stream.exam06;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

class Student implements Comparable<Student>{
    private String name;
    private int score;

    public Student(String name, int score){
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(Student o) {   // 0, 음수, 양수
        //return Integer.compare(score, o.score);
        return score < o.score ? -1 : (score == o.score ? 0 : 1 );
    }
}

public class SortingExample {
    public static void main(String[] args) {
        // 오름차순 정렬
        IntStream intStream = Arrays.stream(new int[] {5, 3, 2, 1, 4});
        intStream.sorted()
                .forEach(n-> System.out.println(n));
        System.out.println();


        List<Student> studentList = Arrays.asList(
                new Student("홍길동", 30),
                new Student("신용권", 10),
                new Student("유미선", 20)
        );

        studentList.stream()
                .sorted()
                .forEach(s -> System.out.println(s.getScore()));
        System.out.println();

        // 내림차순 정렬
        studentList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(s -> System.out.println(s.getScore()));
        System.out.println();
    }
}
