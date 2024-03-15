package ch12.lecture.p3regex;

public class C04Quantifier {
    public static void main(String[] args) {
        //수량자
        // {n} : 정확히 n번
        // {n,m} : n번 이상 m번 이하
        // {n,} : n번 이상
        // + == {1,} 1번 이상
        // * == {0,} 0번 이상
        // ? == {0,1} : 한번 또는 없음

        String p2 = "010-\\d{4}-\\d{4}";
        System.out.println("010-1234-4567".matches(p2));

        String p5 = "[\\w가-힣]+";
        System.out.println("qqwe가감".matches(p5));
        System.out.println("강동qwe".matches(p5));

        String p6 = "010-?\\d{4}-?\\d{4}";
        System.out.println("01012345678".matches(p6));
        System.out.println("010-1234-5687".matches(p6));

        
    }
}
