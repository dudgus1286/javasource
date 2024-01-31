package exam;

import java.util.Scanner;

public class Degrees {

  public static void main(String[] args) {
    // 화씨 온도 => 섭씨 온도
    Scanner sc = new Scanner(System.in);

    System.out.print("화씨 온도 입력 : ");
    int f = sc.nextInt();
    System.out.println("입력된 화씨 온도 : " + f + "°F");

    // int c = (f - 32) * 5 / 9;
    // System.out.println("섭씨 온도로 변환 : " + c + "°C");
    // 선생님이 푼 것
    double c = (f - 32) * 5 / 9.0;
    System.out.println("변환된 섭씨 온도 : " + c);
  }
}
