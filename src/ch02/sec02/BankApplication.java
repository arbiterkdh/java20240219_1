package ch02.sec02;

import ch08.sec14.problem14.A;

import java.util.Scanner;

public class BankApplication {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Account[] account = new Account[100];
        String[] accountList = new String[100];


        String menu = """
                -------------------------------------
                1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료
                -------------------------------------
                선택 >""";
        boolean run = true;
        int i = 0;
        while (run) {
            System.out.print(menu);
            String m1 = scanner.nextLine();
            switch (m1) {
                case "1" -> {
                    account[i] = new Account();
                    System.out.println("""
                            ---------
                            계좌생성
                            ---------
                            """);

                    account[i].setMakeAccount();
                    accountList[i] = account[i].asnP;
                    i += 1;
                }
                case "2" -> {
                    System.out.println("""
                            ---------
                            계좌목록
                            ---------
                            """);
                    for (int j = 0; j < i; j++) {
                        account[j].getMakeAccount();
                    }
                }
                case "3" -> {
                    System.out.println("""
                            ---------
                            예금
                            ---------
                            """);
                    System.out.print("계좌번호 :");
                    String m3 = scanner.nextLine();
                    for (int k = 0; k < 100; k++) {
                        if (m3.equals(accountList[k])) {
                            account[k].setDeposit();
                        }
                    }
                }
                case "4" -> {
                    System.out.println("""
                            ---------
                            출금
                            ---------
                            """);
                    System.out.print("계좌번호 :");
                    String m4 = scanner.nextLine();
                    for (int k = 0; k < 100; k++) {
                        if (m4.equals(accountList[k])) {
                            account[k].setWithdraw();
                        }
                    }

                }
                case "5" -> {
                    System.out.println("프로그램 종료");
                    run = false;
                }
            }
        }
    }
}
