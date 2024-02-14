package exam2;

public abstract class Calc {

  int a, b;

  public void setValue(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public abstract int calculate();
}
