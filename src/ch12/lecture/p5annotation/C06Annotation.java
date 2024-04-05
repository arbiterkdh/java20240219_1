package ch12.lecture.p5annotation;

public class C06Annotation {
    @MyAnnotation6(value = "hello", data = {4, 5})

    String name;
    @MyAnnotation6(value = "hi", data = 6)
    int age;

}

@interface MyAnnotation6 {
    String value() default "";

    int[] data() default {};

}
