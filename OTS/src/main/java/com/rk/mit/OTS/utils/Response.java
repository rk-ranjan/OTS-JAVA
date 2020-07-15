package com.rk.mit.OTS.utils;

public class Response {
  private String message;
  private Integer code;
  private Object object;
  public String getMessage() {
	return message;
  }
  public void setMessage(String message) {
	this.message = message;
  }
  public Integer getCode() {
	return code;
  }
  public void setCode(Integer code) {
	this.code = code;
  }
}
