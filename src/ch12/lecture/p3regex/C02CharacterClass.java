package ch12.lecture.p3regex;

public class C02CharacterClass {
    public static void main(String[] args) {
        // 문자 집합
        System.out.println("a".matches("[abc]"));
        String p1 = "[abc][abc][abc]"; //정규식 하나마다 하나의 문자를 의미.
        System.out.println("bcc".matches(p1));
        System.out.println("abc".matches(p1));
        System.out.println("bac".matches(p1));
        String p2 = "[A-Za-z]"; // 한 정규식 안에 여러 범위 작성 가능.
        System.out.println("G".matches(p2));
        System.out.println("k".matches(p2));
        String p4 = "[0-9]";
        System.out.println("8".matches(p4));
        String p5 = "[가-힣]"; //한글 한 글자의 유니코드 시작 가, 끝 힣
        System.out.println("뷁".matches(p5));

        String p6 = "[^abc]"; // a,b,c 제외하고 다.
        System.out.println("d".matches(p6));


    }
}
