package com.tyss.Threads.creatingThread;

 public class PVR {
	 synchronized	void ConfirmTicket() {
		for (int i=0;i<4;i++) {
			System.out.println(i);
			/*	try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e.getLocalizedMessage());	
				}*/
			
			
			try {
				wait(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}

 synchronized void leaveMe()
 {
	 System.out.println("Notify Called");
	 notify();
 }
 
 
 
 }
