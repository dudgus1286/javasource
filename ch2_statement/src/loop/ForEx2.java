package loop;

public class ForEx2 {

  public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {
      System.out.println(i);
    }

    // 1~10의 합계 구하기
    int sum = 0;
    for (int i = 1; i <= 10; i++) {
      sum += i;
      //  sum = sum + i;
    }
    System.out.println("1 ~ 10 까지의 합 " + sum);

    // 1~10과 10~1 출력
    for (int i = 1, j = 10; i <= 10; i++, j--) {
      System.out.printf("%d \t %d\n", i, j);
    }
  }
}
