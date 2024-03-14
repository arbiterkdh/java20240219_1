package ch16.sec06.problem08;

public class Example {
    private static Student[] students = {
            new Student("홍길동", 90, 96),
            new Student("신용권", 95, 93)
    };

    //avg() 메소드 작성
    private static double avg(Function<Student> function) {
        double sum = 0.0;
        for (int i = 0; i < students.length; i++) {
            sum += function.apply(students[i]);
        }
        return sum / students.length;
    }


    public static void main(String[] args) {

        double englishAvg = avg(Student::getEnglishScore);
        System.out.println("영어 평균 점수: " + englishAvg);

        double mathAvg = avg(Student::getMathScore);
        System.out.println("수학 평균 점수: " + mathAvg);
    }
}
