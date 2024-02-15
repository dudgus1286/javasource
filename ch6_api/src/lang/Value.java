package lang;

// extends Object 기본
public class Value {

  int value;

  public Value(int value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object obj) { // 부모 클래스로 일단 받음
    if (obj instanceof Value) { // obj 가 Value 인스턴스인지 확인
      Value v = (Value) obj; // Value 로 타입 변환
      if (this.value == v.value) { // 변수에 담긴 값으로 비교
        return true;
      }
    }
    return false;
  }

  // 멤버 변수들의 값을 확인하는 용도로 재정의
  @Override
  public String toString() {
    return "Value [value=" + value + "]";
  }
}
