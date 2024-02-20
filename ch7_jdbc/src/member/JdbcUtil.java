package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcUtil {
  static {
    try {
      Class.forName("oracle.jdbc.OracleDriver"); // 틀렸을 경우 ClassNotFoundException
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

  public static Connection getConnection() {
    String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 틀렸을 경우 java.sql.SQLException: ORA-17067: 부적합한 Oracle URL이 지정되었습니다
    String user = "c##test2";
    String password = "test"; // java.sql.SQLException: ORA-01017: 사용자명/비밀번호가 부적합, 로그온할 수 없습니다.

    try {
      return DriverManager.getConnection(url, user, password);
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return null;
  }

  public static void close(Connection con, PreparedStatement pstmt) {
    try {
      if (pstmt != null) pstmt.close();
      if (con != null) con.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void close(
    Connection con,
    PreparedStatement pstmt,
    ResultSet sr
  ) {
    try {
      if (sr != null) sr.close();
      if (pstmt != null) pstmt.close();
      if (con != null) con.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
