package util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListEx3 {

  public static void main(String[] args) {
    // Member 객체 사용자한테 입력 받기

    List<Member> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < 3; i++) {
      System.out.print("아이디 >>> ");
      String id = sc.nextLine();
      System.out.print("이름 >>> ");
      String name = sc.nextLine();

      Member member = new Member();
      member.setId(id);
      member.setName(name);
      list.add(member);
    }

    System.out.println();
    for (Member member : list) {
      System.out.println(member);
    }
  }
}
