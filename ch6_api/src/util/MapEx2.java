package util;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class MapEx2 {

  public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<>();

    map.put("myId", "1234");
    map.put("asdf", "1111");
    map.put("asdf", "1123"); // key 중복저장 x, 나중에 들어온 것이 저장됨

    Set<String> keys = map.keySet();
    System.out.println(keys);

    Collection<String> values = map.values();
    System.out.println(values);

    Scanner sc = new Scanner(System.in);

    // 아이디와 비밀번호를 입력받아서 Map 에 들어있는지 확인하는 작업
    while (true) {
      System.out.println("아이디와 비밀번호를 입력하세요");
      System.out.print("아이디 : ");
      String id = sc.nextLine().trim();
      System.out.print("비밀번호 : ");
      String password = sc.nextLine().trim();

      // key 값 중 아이디와 일치하는지 확인
      if (!map.containsKey(id)) {
        System.out.println(
          "입력하신 id는 존재하지 않습니다. 다시 입력해 주세요"
        );
        continue;
      } else {
        // value 값 중 비밀번호가 일치하는지 확인
        // 일치하다면 while 문 종료
        // 일치하지 않는다면 안내문구
        if (!map.get(id).equals(password)) {
          System.out.println(
            "입력하신 password는 존재하지 않습니다. 다시 입력해 주세요"
          );
        } else {
          System.out.println("아이디와 비밀번호는 일치합니다.");
          break;
        }
      }
    }
  }
}
