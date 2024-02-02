package exam;

public class PrimeNumber {

  public static void main(String[] args) {
    // 1 ~ 100 숫자 중 소수 찾아서 출력, 소수의 개수도 출력
    // 소수는 1보다 큰 자연수 중 1과 자기 자신만 약수로 가지는 수
    int count = 0, total = 0;
    for (int i = 2; i < 101; i++) {
      for (int j = 1; j <= i; j++) {
        if (i % j == 0) {
          // 나누어 떨어지는 숫자의 개수 세기
          count++;
        }
      }
      if (count == 2) {
        total++;
        System.out.print(i + "\t");
      }
      count = 0;
    }
    System.out.println("\n1 ~ 100 소수의 개수는 " + total);
  }
}
