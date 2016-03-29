package com.moon.chap1;

class Caculator implements Runnable{

	private int number;
	
	public Caculator(int number){
		this.number = number;
	}
	
	@Override
	public void run() {
		for(int i=0;i<=10;i++){
			System.out.printf("%s: %d * %d = %d\n",Thread.currentThread().getName(),number,i,i*number);
		}
	}
}

public class SimpleCaculator {
	public static void main(String[] args) {
		for(int i=0;i<=10;i++){
			Caculator cal = new Caculator(i);
			Thread th = new Thread(cal);
			th.start();
		}
	}
}
