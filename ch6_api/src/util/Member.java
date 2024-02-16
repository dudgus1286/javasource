package util;

import java.util.Objects; // Object != Objects

public class Member {

  private String id;
  private String name;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Member [id=" + id + ", name=" + name + "]";
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Member) {
      Member member = (Member) obj;
      return this.name.equals(member.name) && this.id.equals(member.id);
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id); // id와 name이 똑같으면 같은 것으로 보겠다고 선언
  }
}
