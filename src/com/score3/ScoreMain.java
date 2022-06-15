package com.score3;

public class ScoreMain {

	public static void main(String[] args) {

		Score ob = new ScoreImpl();
		
		ob.set();
		ob.input();
		ob.print();

		Score ob1 = new Score() {
			
			@Override
			public void set() {
			}
			
			@Override
			public void print() {
			}
			
			@Override
			public void input() {
			}
		};
	}

}
