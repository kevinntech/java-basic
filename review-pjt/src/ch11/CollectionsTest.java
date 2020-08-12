package ch11;

import java.util.*;

public class CollectionsTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("abc");

        list = Collections.unmodifiableList(list);

        System.out.println(list.get(0));

        //list.add("aaa");
        //list.remove(0);

        Set set = Collections.singleton("aaa");

        System.out.println(set.remove(0));
        System.out.println(set);
        //set.add("bbb");
    }
}
