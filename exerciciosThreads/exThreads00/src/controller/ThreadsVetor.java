package controller;

//import javax.swing.JOptionPane;

public class ThreadsVetor extends Thread {
	private int num;

	private int[] vetor;

	public ThreadsVetor(int num, int[] vetor) {
		this.num = num;
		this.vetor = vetor;
	}

	@Override
	public void run() {
		//num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		//int length = vetor.length;
		if (num % 2 == 0) {
			double Ti = System.nanoTime();
			for (int i = 0; i < vetor.length; i++) {
				System.out.println("Posição: " + i + " = " + vetor[i]);
			}
			double Tf = System.nanoTime();
			double Tt = Tf - Ti;
			Tt = Tt / Math.pow(10, 9);
			System.out.println(" #for " + "tempo final foi de :" + Tt + ".s");

		} else if (num % 2 != 0) {
				double Ti = System.nanoTime();
				for (int vet : vetor) {
					System.out.println("Vetor: " + " = " + vet);
				}
				double Tf = System.nanoTime();
				double Tt = Tf - Ti;
				Tt = Tt / Math.pow(10, 9);
				System.out.println("#foreach " + " tempo final foi de :" + Tt + ".s".trim());
		
			}
		}
	}

