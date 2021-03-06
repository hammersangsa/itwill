package com.day20;

import java.io.Serializable;

public class FileInfo implements Serializable{

	private static final long serialVersionUID = 1L;

	
	//code
	//100 : 파일전송시작(파일명 전송)
	//110 : 파일내용전송
	//200 : 파일전송종료(파일명 전송
	//size  : 전송길이
	//data : 전송내용
	
	private int code;
	private int size;
	private byte[] data = new byte[1024];
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public byte[] getData() {
		return data;
	}
	public void setData(byte[] data) {
		this.data = data;
	}
	
}
