package exam;

import javax.swing.Spring;

public class GoodsStock {

  // 상품 클래스
  // 속성: 상품코드(p1011), 재고수량(300)
  private String goodsCode;
  private int stockNum;

  // 생성자
  public GoodsStock() {
    // default 생성자
  }

  public GoodsStock(String goodsCode, int stockNum) {
    this.goodsCode = goodsCode;
    this.stockNum = stockNum;
  }

  // 메소드
  // 재고수량 추가
  int addStock(int amount) {
    stockNum = stockNum + amount;
    return stockNum;
  }

  // 재고수량 감소
  int subtrackStock(int amount) {
    stockNum = stockNum - amount;
    return stockNum;
  }
}
