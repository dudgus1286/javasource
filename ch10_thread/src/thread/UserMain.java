package thread;

public class UserMain { // 프로세스

  public static void main(String[] args) { // 메인 쓰레드 : 메인 일꾼
    Calculator calculator = new Calculator();

    Thread t1 = new User1(calculator); // 서브 쓰레드1: 서브 일꾼 1
    Thread t2 = new User2(calculator);

    t1.start();
    t2.start(); // 공유하는 부분(calculator)이 있어서 동기화 메소드로 만들지 않으면 값이 똑같아짐
  }
}
