package View;

import controller.controllerThread;

public class Principal {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			controllerThread leitura = new controllerThread();
			leitura.start();
		}

	}

}
