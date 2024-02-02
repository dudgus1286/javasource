package exam;

import java.util.Scanner;

public class Bank {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean run = true;

    int balance = 0; // 잔액

    while (run) {
      System.out.println("-------------------------------------");
      System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
      System.out.println("-------------------------------------");
      System.out.print("메뉴 선택 >> ");
      int menu = sc.nextInt();

      switch (menu) {
        case 1:
          // 예금액 입력 받은 후 잔액 추가
          System.out.println("1. 예금");
          Scanner scPlus = new Scanner(System.in);
          System.out.print("예금액 >> ");
          int plus = scPlus.nextInt();
          System.out.println(plus + "원을 예금했습니다.");
          balance += plus;
          break;
        case 2:
          // 출금액 입력 받은 후 잔액 감소
          System.out.println("2. 출금");
          Scanner scMinus = new Scanner(System.in);
          System.out.print("출금할 액수 입력 >> ");
          int minus = scMinus.nextInt();
          System.out.println(minus + "원을 출금했습니다.");
          balance -= minus;
          break;
        case 3:
          // 잔액 출력
          System.out.println("3. 잔고");
          System.out.println(">> 잔액은 " + balance + "입니다.");
          break;
        case 4:
          System.out.println("프로그램 종료");
          run = false;
          break;
        default:
          break;
      }
    }
  }
}
