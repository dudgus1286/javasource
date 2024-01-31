package exam;

public class Pencil {

  public static void main(String[] args) {
    // 534 자루의 연필을 30명의 학생들에게 똑같은 개수로 나눌때
    // 학생 한 명 당 몇 개를 가질 수 있고, 최종적으로 몇 개가 남는지 출력하시오
    // 변수 사용

    int pencil = 534;
    int student = 30;
    int a1 = pencil / student;
    int a2 = pencil % student;

    System.out.println(a1 + " " + a2);
    System.out.printf(
      "%d 자루의 연필을 %d 명의 학생들에게 똑같은 개수로 나눌 때 학생 한 명 당 %d 개를 가질 수 있고, 최종적으로 %d 개가 남는다",
      pencil,
      student,
      a1,
      a2
    );
  }
}
