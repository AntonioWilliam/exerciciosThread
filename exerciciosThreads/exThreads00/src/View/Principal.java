package View;

import controller.ThreadsVetor;

public class Principal {
	public static void main(String[] args) {
		int[] vetor = new int[9];
		int length = vetor.length;
		for (int i = 0; i < length; i++) {
			vetor[i] = (int) (Math.random() * 100) + 1;
		}
		for (int i = 1; i <= 2; i++) {
			Thread go = new ThreadsVetor( i, vetor);
			go.start();
		}
	}
}
