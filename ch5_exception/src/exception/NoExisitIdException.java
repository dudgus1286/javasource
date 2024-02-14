package exception;

public class NoExisitIdException extends Exception {

  // 생성자
  public NoExisitIdException() {
    super();
  }

  public NoExisitIdException(String message) {
    super(message);
  }
}
