package ch12;

import static java.lang.annotation.ElementType.*;
import java.lang.annotation.Target;

@Target({FIELD, TYPE_USE})
public @interface MyAnnotation { }

@MyAnnotation
class MyClass{
    @MyAnnotation
    int i;

    @MyAnnotation
    MyClass mc; 
}
