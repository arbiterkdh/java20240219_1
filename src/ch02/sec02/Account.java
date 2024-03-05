package ch02.sec02;

import java.util.Scanner;

public class Account {
    Scanner scanner = new Scanner(System.in);
    private String asn;
    public String asnP;
    private String host;
    private int initialDeposit;
    private int deposit;
    private int withdraw;

    public void setMakeAccount() {
        System.out.print("계좌번호 :");
        this.asn = scanner.nextLine();
        this.asnP = this.asn;
        System.out.print("계좌주 :");
        this.host = scanner.nextLine();
        System.out.print("초기입금액 :");
        this.initialDeposit = Integer.parseInt(scanner.nextLine());
        System.out.println("결과 :계좌가 생성되었습니다.");
    }

    public void getMakeAccount() {
        System.out.println("계좌번호 :" + this.asn + "   " + "계좌주 :" + this.host + "   " + this.initialDeposit + "\n");
    }

    public void setDeposit() {
        System.out.print("예금액 :");
        this.deposit = Integer.parseInt(scanner.nextLine());
        this.initialDeposit += this.deposit;
    }

    public void setWithdraw() {
        System.out.print("출금액 :");
        this.withdraw = Integer.parseInt(scanner.nextLine());
        this.initialDeposit -= this.withdraw;
        System.out.println("결과 :출금이 성공되었습니다.");

    }
}
