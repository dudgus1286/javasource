package operator;

// 산술연산자: +, -, *, /, %(나머지)
public class ArithmeticEx1 {

  public static void main(String[] args) {
    int num1 = 5, num2 = 2;
    int result1 = num1 + num2;
    System.out.printf("%d + %d = %d\n", num1, num2, result1);

    result1 = num1 - num2;
    System.out.printf("%d - %d = %d\n", num1, num2, result1);

    result1 = num1 * num2;
    System.out.printf("%d * %d = %d\n", num1, num2, result1);

    result1 = num1 / num2; // 2 : 몫만 나옴
    System.out.printf("%d / %d = %d\n", num1, num2, result1);

    result1 = num1 % num2; // 1 : 5를 2로 나눈 나머지값
    System.out.printf("%d %% %d = %d\n", num1, num2, result1);

    double d1 = 6.0d;
    int d2 = 4;
    double result2 = d1 / d2;
    System.out.printf("%f / %d = %f\n", d1, d2, result2);

    result2 = d1 % d2;
    System.out.printf("%f %% %d = %f\n", d1, d2, result2);

    char ch1 = 'A' + 1;
    // char ch2 = ch1 + 1;
    System.out.printf("ch = %c", ch1);
  }
}
