package ch4;

import java.util.Scanner;

public class StudentEx4 {

  public static void main(String[] args) {
    Student3 stuArr[] = new Student3[3];
    System.out.println(stuArr[0]); // null
    // System.out.println(stuArr[0].getId()); // NullPointerException;

    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < stuArr.length; i++) {
      stuArr[i] = new Student3();
      System.out.print("아이디 입력 : ");
      String id = sc.nextLine();
      System.out.print("이름 입력 : ");
      String name = sc.nextLine();
      System.out.print("국어점수 입력 : ");
      int kor = Integer.parseInt(sc.nextLine()); // String 형태로 받고 Int 형태로 형변환
      System.out.print("영어점수 입력 : ");
      int eng = Integer.parseInt(sc.nextLine());
      System.out.print("수학점수 입력 : ");
      int math = Integer.parseInt(sc.nextLine());
      // 아이디, 이름, 국어, 영어, 수학점수 입력받아서 초기화
      stuArr[i].setId(id);
      stuArr[i].setName(name);
      stuArr[i].setKor(kor);
      stuArr[i].setEng(eng);
      stuArr[i].setMath(math);
    }
    // 출력해서 확인

    //   System.out.println(student3);  ==> toString()의 형태로 나옴
    // 아이디 이름 국 영 수 총점 평균
    System.out.println("==============================");
    System.out.println("아이디 이름 국 영 수 총점 평균");
    System.out.println("==============================");
    for (int i = 0; i < stuArr.length; i++) {
      System.out.printf("%s ", stuArr[i].getId());
      System.out.printf("%s ", stuArr[i].getName());
      System.out.printf("%d ", stuArr[i].getKor());
      System.out.printf("%d ", stuArr[i].getEng());
      System.out.printf("%d ", stuArr[i].getMath());
      int sum = stuArr[i].getKor() + stuArr[i].getEng() + stuArr[i].getMath();
      System.out.printf("%d ", sum);
      System.out.printf("%.2f\n", ((double) sum / 3));
    }

    System.out.println("==============================");

    for (Student3 student3 : stuArr) {
      // (Student3 student3 : stuArr) 의 의미
      // Student3 student3 = stuArr[i]; student3란 이름의 변수에 stuArr[i]의 값을 넣음;
      // fori 블럭 안에 Student3 student3 = stuArr[i]; 변수 선언하면 아래와 같은 명령을 위에서도 쓸 수 있음;
      int total = student3.getKor() + student3.getEng() + student3.getMath();
      System.out.printf(
        "%s %s %d %d %d %d %.2f\n",
        student3.getId(),
        student3.getName(),
        student3.getKor(),
        student3.getEng(),
        student3.getMath(),
        total,
        total / 3.0
      );
    }
  }
}
