package View;

import controller.matrizThread;

public class Main {

	public static void main(String[] args) {
		int[][] matriz = new int[3][5];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				matriz[i][j] = (int) (Math.random() * 10) + 1;
			}
		}
		for (int p = 0; p < 3; p++) {
			Thread threads = new matrizThread(p, matriz);
			threads.start();
		}
	}

}
