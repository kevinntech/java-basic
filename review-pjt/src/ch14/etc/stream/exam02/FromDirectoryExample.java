package ch14.etc.stream.exam02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromDirectoryExample {
    public static void main(String[] args) throws IOException {
        /*
            루트 디렉토리 (최상위 디렉토리)
            windows에서는 C:\
            Unix에서는 /
            Mac에서 Macintosh HD를 선택하면 나오는것이 루트 디렉토리이다.
        */
        Path path = Paths.get("/Users");
        Stream<Path> stream = Files.list(path);
        stream.forEach(p -> System.out.println(p.getFileName()));
    }
}
