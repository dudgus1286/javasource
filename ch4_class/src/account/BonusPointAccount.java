package account;

// 은행 + 보너스 포인트(예금액의 0.1%)

public class BonusPointAccount extends Account {

  // 보너스 포인트
  private int bonusPoint = 0;

  // 생성자
  public BonusPointAccount(
    String accountNo,
    String owner,
    int balance,
    int bonusPoint
  ) {
    super(accountNo, owner, balance);
    this.bonusPoint = bonusPoint;
  }

  // 예금하다 오버라이딩
  // 예금 + 보너스 포인트 정립
  @Override
  public void deposit(int amount) {
    super.deposit(amount);
    this.bonusPoint += (int) (amount * 0.01);
  }

  public int getBonusPoint() {
    return bonusPoint;
  }
}
