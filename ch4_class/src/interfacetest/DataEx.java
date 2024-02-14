package interfacetest;

public class DataEx {

  public static void main(String[] args) {
    // DataAccessObject obj = new Oracle();
    // dbWork(obj);
    // obj = new MySql();
    // dbWork(obj);

    // 자식 객체 생성
    dbWork(new Oracle());
    dbWork(new MySql());

    // 익명(anonymous) 클래스 구현 : 1회용 클래스
    DataAccessObject object = new DataAccessObject() {
      @Override
      public void select() {
        System.out.println("Oracle DB에서 검색");
      }

      @Override
      public void insert() {
        System.out.println("Oracle DB에서 삽입");
      }

      @Override
      public void update() {
        System.out.println("Oracle DB에서 수정");
      }

      @Override
      public void delete() {
        System.out.println("Oracle DB에서 삭제");
      }
    };
    object.select();
    dbWork(object);
  }

  public static void dbWork(DataAccessObject obj) { // 부모클래스 매체변수로 받음
    // 메소드가 자식클래스에서 오버라이딩된 상태
    obj.select(); // Oracle DB에서 검색 or MySql DB에서 검색
    obj.insert(); // Oracle DB에서 삽입 or MySql DB에서 삽입
    obj.update(); // Oracle DB에서 수정 or MySql DB에서 수정
    obj.delete(); // Oracle DB에서 삭제 or MySql DB에서 삭제
  }
}
