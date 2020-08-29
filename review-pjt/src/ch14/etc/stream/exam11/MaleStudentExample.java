package ch14.etc.stream.exam11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 남학생만 저장하는 컨테이너
class MaleStudent{
    private List<Student> list;

    public MaleStudent(){
        list = new ArrayList<>();
        System.out.println("[" + Thread.currentThread().getName() + "] MaleStudent"); // 현재 스레드의 이름을 출력
    }

    public void accmulate(Student student){ // 매개변수 값으로 Student 객체를 받아 list에 저장한다.
        list.add(student);
        System.out.println("[" + Thread.currentThread().getName() + "] accumulate()");
    }

    public void combine(MaleStudent other){ // 병렬 처리할 때 사용 될 메서드이며 매개변수로 받은 컨테이너와 현재 컨테이너의 내용을 결합한다.
        list.addAll(other.getList());
        System.out.println("[" + Thread.currentThread().getName() + "] combine()");
    }

    public List<Student> getList(){
        return list;
    }
}

public class MaleStudentExample {
    public static void main(String[] args) {
        List<Student> totalList = Arrays.asList(
            new Student("홍길동", 10, Student.Gender.MALE),
            new Student("김수애", 6, Student.Gender.FEMALE),
            new Student("김자바", 10, Student.Gender.MALE),
            new Student("박수미", 6, Student.Gender.FEMALE)
        );

        // totalList에서 남학생만 별도로 필터링 하여 사용자 정의 컨테이너 객체인 MaleStudent에 수집한다.
        MaleStudent maleStudent = totalList.stream()
                                        .filter(s -> s.getGender() == Student.Gender.MALE) // 남학생만 필터링함
                                        .collect( ()->new MaleStudent(),        // 사용자 정의 컨테이너 객체를 생성하는 supplier
                                                  (r, t) -> r.accmulate(t),     // 사용자 정의 컨테이너(r)의 accmulate()를 호출하여 요소(t)를 사용자 정의 컨테이너(r)에 누적한다.
                                                  (r1, r2) -> r1.combine(r2) ); // 사용자 정의 컨테이너(r1, r2) 두 개를 결합한다. (병렬 스트림에서만 사용 됨)

        maleStudent.getList()
                .stream()
                .forEach(s -> System.out.println(s.getName()));

    }
}
