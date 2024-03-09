package ch08.sec14.test;


public class C03Sample {
    public static void main(String[] args) {
        Shape shape1 = new Round(3); // 반지름 3
        Shape shape2 = new Rectangle(5, 7); // 가로 5, 세로 7
        shape1.printArea(); // 원의 면적 출력 "28.2748"
        shape2.printArea(); // 사각형의 면적 출력 "35"

        printDescription(shape1); // "반지름이 3인원의 면적은 28.2748입니다."
        printDescription(shape2); // "가로 5, 세로 7인 사각형의 면적은 35입니다."

    }

    public static void printDescription(Object o) {
        if (o instanceof Round) {
            System.out.println(o.toString());
        } else if (o instanceof Rectangle) {
            System.out.println(o.toString());
        }

    }
}

// @formatter:off
    abstract class Shape {
        public abstract void printArea();
    }

    class Round extends Shape {
        double PI = Math.PI;
        private final int a;

        public Round(int a){
            this.a = a;
        }
        public void printArea(){
            System.out.println(a*a*PI);
        }

        public String toString(){
            return "반지름이 "+a+"인원의 면적은 "+a*a*PI+"입니다.";
        }

    }

    class Rectangle extends Shape {

        private final int a;
        private final int b;

        public Rectangle(int a, int b){
            this.a = a;
            this.b = b;
        }
        public void printArea(){
            System.out.println(a*b);
        }
        public String toString(){
            return "가로"+a+", 세로 "+b+"인 사각형의 면적은"+a*b+"입니다.";
        }
    }

