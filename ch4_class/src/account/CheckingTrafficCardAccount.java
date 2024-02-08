package account;

// 은행(Account) + 체크카드(CheckingAccount) + 교통카드 기능 = CheckingTrafficCardAccount
// 예금, 출금 : 부모(Account)가 제공
// 카드 사용금액 지불 : pay(), 부모(CheckingAccount)가 제공
// 교통비 지불 : payTrafficCard()
public class CheckingTrafficCardAccount extends CheckingAccount {

  private boolean hasTrafficCard;

  public CheckingTrafficCardAccount(
    String accountNo,
    String owner,
    int balance,
    String cardNo,
    boolean hasTrafficCard
  ) {
    super(accountNo, owner, balance, cardNo);
    this.hasTrafficCard = hasTrafficCard;
  }

  // cardNo, amount(차비), 교통카드 기능여부
  public void payTrafficCard(String cardNo, int amount) throws Exception {
    if (!hasTrafficCard) {
      throw new Exception("교통카드 기능이 없습니다");
    }
    //교통카드 기능이 존재한다면 cardNo, amount 확인
    pay(cardNo, amount);
  }
}
