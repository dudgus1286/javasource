package shop;

import java.util.Scanner;

public class MyShop2 implements IShop {

  // 배열 데이터 저장
  private Customer customers[] = new Customer[5];
  private Product products[] = new Product[5];
  private String title;
  // 장바구니
  private Product cart[] = new Product[5];

  //
  private int customerNo;

  Scanner sc = new Scanner(System.in);

  @Override
  public void setTitle(String title) {
    this.title = title;
  }

  public String getTitle() {
    return title;
  }

  @Override
  public void genUser() {
    // 고객 생성
    Customer customer0 = new Customer();
    customer0.setName("홍길동");
    customer0.setPayType(PayType.CARD);
    customers[0] = customer0;

    customer0 = new Customer();
    customer0.setName("김길동");
    customer0.setPayType(PayType.CARD);
    customers[1] = customer0;

    customer0 = new Customer();
    customer0.setName("이길동");
    customer0.setPayType(PayType.CARD);
    customers[2] = customer0;

    customer0 = new Customer();
    customer0.setName("삼길동");
    customer0.setPayType(PayType.CARD);
    customers[3] = customer0;

    customer0 = new Customer();
    customer0.setName("사길동");
    customer0.setPayType(PayType.CARD);
    customers[4] = customer0;
  }

  @Override
  public void genProduct() {
    // 제품 생성
    CellPhone cellPhone = new CellPhone("모델명1", 1000, "통신사명");
    products[0] = cellPhone;
    cellPhone = new CellPhone("모델명2", 1000, "통신사명");
    products[1] = cellPhone;
    cellPhone = new CellPhone("모델명3", 1000, "통신사명");
    products[2] = cellPhone;
    SmartTv tv = new SmartTv("모델명4", 5000, "해상도");
    products[3] = tv;
    tv = new SmartTv("모델명5", 5000, "해상도");
    products[4] = tv;
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return super.toString();
  }

  @Override
  public void start() {
    System.out.println(getTitle() + " : 메인화면 - 계정선택");
    System.out.println("==================================");
    for (int i = 0; i < customers.length; i++) {
      System.out.printf(
        "[%d] %s(%s)\n",
        i,
        customers[i].getName(),
        customers[i].getPayType()
      );
    }
    System.out.println("[x] 종료");
    // 사용자한테 입력받기
    System.out.print("고객 번호 >> ");
    String cNo = sc.nextLine();
    System.out.println("\n### " + cNo + " 고객 선택 ###");
    customerNo = Integer.parseInt(cNo);

    if (cNo.equals("x")) {
      System.exit(0);
    } else {
      productList();
    }
  }

  public void productList() {
    // 상품 목록 출력
    System.out.println("\n");
    System.out.println(getTitle() + " : 상품목록 - 상품선택");
    System.out.println("==================================");
    for (int i = 0; i < products.length; i++) {
      System.out.printf("[%d] ", i);
      products[i].printDetail();
    }
    System.out.println("[h] 메인 화면");
    System.out.println("[c] 체크 아웃");

    System.out.print("상품 번호 >> ");
    String menu = sc.nextLine();

    switch (menu) {
      case "h":
        start();
        break;
      case "c":
        checkOut();
        break;
      default: // 0 ~ 4에 해당하는 제품을 장바구니에 추가
        for (int i = 0; i < cart.length; i++) {
          if (cart[i] == null) {
            cart[i] = products[Integer.parseInt(menu)];
            break;
          }
        }
        productList();
    }
  }

  public void checkOut() {
    System.out.println("\n");
    System.out.println(getTitle() + " : 상품목록 - 상품선택");
    System.out.println("==================================");

    int i = 0, total = 0;
    for (Product product : cart) {
      if (product != null) {
        System.out.printf(
          "[%d] %s %d\n",
          i,
          product.getPname(),
          product.getPrice()
        );
        total += product.getPrice();
      }
    }
    System.out.println("==================================");
    System.out.println("합계 : " + total);
    System.out.println("결제방법 : " + customers[customerNo].getPayType());
    System.out.println("[p] 이전");
    System.out.println("[q] 결제");
    String menu = sc.nextLine();

    switch (menu) {
      case "p":
        productList();
        break;
      case "q":
        System.out.println("결제가 완료되었습니다. 종료합니다.");
        System.exit(0);
      default:
        break;
    }
  }
}
