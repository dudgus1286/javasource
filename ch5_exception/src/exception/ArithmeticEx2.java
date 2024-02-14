package exception;

// 부모
// Object
// Throwable
// Exception
// RuntimeException, IOException
// 자식

// ArithmeticException, ArrayIndexOutOfBoundsException 은 RuntimeException 의 자식

public class ArithmeticEx2 {

  public static void main(String[] args) {
    try {
      System.out.println(args[0]); // ArrayIndexOutOfBoundsException
      System.out.println(3 / 0); // 윗줄에서 에러나서 실행되지도 않음 / ArithmeticException: / by zero
    } catch (Exception e) {
      e.printStackTrace();
    }
    // catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
    //   e.printStackTrace();
    // } - 로 작성 가능

    // catch (ArrayIndexOutOfBoundsException e) {
    //   e.printStackTrace();
    // } catch (ArithmeticException e) {
    //   e.printStackTrace();
    // } -- 로도 작성 가능
  }
}
