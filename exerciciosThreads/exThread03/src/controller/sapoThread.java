package controller;

import javax.swing.JOptionPane;

public class sapoThread extends Thread {
	
	static int distanciaTotal = 10; 
	static int puloMaximo =3 ; 
	static int colocacao = 0; 

	public sapoThread() {
	}

	@Override
	public void run() {

		int pulo = 0; 
		int posicao = 0;
		int c = 0; 

		while (posicao < distanciaTotal) { 

			pulo = (int) (Math.random() * puloMaximo) + 0;
			posicao += pulo; 
			c++;
			System.out.println("Sapo #" + getId() +":"+ pulo + " m" +"("+ distanciaTotal +"/"+ posicao +")");

		}
		colocacao++;
		JOptionPane.showMessageDialog(null, colocacao + "° Com " + c+ " pulos.\n" +"Sapo #" + getId() );
	
		

	}

}