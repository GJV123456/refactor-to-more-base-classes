package com.github.hcsp.inheritance;

public class Intitle {
  private String name;


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void log(String log) {
    System.out.println(log);
  }

  public void sayMyName() {
    System.out.println("我的名字是" + name);
  }
}
