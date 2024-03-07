package tip.record;

public record Record(
        String name,
        int age
) {
}

class Record1 {
    String name;
    int age;

    public Record1(String name, int age) {
        this.name = name;
        this.age = age;
    }


}