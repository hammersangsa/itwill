package com.day12;
//selection sort를 추상메소드로 분해
abstract class SortInt{
	
	private int[] value;
	
	protected abstract void sorting();//추상메소드
	
	public void sort(int[] value) {
		this.value = value;
		
		sorting();
	}
	
	public int length() {
		
		if(value==null) {
			return 0;
		}
		
		return value.length;
	}
	
	protected final int compare(int i, int j) {
		
		if(value[i]==value[j]) {
			return 0;
		}else if(value[i]>value[j]) {//필요한 부분 [i]>[j]
			return 1;
		}else {
			return -1;
		}
	}
	
	protected final void swap(int i, int j) {
		
		int temp;
		temp = value[i];
		value[i] = value[j];
		value[j] = temp;
	}
	
	public void print() {
		
		if(value==null) {
			return;
		}
		
		for(int su : value) {
			System.out.printf("%4d",su);
		}
		System.out.println();
	}
	
	
}

class SortTest extends SortInt{
	@Override
	protected void sorting() {
		//selection sort
		for(int i=0;i<length()-1;i++) {
			for(int j=i+1;j<length();j++) {
				
				if(compare(i, j)>0) {//돌아온 값이 0보다 클 때 움직인다.
				
					swap(i, j);
				}
		
			}
		}
	}	
	
}

public class Test8 {

	public static void main(String[] args) {

		SortTest ob = new SortTest();
		
		int[] value = {50,30,10,70,20};
		
		ob.sort(value);
		ob.print();
	}

}
//부모클래스의 sort메소드에서 sorting을 자식 sorting을 쓴 이유는
// Override가 되어 부모클래스의 sorting메소드가 아닌 자식 sorting메소드를 실행했기 떄문
