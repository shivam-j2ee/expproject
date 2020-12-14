package com.ncs.WebClient1.ctl;

public class UserDTO {
	
	
	private int id;
	private String studentName;
	
	
	public UserDTO() {
		
	}
	
	
	public UserDTO(int id, String studentName) {
		super();
		this.id = id;
		this.studentName = studentName;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	

}
