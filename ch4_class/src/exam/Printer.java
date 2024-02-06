package exam;

public class Printer {

  // System.out.println() 도 오버로딩 적용
  void println(int num1) {
    System.out.println(num1);
  }

  void println(boolean tf) {
    System.out.println(tf);
  }

  void println(double num2) {
    System.out.println(num2);
  }

  void println(String name) {
    System.out.println(name);
  }
}
