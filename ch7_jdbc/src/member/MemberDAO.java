package member;

import static member.JdbcUtil.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// 메소드 작성 시
// 1. 실행해야 할 SQL 구문 작성
// insert, update, delete => executeUpate() => int
// select
// 1) 결과값이 하나 : executeQuery() => ~~DTO
// 2) 여러 개 : List<~~DTO>

public class MemberDAO {

  private Connection con;
  private PreparedStatement pstmt;
  private ResultSet rs;

  public int insert(MemberDTO dto) {
    String sql = "INSERT INTO MEMBERTBL m (USERID,PASSWORD,NAME,EMAIL) ";
    sql += "VALUES (?,?,?, ?)";
    int result = 0;

    con = getConnection();
    try {
      pstmt = con.prepareStatement(sql);
      pstmt.setString(1, dto.getUserId());
      pstmt.setString(2, dto.getPassword());
      pstmt.setString(3, dto.getName());
      pstmt.setString(4, dto.getEmail());

      result = pstmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      close(con, pstmt);
    }

    return result;
  }

  public MemberDTO getRow(String userId, String password) {
    con = getConnection();
    MemberDTO memberDTO = null;
    String sql = "SELECT * FROM MEMBERTBL m WHERE USERID = ? AND PASSWORD = ? ";

    try {
      pstmt = con.prepareStatement(sql);
      pstmt.setString(1, userId);
      pstmt.setString(2, password);
      rs = pstmt.executeQuery();
      if (rs.next()) {
        memberDTO = new MemberDTO();
        memberDTO.setUserId(rs.getString("userid"));
        memberDTO.setPassword(rs.getString("password"));
        memberDTO.setName(rs.getString("name"));
        memberDTO.setEmail(rs.getString("email"));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      close(con, pstmt, rs);
    }
    return memberDTO;
  }

  public MemberDTO getRow(MemberDTO dto) {
    con = getConnection();
    MemberDTO memberDTO = null;
    String sql = "SELECT * FROM MEMBERTBL m WHERE USERID = ? AND PASSWORD = ? ";

    try {
      pstmt = con.prepareStatement(sql);
      // 물음표 처리 인덱스 번호 틀렸을 경우: java.sql.SQLException: ORA-17003: 열 인덱스가 부적합합니다.
      pstmt.setString(1, dto.getUserId());
      pstmt.setString(2, dto.getPassword());
      rs = pstmt.executeQuery();
      if (rs.next()) {
        memberDTO = new MemberDTO();
        memberDTO.setUserId(rs.getString("userid"));
        memberDTO.setPassword(rs.getString("password"));
        memberDTO.setName(rs.getString("name"));
        memberDTO.setEmail(rs.getString("email"));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      close(con, pstmt, rs);
    }
    return memberDTO;
  }

  public List<MemberDTO> getRows() {
    // 전체 회원 조회
    List<MemberDTO> list = new ArrayList<>();

    con = getConnection();
    // sql 구문 틀렸을 경우: java.sql.SQLSyntaxErrorException: ORA-00933: SQL 명령어가 올바르게 종료되지 않았습니다
    String sql = "SELECT * ";
    sql += "FROM MEMBERTBL m";
    // 구문과 쌍따옴표 사이에 공백 없으면 "SELECT *FROM MEMBERTBL m" 로 입력되서 오류가 날 수도 있음

    try {
      pstmt = con.prepareStatement(sql);
      rs = pstmt.executeQuery();
      while (rs.next()) {
        MemberDTO mDto = new MemberDTO();
        mDto.setUserId(rs.getString("userid"));
        mDto.setPassword(rs.getString("password"));
        mDto.setName(rs.getString("name"));
        mDto.setEmail(rs.getString("email"));

        list.add(mDto);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      close(con, pstmt, rs);
    }

    return list;
  }

  public int update(String userId, String password) {
    String sql = "UPDATE MEMBERTBL SET PASSWORD = ? WHERE USERID = ?";
    int result = 0;
    con = getConnection();
    try {
      pstmt = con.prepareStatement(sql);
      pstmt.setString(1, password);
      pstmt.setString(2, userId);
      result = pstmt.executeUpdate();
      return result;
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      close(con, pstmt);
    }
    return result;
  }

  public int delete(String userId) {
    int result = 0;
    String sql = "DELETE FROM MEMBERTBL m WHERE userid = ?";

    con = getConnection();
    try {
      pstmt = con.prepareStatement(sql);
      pstmt.setString(1, userId);
      result = pstmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      close(con, pstmt);
    }

    return result;
  }
}
