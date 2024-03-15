package ch12.lecture.p3regex;

public class C01Character {
    public static void main(String[] args) {
        // REGular EXpression : regex : 정규표현식 : 특정 규칙의 문자열을 표현하기 위한 문자열 패턴.
        // 한 문자.
        String pattern1 = "a";
        boolean matches = "a".matches(pattern1);
        System.out.println(matches);
        System.out.println("b".matches(pattern1));
        System.out.println("aa".matches(pattern1));
        System.out.println("\\".matches("\\\\"));
        // regex . : 모든 문자열.
        System.out.println("ㅋ".matches("."));
        System.out.println(".".matches("\\."));
    }
}
