package com.bridgelabz.employeepayrollapp.dto;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public  class ResponseDTO {
	private String messege;
	private Object data;
	
	public ResponseDTO(String string) {
		this.messege = messege;
	}
	
}
