package exception;

public class AccountEx {

  public static void main(String[] args) {
    Account acc = new Account();
    acc.setBalance(100000);

    try {
      acc.withdraw(200000);
    } catch (Exception e) {
      //   System.out.println(e.getMessage());
      e.printStackTrace();
    }
  }
}
