package exam;

import javax.swing.Spring;

public class GoodsStock {

  // 상품 클래스
  // 속성: 상품코드(p1011), 재고수량(300)
  private Spring goodsCode;
  private int stockNum;

  // 생성자
  public GoodsStock() {
    // default 생성자
  }

  public GoodsStock(Spring goodsCode, int stockNum) {
    this.goodsCode = goodsCode;
    this.stockNum = stockNum;
  }
}
