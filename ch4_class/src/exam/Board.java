package exam;

import java.time.LocalDateTime;
import javax.swing.Spring;

public class Board {

  // 속성: 글번호, 글제목, 내용, 작성자, 작성날짜, 수정날짜
  private int postNo;
  private String postTitle;
  private String postContent;
  private String writer;
  private LocalDateTime regDate;
  private LocalDateTime lastModifedDate;

  // 생성자
  // default
  public Board() {}

  // 4 개만
  public Board(
    int postNo,
    String postTitle,
    String postContent,
    String writer
  ) {
    this.postNo = postNo;
    this.postTitle = postTitle;
    this.postContent = postContent;
    this.writer = writer;
  }
}
