package util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEx2 {

  public static void main(String[] args) {
    Set<Integer> set = new HashSet<>();

    for (int i = 0; i < 6; i++) {
      // 1 ~ 45 사이 숫자 6개를 임의 생성
      int num = (int) (Math.random() * 45) + 1;
      set.add(num);
    }

    System.out.println(set);
    // Set 은 중복값은 저장하지 않기 때문에 동일한 숫자가 나올 경우 숫자가 5개 이하일 수도 있음
    // Set ==> List
    List<Integer> list = new ArrayList<>(set);
    list.sort(Comparator.naturalOrder());
    System.out.println(list);

    ArrayList<Integer> list2 = new ArrayList<>();
    list2.add(35);
    list2.add(45);
    list2.add(55);
    list2.add(55);

    Set<Integer> set2 = new HashSet<>(list2);
    System.out.println(set2);

    // 그냥 Member 클래스를 쓰면 중복 판별 불가, 중복 판별 코드 필요
    // equals(), hashCode() 오버라이딩 해야 함
    Set<Member> set3 = new HashSet<>();

    Member member = new Member();
    member.setId("hong123");
    member.setName("홍길동");

    set3.add(member);

    member = new Member();
    member.setId("hong123");
    member.setName("홍길동");

    set3.add(member);

    for (Member mem : set3) {
      System.out.println(mem);
    }
  }
}
