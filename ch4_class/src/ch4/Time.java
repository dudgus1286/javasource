package ch4;

// 시, 분, 초는 모두 0보다 크거나 같아야 한다
// 시의 범위는 0~23, 분과 초의 범위는 0~59 사이 이다.

public class Time {

  // 멤버 변수, 속성, 필드, 인스턴스 변수
  // 인스턴스마다 다른 값을 저장 가능
  // 참조변수가 없을때 가비지컬렉터에 의해 자동으로 제거됨
  private int hour;
  private int minute;
  private float second;

  // 클래스 변수 - static 이 변수 앞에 붙음
  // 클래스가 로딩될 때 생성되고 프로그램이 종료될 때 소멸
  private static String max;

  public int getHour() {
    return hour;
  }

  // 메소드 내부에 선언된 변수: 지역 변수
  // 메소드 종료되면 사라짐. for, if {}블럭 내부에 선언된 변수도 블럭을 벗어나는 경우 소멸
  public void setHour(int hour) {
    if (hour < 0 || hour > 23) return; // void 일 때 return으로 돌려보낼 수 있음
    this.hour = hour;
  }

  public int getMinute() {
    return minute;
  }

  public void setMinute(int minute) {
    if (minute < 0 || minute > 59) return;
    this.minute = minute;
  }

  public float getSecond() {
    return second;
  }

  public void setSecond(float second) {
    if (second < 0 || second > 59) return;
    this.second = second;
  }
}
