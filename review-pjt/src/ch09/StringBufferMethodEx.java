package ch09;

public class StringBufferMethodEx {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("0123456");
        String str = sb.substring(3);
        String str2 = sb.substring(3, 5);

        System.out.println(str);
        System.out.println(str2);


    }
}
