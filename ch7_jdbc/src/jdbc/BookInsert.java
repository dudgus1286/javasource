package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookInsert {

  public static void main(String[] args) {
    Connection con = null;
    PreparedStatement pstmt = null;

    try {
      // 1. 드라이버 로드
      Class.forName("oracle.jdbc.OracleDriver");

      // 2. 커넥션 얻기
      String url = "jdbc:oracle:thin:@localhost:1521:xe";
      String user = "c##test2";
      String password = "test";
      con = DriverManager.getConnection(url, user, password);
      // 3. sql 구문 작성 후 db서버로 전송
      //       INSERT INTO BOOKTBL b(code,title, writer,price)
      // values(1000, '자바프로그래밍 입문', '박은종', 28500);
      String sql =
        "INSERT INTO BOOKTBL b(code,title, writer,price) VALUES(1000, '자바프로그래밍 입문', '박은종', 28500)";
      pstmt = con.prepareStatement(sql);
      // 4. sql 구문 실행
      // executeUpdate() : 실행할 sql 구문이 insert, update, delete 일 때 호출 (리턴 값 int)
      // executeQuery() : 실행할 sql 구문이 select 일 때 호출 (리턴 값 ResultSet)
      int result = pstmt.executeUpdate(); // result 가 0 보다 크면 성공
      if (result > 0) {
        System.out.println("입력 성공");
      } else {
        System.out.println("입력 실패");
      }
    } catch (ClassNotFoundException | SQLException e) {
      e.printStackTrace();
    } finally {
      // 자원 해제: con 을 맨 나중에
      try {
        if (pstmt != null) {
          pstmt.close();
        }
        if (con != null) {
          con.close();
        }
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }
}
