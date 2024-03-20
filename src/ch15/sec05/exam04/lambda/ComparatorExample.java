package ch15.sec05.exam04.lambda;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorExample {
    public static void main(String[] args) {
//        TreeSet<Fruit> treeSet = new TreeSet<>(new FruitComparator());
//        TreeSet<Fruit> treeSet = new TreeSet<>((a,b)-> a.getPrice() - b.getPrice());
        TreeSet<Fruit> treeSet = new TreeSet<>(Comparator.comparingInt(Fruit::getPrice));
        treeSet.add(new Fruit("포도", 3000));
        treeSet.add(new Fruit("수박", 10000));
        treeSet.add(new Fruit("딸기", 6000));

        for (Fruit fruit : treeSet) {
            System.out.println(fruit.name + ":" + fruit.price);
        }

    }
}
