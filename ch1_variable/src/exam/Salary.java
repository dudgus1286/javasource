package exam;

import java.util.Scanner;

public class Salary {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("월급 입력 : ");
    int salary = sc.nextInt();

    // 10년 저축 금액
    // System.out.println("10년 저축 금액 : " + (salary * 120));

    // 선생님이 푼 것
    int deposit = salary * 12 * 10;
    System.out.println("10년 저축 금액은 " + deposit);
  }
}
