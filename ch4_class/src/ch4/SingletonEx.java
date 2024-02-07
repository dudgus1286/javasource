package ch4;

public class SingletonEx {

  public static void main(String[] args) {
    // Singleton singleton = new Singleton();
    Singleton singleton = Singleton.getInstance(); // Singleton 클래스에서 new Singleton()을 하는 메소드는 가능
    Singleton singleton2 = Singleton.getInstance();
    System.out.println(singleton == singleton2); // true
  }
}
