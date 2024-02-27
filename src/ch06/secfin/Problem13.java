package ch06.secfin;

public class Problem13 {

    String name, id, password;
    int age;


    public Problem13(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public static void main(String[] args) {
        Problem13 p13 = new Problem13("강동현", "kang");
        System.out.println(p13.name + p13.id);
    }
}
