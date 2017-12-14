package com.multithreading;

public class LockAndSync {
	public static void main(String[] args) {
		TestClass obj = new TestClass();
		Runnable t1 = new Runnable() {			
			@Override
			public void run() {
				obj.loop();
				
			}
		};
		Runnable t2 = new Runnable() {			
			@Override
			public void run() {
				TestClass.loop2();
				
			}
		};
		Task tt1 = new Task(t1);
		Task tt2 = new Task(t2);
		tt1.start();
		tt2.start();
		
	}
}

class TestClass{
	public synchronized void loop(){
		for(int i=0;i<=1000;i++){
			System.out.print("w");			
		}
	}
	
	public static synchronized void loop2(){
		for(int i=0;i<40;i++){
			System.out.println("m");
		}
	}
}
