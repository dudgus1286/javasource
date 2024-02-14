package exception;

public class WrongPasswordException extends Exception {

  //생성자
  public WrongPasswordException() {
    super();
  }

  public WrongPasswordException(String message) {
    super(message);
  }
}
