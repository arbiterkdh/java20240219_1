package ch07.sec09;

public class Musician extends People {
    public String musicianName;

    public Musician(String name, String musicianName) {
        super(name);
        this.musicianName = musicianName;
    }

    public void sing() {
        System.out.println("공연을 합니다.");
    }
}
