package exam;

import java.util.Scanner;

public class LeapYear {

  public static void main(String[] args) {
    // 년도 입력 후 윤년, 평년 출력
    // 윤년: 해당 년도를 4로 나눈 나머지가 0이고
    // 100으로 나눈 나머지가 0 이거나 400으로 나눈 나머지가 0이면 윤년
    System.out.print("년도를 입력하시오 : ");
    Scanner sc = new Scanner(System.in);
    int year = sc.nextInt();

    if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
      System.out.println(year + "년은 윤년입니다.");
    } else {
      System.out.println(year + "년은 평년입니다.");
    }
    // year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)
  }
}
