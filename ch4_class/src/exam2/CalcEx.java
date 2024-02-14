package exam2;

import java.util.Scanner;

public class CalcEx {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input Num1 : ");
    int num1 = Integer.parseInt(scanner.nextLine());
    System.out.print("Input Num2 : ");
    int num2 = Integer.parseInt(scanner.nextLine());

    System.out.print("Input operator : ");
    String obj = scanner.nextLine();

    if (obj.equals("+")) {
      System.out.println(result(new Add()));
    } else if (obj.equals("-")) {
      System.out.println("뺄셈 결과");
    } else if (obj.equals("*")) {
      System.out.println("곱셈 결과");
    } else if (obj.equals("/")) {
      System.out.println("나눗셈 결과");
    } else {
      System.out.println("다시 입력하시오");
    }
  }

  public static int result(Calc calc) {
    int result = calc.calculate();
    // int result = 0;
    return result;
  }
}
