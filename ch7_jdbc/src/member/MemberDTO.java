package member;

// memberTBL 컬럼과 일치시킴
public class MemberDTO {

  private String userId;
  private String password;
  private String name;
  private String email;

  public MemberDTO() {}

  public MemberDTO(String userId, String password, String name, String email) {
    this.userId = userId;
    this.password = password;
    this.name = name;
    this.email = email;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return (
      "MemberDTO [userId=" +
      userId +
      ", password=" +
      password +
      ", name=" +
      name +
      ", email=" +
      email +
      "]"
    );
  }
}
