package ch12.lecture.p3regex;

public class C03PredefinedClass {
    public static void main(String[] args) {
        // [ad-z] == [a-z&&[^bc]] :  &&연산자로 정규식 안에 정규식 조건 추가 가능.

        // [0-9] == \d : digit 의 약자
        // \w : word 모든 영어와 숫자 그리고 _언더바를 의미, 아마도 언더바는 표기법에만 주로 쓰여서 그런듯..
        // \s : white space 공백, 엔터...
        String p1 = "\\d";
        String p2 = "\\w";
        System.out.println("l".matches(p2));

        String str = "Son HeungMin";
        str = str.replaceAll("\\s", ""); //replace 말고 replaceAll 이 정규식을 수행함.
        System.out.println(str);


    }
}
