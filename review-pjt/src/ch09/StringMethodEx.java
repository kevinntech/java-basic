package ch09;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.StringJoiner;

public class StringMethodEx {
    public static void main(String[] args) throws UnsupportedEncodingException {

        String str = "100";

        int i1 = Integer.parseInt(str);
        int i2 = Integer.valueOf(str);

        System.out.println(i1 + i2);

    }
}
