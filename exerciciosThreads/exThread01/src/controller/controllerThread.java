package controller;

public class controllerThread extends Thread{
	public controllerThread() {
	}
	@Override
	public void run() {
		System.out.println("TID " + getId() + "==>");
	}
}
