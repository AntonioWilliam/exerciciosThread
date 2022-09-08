package View;

import controller.sapoThread;

public class Main {

	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) { 
			sapoThread race = new sapoThread();
			race.start();
		}

	}

}