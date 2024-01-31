package exam;

public class Result300 {

  public static void main(String[] args) {
    int value = 356;

    // 출력 결과가 300이 나올 수 있도록 산수 연산 기호 사용
    int value2 = value % 100;
    System.out.println(value - value2);
    System.out.printf("value = %d\n", (value / 300) * 300); // -- 선생님이 푼 것

    int num = 24;
    // 변수 num 의 값보다 크면서도 가장 가까운 10의 배수에서 변수 num의 값을 뺀 나머지를 구하시오.
    // 예를 들어 24의 크면서도 가장 가까운 10의 배수는 30이고, 19의 경우 20이고, 81의 경우 90이다.
    int num_1 = (num / 10 + 1) * 10;
    System.out.println(num_1 - num);
    System.out.println(10 - (num % 10)); // -- 선생님이 푼 것

    int num2 = 333;
    // num2 의 값 중 일의 자리를 1로 바꾸는 프로그램 작성
    // 예를 들어 num2의 값이 333 이라면 331이 되고, 777 이라면 771이 된다
    int num2_1 = (int) (num2 * 0.1);
    System.out.println(num2_1 * 10 + 1);
    System.out.println(num2 / 10 * 10 + 1); // -- 선생님이 푼 것
  }
}
