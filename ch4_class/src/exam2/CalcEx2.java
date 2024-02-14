package exam2;

import java.util.Scanner;

public class CalcEx2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input Num1 : ");
    int num1 = Integer.parseInt(scanner.nextLine());
    System.out.print("Input Num2 : ");
    int num2 = Integer.parseInt(scanner.nextLine());

    System.out.print("Input operator : ");
    String obj = scanner.nextLine();

    Calc calc = null;

    switch (obj) {
      case "+":
        calc = new Add();
        break;
      case "-":
        calc = new Sub();
        break;
      case "*":
        calc = new Mul();
        break;
      case "/":
        calc = new Div();
        break;
      default:
        break;
    }

    calc.setValue(num1, num2);
    System.out.println(calc.calculate());
  }
}
