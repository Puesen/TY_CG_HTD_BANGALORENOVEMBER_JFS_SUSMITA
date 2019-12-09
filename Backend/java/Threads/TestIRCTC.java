package com.tyss.Threads.creatingThread;

public class TestIRCTC {
	public static void main(String[] args) {
		System.out.println("Main Started");;
		IRCTC i1=new IRCTC();
	
		User1 u1=new User1( i1);
		u1.start();	
		User1 u2=new User1(i1);
		u2.start();
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		i1.leaveMe();
		System.out.println("Main Ended");
	}

}
