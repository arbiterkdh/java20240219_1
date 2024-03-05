package ch07.sec09;

public class InstanceOfExample3 {

    public static void PersonInfo(Person2 person2) {
        System.out.println("name: " + person2.name);
        person2.walk();

        if (person2 instanceof Student2 student2) {
            System.out.println("studentNo: " + student2.studentNo);
            student2.study();
        }
    }

    public static void main(String[] args) {
        Person2 person2 = new Person2("홍길동");
        PersonInfo(person2);
        person2 = new Student2("김길동", 10);
        PersonInfo(person2);
    }
}
