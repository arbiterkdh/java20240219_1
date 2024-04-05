package ch12.lecture.p5annotation;

import java.util.List;

@MyAnnotation1
public class C01Annotation {
    @MyAnnotation1
    public static void main(String[] args) {
        // annotation : 코드의 추가 정보
        // 컴파일러나 프레임워크나 빌드 툴 등 다른 도구들이 사용함

    }
}

@MyAnnotation1
class MyClass1 {
    @MyAnnotation1
    private String name;

    @MyAnnotation1
    MyClass1(String name, int age) {

    }

    @MyAnnotation1
    public String method(Double param, List<?> list) {
        return null;
    }
}

@MyAnnotation1
@interface MyAnnotation1 {
}