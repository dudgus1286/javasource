package exam;

public class Area {

  public static void main(String[] args) {
    // 사다리꼴 넓이 구한 후 출력
    // (윗변 + 아랫변) * 높이 / 2
    // 소수점 2자리까지 출력
    int 윗변 = 3;
    int 아랫변 = 5;
    int 높이 = 8;
    double 사다리꼴넓이 = (윗변 + 아랫변) * 높이 / 2;
    System.out.printf(
      "윗변이 %d, 아랫변이 %d 그리고 높이가 %d일 때 사다리꼴의 넓이는 %.2f 이다.",
      윗변,
      아랫변,
      높이,
      사다리꼴넓이
    );
    // 선생님이 푼 것
    int top = 7;
    int bottom = 10;
    int height = 3;
    double area = (top + bottom) * height / 2.0;
    // double area = (double)(top + bottom) * height / 2; 캐스팅으로 변수 중 하나 데이터타입 바꿈
    System.out.printf("사다리꼴 넓이 : %.2f", area);
  }
}
