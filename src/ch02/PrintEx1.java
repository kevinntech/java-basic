package ch02;

public class PrintEx1 {
    public static void main(String[] args) {
        byte b = 1;
        short s = 2;
        char c = 'A';

        int finger = 10;
        long big = 100_000_000_000L;
        long hex = 0xFFFF_FFFF_FFFF_FFFFL;

        int octNum = 010;   // 8진수 10   , 10진수로는 8
        int hexNum = 0x10;  // 16진수 10  , 10진수로는 16
        int binNum = 0b10;  // 2진수 10   , 10진수로는 2
        /*
            %n : 줄바꿈
            %d : 10진 정수의 형식으로 출력
            %c : 문자로 출력
            n : 출력할 전체 자리수 지정(오른쪽 정렬)
            -n : 출력할 전체 자리수 지정(왼쪽 정렬)
            0 : 빈 자리를 0으로 채움
            %o : 8진 정수의 형식으로 출력
            %x, %X : 16진 정수의 형식으로 출력
            # : 접두사 0x 와 0이 각각 붙는다.
         */
        System.out.printf("b=%d%n", b);                 // b=1
        System.out.printf("s=%d%n", s);                 // s=2
        System.out.printf("c=%c, %d %n", c, (int)c);    // c=A, 65
        // C 언어에서는 char 타입의 값을 지시자 %d로 출력할 수 있지만, 자바에서는 허용되지 않으므로 형 변환이 필요하다.
        System.out.printf("finger=[%5d]%n", finger);    // finger = [   10]
        System.out.printf("finger=[%-5d]%n", finger);   // finger = [10   ]
        System.out.printf("finger=[%05d]%n", finger);   // finger = [00010]
        System.out.printf("big=%d%n", big);             // big=100000000000
        System.out.printf("hex=%#x%n", hex);            // hex=0xffffffffffffffff
        System.out.printf("octNum=%o, %d%n", octNum, octNum); // octNum=10, 8
        System.out.printf("hexNum=%x, %d%n", hexNum, hexNum); // hexNum=10, 16
        System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum); // binNum=10, 2
        // Integer.toBinaryString() : 정수를 2진 문자열로 변환한다.
    }
}
