package exam2;

public class Div extends Calc {

  @Override
  public int calculate() {
    if (b != 0) {
      return a / b;
    } else {
      return 00000;
    }
  }
}
