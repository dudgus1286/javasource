package thread;

public class DashThread extends Thread {

  @Override
  public void run() {
    for (int i = 0; i < 300; i++) {
      System.out.printf("%s", new String("-"));
    }
    System.out.println(
      "소유시간 2 : " + (System.currentTimeMillis() - ThreadEx2.start)
    );
  }
}