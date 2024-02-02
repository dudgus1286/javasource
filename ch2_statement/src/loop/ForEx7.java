package loop;

public class ForEx7 {

  public static void main(String[] args) {
    // 1 ~ 100 까지 숫자 중 3의 배수만 더하기
    // 단 9의 배수 빼기
    int sum = 0;
    for (int i = 1; i <= 100; i++) {
      if (i % 3 == 0 && i % 9 != 0) {
        sum += i;
      }
    }
    System.out.println(
      "1~100 숫자 중 3의 배수 중 9의 배수를 뺀 수의 합 : " + sum
    );

    int sum3 = 0;
    for (int i = 1; i <= 100; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        sum3 += i;
      }
    }
    System.out.println("1~100 숫자 중 3의 배수와 5의 배수의 합 : " + sum3);
  }
}
