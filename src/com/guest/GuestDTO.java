package com.guest;

public class GuestDTO {
	
	private String id;
	private String pwd;
	private String name;
	private String content;
	private String created;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	
	@Override
	public String toString() {
		
		String str;
		
		str=String.format("%8s %8s %8s", id,pwd,name);
		
		return str;
	}
	
	public String toString1() {
		
		String str;
		
		str=String.format("%8s %8s %8s", id,content,created);
		
		return str;
	}

}
