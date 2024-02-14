package interfacetest;

public class SoundableEx {

  public static void main(String[] args) {
    // Cat cat = new Cat();
    // printSound(cat); 아래 코드와 같은 의미
    printSound(new Cat());
    printSound(new Dog());
  }

  public static void printSound(Soundable soundable) {
    System.out.println(soundable.sound());
  }
}
