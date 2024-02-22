package io;

import java.io.Serializable;

// java.io.NotSerializableException: io.Person 오류 남
// 해당 클래스 타입의 객체를 ObjectInputStream, ObjectOutputStream(직렬화)로 주고 받을 수 있도록
// Serializable 인터페이스를 구현하도록 함
// public class Person implements Serializable

public class Person implements Serializable {

  private String name;
  private String job;
  private transient String tel; // transient : 직렬화 대상에서 제외

  public Person(String name, String job, String tel) {
    this.name = name;
    this.job = job;
    this.tel = tel;
  }

  @Override
  public String toString() {
    return "Person [name=" + name + ", job=" + job + ", tel=" + tel + "]";
  }
}
