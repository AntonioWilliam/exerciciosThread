package controller;

public class matrizThread extends Thread {
	int n;
	int[][] matriz;

	public matrizThread(int n, int[][] matriz) {
		this.n = n;
		this.matriz = matriz;
	}

	@Override
	public void run() {
		int[] soma = new int[3];

		for (int cont = 0; cont < 5; cont++) {
			soma[n] += matriz[n][cont];
		}

		System.out.println("linha " + (n + 1) + ": " + soma[n]);

	}
}
