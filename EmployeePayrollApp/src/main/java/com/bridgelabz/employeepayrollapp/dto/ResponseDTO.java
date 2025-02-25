package com.bridgelabz.employeepayrollapp.dto;

public class ResponseDTO {

	private String messege;
	private Object data;
	
  public ResponseDTO(String messege, Object data){
	  this.messege = messege;
	  this.data = data;
  }
  
  public ResponseDTO(String messege) {
	this.messege = messege;
}

public String getMessege() {
	  return messege;
  }
  public void setMessege(String messege) {
	 this.messege = messege;
  }
  
  public Object getData() {
	  return data;
  }
  
  public void setData(Object data) {
	  this.data = data;
  }
}
