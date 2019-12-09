package com.tyss.Threads.creatingThread;

public class TestPVR {
	public static void main(String[] args) {
		System.out.println("Main Started");;
		PVR p=new PVR();
		User u1=new User(p);
		u1.start();
        
		p.leaveMe();
		System.out.println("Main Ended");
	}
}
