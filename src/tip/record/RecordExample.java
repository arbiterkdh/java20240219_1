package tip.record;

public class RecordExample {
    public static void main(String[] args) {
        Record record = new Record("흥민쏜", 33);
        Record1 record1 = new Record1("리캉인", 25);
        System.out.println(record.name() + record.age());
        System.out.println(record1.name + record1.age);
    }
}
