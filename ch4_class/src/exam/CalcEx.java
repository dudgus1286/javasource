package exam;

public class CalcEx {

  public static void main(String[] args) {
    // 객체 생성
    Calc calc = new Calc();

    int result = calc.add(15, 20);
    System.out.println("덧셈 결과 " + result);

    System.out.println("곱셈 결과 " + calc.multiply(3, 5));

    // 나눗셈
    int result2 = calc.divide(6, 2);
    System.out.println("나눗셈 결과 " + result2);
  }
}
