package ch14.etc.stream.exam02;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromFileContentExample {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/ch14/etc/stream/exam02/linedata.txt"); // Paths.get()를 호출하여 Path 객체를 얻어낸다.
        Stream<String> stream;

        // (1) Files.line() 메서드 이용
        stream = Files.lines(path, Charset.defaultCharset()); // Charset.defaultCharset(): 운영체제가 사용하는 기본 캐릭터셋을 얻는다.
        stream.forEach(System.out::println); // 파일에서 행 단위로 읽어와서 콘에 출력한다.
        stream.close(); // 스트림의 사용을 마쳤다면 종료
        System.out.println();

        // (2) BufferedReader의 lines()를 이용
        File file = path.toFile(); // 파일 객체를 얻어낸다.
        FileReader fileReader = new FileReader(file); // FileReader 객체를 생성하며 매개변수로 file 객체를 전달한다.
        BufferedReader br = new BufferedReader(fileReader); // BufferedReader 객체 생성
        stream = br.lines();
        stream.forEach(System.out::println); // 파일에서 행 단위로 읽어와서 콘에 출력한다.
        stream.close(); // 스트림의 사용을 마쳤다면 종료
        System.out.println();

    }
}
