package ch4;

// 멤버 변수 초기값
// String : null
// int, long : 0
// float, double : 0.0
// char : ' '
// boolean : false

// 클래스 : 설계도
// 객체 : 실제 존재

public class Tv {

  // 멤버 변수
  // 색상(검정, 흰색), 전원상태(on, off), 채널(6, 7, ...), 볼륨(13, 14, ...), 크기...(50, 46, ..)...
  private String color;
  private int channel;
  private boolean power;

  void channelUp() {
    channel++;
  }

  void channelDown() {
    channel--;
  }

  // 생성자 오버로딩( 두 개 이상의 생성자가 있는 경우 )
  public Tv() {}

  public Tv(String color, int channel, boolean power) { // 로컬 변수
    this.color = color; // this.를 생략하면 둘 다 로컬 변수를 의미.
    this.channel = channel;
    this.power = power;
  }

  // 마우스 오른쪽 클릭 => 소스 액션 => Generate Getter and Setter... 클릭
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getChannel() {
    return channel;
  }

  public void setChannel(int channel) {
    this.channel = channel;
  }

  public boolean isPower() {
    return power;
  }

  public void setPower(boolean power) {
    this.power = power;
  }
}
