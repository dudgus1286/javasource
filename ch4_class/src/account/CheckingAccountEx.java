package account;

public class CheckingAccountEx {

  public static void main(String[] args) {
    // CheckingAccount cAccount = new CheckingAccount(
    //   "220-11",
    //   "홍길동",
    //   100000,
    //   "111-11"
    // );

    // try {
    //   cAccount.pay("111-11", 50000);
    //   System.out.println("현재 잔액 " + cAccount.getBalance());
    // } catch (Exception e) {
    //   // TODO Auto-generated catch block
    //   e.printStackTrace();
    // }

    // CheckingTrafficCardAccount cTrafficCardAccount = new CheckingTrafficCardAccount(
    //   "220-11",
    //   "홍길동",
    //   100000,
    //   "111-11",
    //   true
    // );

    // try {
    //   cTrafficCardAccount.payTrafficCard("111-11", 1800);
    //   System.out.println("현재 잔액 " + cTrafficCardAccount.getBalance());
    // } catch (Exception e) {
    //   // TODO Auto-generated catch block
    //   e.printStackTrace();
    // }

    // CheckingTrafficCardAccount cTrafficCardAccount2 = new CheckingTrafficCardAccount(
    //   "220-11",
    //   "홍길동",
    //   100000,
    //   "111-11",
    //   true
    // );

    // try {
    //   cTrafficCardAccount2.payTrafficCard("111-11", 3400);
    //   System.out.println("현재 잔액 " + cTrafficCardAccount2.getBalance());
    // } catch (Exception e) {
    //   e.printStackTrace();
    // }

    CreditLineAccount creditLineAccount = new CreditLineAccount(
      "110-15",
      "김호진",
      10000,
      5000000
    );

    try {
      creditLineAccount.withdraw(2500000);
      System.out.println(
        creditLineAccount.getOwner() +
        " 현재 잔액 " +
        creditLineAccount.getBalance()
      );
    } catch (Exception e) {
      e.printStackTrace();
    }

    BonusPointAccount bonusPointAccount = new BonusPointAccount(
      "110-12",
      "이순신",
      0,
      0
    );
    bonusPointAccount.deposit(100000);
    System.out.printf(
      "%s 님의 보너스 포인트는 %d",
      bonusPointAccount.getOwner(),
      bonusPointAccount.getBonusPoint()
    );
  }
}
