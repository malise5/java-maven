package com.systechafrica.collections.genericslist;

public class Students {
  private Integer id;
  private String name;
  private String regNo;
  private String email;

  public Students() {
  }

  public Students(String name, String regNo, String email) {
    this.name = name;
    this.regNo = regNo;
    this.email = email;
  }

  public Students(Integer id, String name, String regNo, String email) {
    this.id = id;
    this.name = name;
    this.regNo = regNo;
    this.email = email;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getRegNo() {
    return regNo;
  }

  public void setRegNo(String regNo) {
    this.regNo = regNo;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return "Students [id=" + id + ", name=" + name + ", regNo=" + regNo + ", email=" + email + "]";
  }

}
