package ch15.sec05.exam04.lambda;

import java.util.Comparator;

public class FruitComparator implements Comparator<Fruit> {
    public int compare(Fruit o1, Fruit o2) {
        if (o1.price < o2.price) return -1;
        else if (o1.price == o2.price) return 0;
        return 1;
    }
}
