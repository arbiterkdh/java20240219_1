package ch12.lecture.p1object;

public class C04Equals {
    public static void main(String[] args) {
        C04Book book1 = new C04Book("스프링 부트3");
        C04Book book2 = new C04Book("이것이 자바다");
        C04Book book3 = book2;
        C04Book book4 = new C04Book("이것이 자바다");

        System.out.println(book2.equals(book4));
    }
}

class C04Book {
    private String title;

    public C04Book(String title) {
        this.title = title;
    }

    // equals , toString

    @Override
    public boolean equals(Object obj) {
        C04Book other = (C04Book) obj;

        return this.title.equals(other.title);
    }
}
