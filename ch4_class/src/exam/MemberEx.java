package exam;

public class MemberEx {

  public static void main(String[] args) {
    // 회원 객체 생성 => 생성자 호출
    // 아이디, 비밀번호, 이름 필수
    // 아이디, 비밀번호, 이름, 나이, 직업
    // grade, point => 마트 규칙에 따라 변경

    // 필수 정보 세 개만 입력한 멤버
    Member member1 = new Member("member1", "member1", "홍길동");
    // 다섯 정보 전부 입력한 멤버
    Member member2 = new Member("member2", "member2", "성춘향", 30, "회사원");
    // 아무 정보도 입력하지 않은 경우
    // Member member3 = new Member();
  }
}
