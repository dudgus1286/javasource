package loop;

public class WhileEx1 {

  public static void main(String[] args) {
    //for문1
    for (int i = 0; i < 5; i++) {
      System.out.println("I can do it.");
    }

    System.out.println("");

    //위의 for문을 while로 변경1
    int i = 0;
    while (i < 5) {
      i++;
      System.out.println("I can do it.");
    }

    //for문2
    int sum = 0;
    for (i = 1; i <= 10; i++) {
      sum += i;
      //  sum = sum + i;
    }
    System.out.println("1 ~ 10 까지의 합 " + sum + "\n");

    //위의 for문을 while로 변경2
    i = 0;
    sum = 0;
    while (i <= 10) {
      sum += i;
      i++;
    }
    System.out.println("1 ~ 10 까지의 합 " + sum);
  }
}
