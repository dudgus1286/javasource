package exam2;

public class Odd extends OddDetector {

  public Odd(int n) {
    super(n);
  }

  @Override
  public boolean isOod() {
    if (getN() % 2 == 0) {
      return false;
    }
    return true;
  }
}
