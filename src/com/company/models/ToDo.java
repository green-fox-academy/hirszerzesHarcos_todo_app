package com.company.models;

public class ToDo {
  protected boolean isDone;
  protected String title;

  public ToDo(String title) {
    this.title = title;
  }

  public void setDone() {
    this.isDone = true;
  }

  public Boolean isDone() {
    return this.isDone;
  }

  public String getTitle() {
    return this.title;
  }

  @Override
  public String toString() {
    String signDone = (isDone) ? "x" : " ";
    return "[" + signDone + "] " + title;
  }
}
