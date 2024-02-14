package interfacetest;

public class AccountEx {

  public static void main(String[] args) {
    // 인터페이스는 인스턴스 생성 불가
    // Account account = new Account();

    Account account = new CheckingAccount();
  }
}
