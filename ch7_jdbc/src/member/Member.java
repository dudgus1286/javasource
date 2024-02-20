package member;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// ~DTO : 생성자, getter, setter, toString 메소드가 기본
// @Data : toString, Getter, Setter, defult 생성자, equals, hashCode 자동 생성

// @Data
@Getter
@Setter
@ToString
@NoArgsConstructor // default 생성자
@AllArgsConstructor // 멤버 변수 모두 포함 생성자
public class Member {

  private String id;
  private String name;
  private String password;
}
