package ch05.lecture.p3enum;

public class C02Enum {
    public static void main(String[] args) {
        Season s = Season.FALL;
        switch (s) {
            case SPRING -> System.out.println("봄이네요");
            case SUMMER -> System.out.println("여름이네요");
            case FALL -> System.out.println("가을");
            case WINTER -> System.out.println("겨울");
        }
        s.printDescription();
    }
}

enum Season {
    SPRING,
    SUMMER,
    FALL,
    WINTER;

    public void printDescription() {
        System.out.println(this.name() + "이네요");
    }
}