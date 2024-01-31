package operator;

// 산술연산자: +, -, *, /, %(나머지)
public class ArithmeticEx2 {

  public static void main(String[] args) {
    // int apple = 1;
    // double pieceUnit = 0.1d;
    // int number = 7;
    // double result = apple - number * pieceUnit;

    int apple = 1;
    int totalPieces = apple * 10;
    int number = 7;
    int temp = totalPieces - number;

    double result = temp / 10.0;

    System.out.println(result);
    // 런타임 예외사항
    // Exception in thread "main" java.lang.ArithmeticException: / by zero
    // System.out.println(10 / 0);
  }
}
