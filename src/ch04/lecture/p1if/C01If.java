package ch04.lecture.p1if;

import java.util.*;

public class C01If {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("1.가위 2.바위 3.보");

        int user = Integer.parseInt(scanner.nextLine());
        int computer = random.nextInt(1, 4);
        System.out.println(computer);

        if ((user == 1 && computer == 2) || (user == 2 && computer == 3) || (user == 3 && computer == 1)) {
            System.out.println("computer win");
        } else if ((user == 3 && computer == 2) || (user == 2 && computer == 1) || (user == 1 && computer == 3)) {
            System.out.println("user win");
        } else {
            System.out.println("draw");

        }

    }
}
