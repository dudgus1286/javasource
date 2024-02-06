package exam;

public class AccountEx {

  public static void main(String[] args) {
    Account account = new Account("110-11-12345", "홍길동", 100000);

    account.withdraw(500);
    int balance;
    balance = account.deposit(1000);
    System.out.println(balance);

    System.out.println(account.withdraw(500));
  }
}
