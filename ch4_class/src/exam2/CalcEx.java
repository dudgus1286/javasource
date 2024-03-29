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

    switch (obj) {
      case "+":
        System.out.println("덧셈 결과");
        System.out.println(result(new Add(), num1, num2));
        break;
      case "-":
        System.out.println("뺄셈 결과");
        System.out.println(result(new Sub(), num1, num2));
        break;
      case "*":
        System.out.println("곱셈 결과");
        System.out.println(result(new Mul(), num1, num2));
        break;
      case "/":
        System.out.println("나눗셈 결과");
        System.out.println(result(new Div(), num1, num2));
        break;
      default:
        break;
    }
  }

  public static int result(Calc calc, int num1, int num2) {
    calc.setValue(num1, num2);
    int result = calc.calculate();
    return result;
  }
}
