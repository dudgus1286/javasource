package exam;

import java.util.Scanner;

public class BankApp {

  static Scanner sc = new Scanner(System.in);
  static Account accArr[] = new Account[100];

  public static void main(String[] args) {
    boolean run = true;

    while (run) {
      System.out.println(
        "-----------------------------------------------------"
      );
      System.out.println(
        "1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료"
      );
      System.out.println(
        "-----------------------------------------------------"
      );
      System.out.print("메뉴 선택 >> ");
      int menu = Integer.parseInt(sc.nextLine());

      switch (menu) {
        case 1:
          createAccount();
          break;
        case 2:
          accountList();
          break;
        case 3:
          deposit();
          break;
        case 4:
          withdraw();
          break;
        case 5:
          System.out.println("프로그램 종료");
          run = false;
          break;
        default:
          System.out.println("유효한 숫자를 입력하시오.");
          break;
      }
    }
  }

  //   static int num = 0;

  static void createAccount() {
    System.out.println("계좌 생성");
    System.out.print("계좌번호 입력 >> ");
    String accountNum = sc.nextLine();
    System.out.print("계좌주 입력 >> ");
    String name = sc.nextLine();
    System.out.print("잔액 입력 >> ");
    int balance = Integer.parseInt(sc.nextLine());

    // accArr[num] = new Account(accountNum, name, balance);
    // num++;

    for (int i = 0; i < accArr.length; i++) {
      if (accArr[i] == null) {
        accArr[i] = new Account(accountNum, name, balance);
        System.out.println("계좌가 생성되었습니다.");
        break;
      }
    }
  }

  static void accountList() {
    System.out.println("계좌 목록");
    for (Account account : accArr) {
      if (account != null) {
        System.out.println(account);
      }
    }
  }

  static void deposit() {
    System.out.println("예금하기");
    System.out.print("계좌번호 입력 >> ");
    String accountNum = sc.nextLine();
    System.out.print("예금액 입력 >> ");
    int amount = Integer.parseInt(sc.nextLine());

    for (int i = 0; i < accArr.length; i++) {
      if (accArr[i] != null) {
        if (accountNum.equals(accArr[i].getAccountNum()) && amount > 0) {
          // accArr[i].setBalance(accArr[i].getBalance() + amount);
          accArr[i].deposit(amount);
          System.out.printf(
            "%s 계좌에 %d원을 예금했습니다.\n",
            accountNum,
            amount
          );
          System.out.println("현재 잔액 " + accArr[i].getBalance() + " 원");
          break;
        } else {
          System.out.println("계좌번호 또는 예금액을 다시 확인하시오.");
          break;
        }
      } else {
        System.out.println("계좌번호를 다시 확인하시오.");
        break;
      }
    }
  }

  static void withdraw() {
    System.out.println("출금하기");
    System.out.print("계좌번호 입력 >> ");
    String accountNum = sc.nextLine();
    System.out.print("출금액 입력 >> ");
    int amount = Integer.parseInt(sc.nextLine());

    // 배열에서 입력받은 계좌번호와 일치한 배열요소 찾기
    Account account = findAccount(accountNum);

    if (account != null) {
      account.withdraw(amount);
      System.out.printf("%s 계좌에 %d원을 출금했습니다.\n", accountNum, amount);
      System.out.println("현재 잔액 " + account.getBalance() + " 원");
    }
  }

  // 배열에서 입력받은 계좌번호와 일치하는 배열요소 찾기 메소드
  static Account findAccount(String accountNum) {
    for (Account account : accArr) {
      if (account != null) {
        if (accountNum.equals(account.getAccountNum())) {
          return account;
        }
      }
    }
    return null; // 배열의 빈 값밖에 없을경우 null 값 선언하기 위해
  }
}
