package ch07.sec09;

public class InstanceOfExample2 {
    public static void peopleInfo(People people) {
        System.out.println("name: " + people.name);
        people.walk();

        if (people instanceof Musician musician) {
            System.out.println("musicianName: " + musician.musicianName);
            musician.sing();
        }
    }

    public static void main(String[] args) {
        People people = new People("홍길동");
        peopleInfo(people);
        System.out.println();
        People musician = new Musician("김길동", "길동킴");
        peopleInfo(musician);
    }
}
