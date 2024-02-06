package ch4;

public class MyMathEx {

  public static void main(String[] args) {
    MyMath math = new MyMath(15, 5);

    // non-static 메소드 호출
    System.out.println("add() " + math.add());
    System.out.println("substract() " + math.substract());
    System.out.println("multiply() " + math.multiply());
    System.out.println("divide() " + math.divide());

    //static 메소드 호출
    System.out.println("static add() " + MyMath.add(300l, 200l));
    System.out.println("static substract() " + MyMath.substract(300l, 200l));
    System.out.println("static multiply() " + MyMath.multiply(300l, 200l));
    System.out.println("static divide() " + MyMath.divide(300l, 200l));
  }
}
