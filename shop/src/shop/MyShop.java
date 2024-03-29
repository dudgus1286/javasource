package shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyShop implements IShop {

  // 배열 => 리스트로
  // 타입은 객체여야 함(Integer, String, Member ... )
  // List<타입> list = new ArrayList<>();
  // ArrayList<타입> list = new ArrayList<>();

  private List<Customer> customers = new ArrayList<>(10);
  // private Product products[] = new Product[5];
  private List<Product> products = new ArrayList<>(10);
  private String title;
  // 장바구니
  // private Product cart[] = new Product[5];
  private List<Product> cart = new ArrayList<>(10);

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
    customers.add(customer0);

    customer0 = new Customer();
    customer0.setName("김길동");
    customer0.setPayType(PayType.CARD);
    customers.add(customer0);

    customer0 = new Customer();
    customer0.setName("이길동");
    customer0.setPayType(PayType.CARD);
    customers.add(customer0);

    customer0 = new Customer();
    customer0.setName("삼길동");
    customer0.setPayType(PayType.CARD);
    customers.add(customer0);

    customer0 = new Customer();
    customer0.setName("사길동");
    customer0.setPayType(PayType.CARD);
    customers.add(customer0);
  }

  @Override
  public void genProduct() {
    // 제품 생성
    CellPhone cellPhone = new CellPhone("모델명1", 1000, "통신사명");
    products.add(cellPhone);
    cellPhone = new CellPhone("모델명2", 1000, "통신사명");
    products.add(cellPhone);
    cellPhone = new CellPhone("모델명3", 1000, "통신사명");
    products.add(cellPhone);
    SmartTv tv = new SmartTv("모델명4", 5000, "해상도");
    products.add(tv);
    tv = new SmartTv("모델명5", 5000, "해상도");
    products.add(tv);
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
    for (int i = 0; i < customers.size(); i++) {
      System.out.printf(
        "[%d] %s(%s)\n",
        i,
        // customers[i].getName(),
        customers.get(i).getName(),
        // customers[i].getPayType()
        customers.get(i).getPayType()
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
    for (int i = 0; i < products.size(); i++) {
      System.out.printf("[%d] ", i);
      // products[i].printDetail();
      products.get(i).printDetail();
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
        cart.add(products.get(Integer.parseInt(menu)));
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
    // System.out.println("결제방법 : " + customers[customerNo].getPayType());
    System.out.println("결제방법 : " + customers.get(customerNo).getPayType());
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
