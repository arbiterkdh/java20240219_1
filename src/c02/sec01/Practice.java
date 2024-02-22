package c02.sec01;

import java.util.Scanner;

public class Practice {


    public static void main(String[] args) {

//while,Scanner, .nextLine() 활용하기

        String menu =
                """
                        --------------------------------------------------
                         1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
                        --------------------------------------------------
                        선택 >""";

        Scanner scanner = new Scanner(System.in);

        String students;
        int[] scores;
        int num;
        int bestScore = 0;

        run:
        while (true) {
            System.out.print(menu);
            String scan0 = scanner.nextLine();
            if (scan0.equals("1")) {
                System.out.print("학생수 >");
                students = scanner.nextLine();
                num = Integer.parseInt(students);
                scores = new int[num];

                System.out.print(menu);
                String scan1 = scanner.nextLine();
                if (scan1.equals("2")) {
                    for (int i = 0; i < scores.length; i++) {
                        System.out.print("scores[" + i + "]>");
                        String scan2 = scanner.nextLine();
                        int score = Integer.parseInt(scan2);
                        scores[i] = score;
                    }
                    System.out.print(menu);
                    String scan2 = scanner.nextLine();
                    if (scan2.equals("3")) {
                        for (int j = 0; j < scores.length; j++) {
                            System.out.println("scores[" + j + "]>" + scores[j]);
                        }
                        System.out.print(menu);
                        String scan3 = scanner.nextLine();
                        if (scan3.equals("4")) {
                            for (int score : scores) {
                                if (bestScore <= score) {
                                    bestScore = score;
                                }
                            }
                            System.out.println(bestScore);
                            System.out.print(menu);
                            String scan4 = scanner.nextLine();
                            if (scan4.equals("5")) {
                                System.out.println("프로그램 종료");
                                break;
                            }
                        }
                    }
                }


            }

        }

    }
}



