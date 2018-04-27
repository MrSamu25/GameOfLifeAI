package co.edu.icesi.IA.test;

import co.edu.icesi.IA.modelo.Tablero;

public class main {

	public static Tablero tablero;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		tablero = new Tablero(5,5);
		
		mostrarMatriz(tablero.getMatriz());		
		System.out.println();		
		
		tablero.a�adirCelulaVida(2, 1);
		tablero.a�adirCelulaVida(2, 2);
		tablero.a�adirCelulaVida(2, 3);	
				
		mostrarMatriz(tablero.getMatriz());		
			
		
		mostrarMatrizVecinos(tablero.getMatriz());
		
		tablero.siguienteEstado();
		mostrarMatriz(tablero.getMatriz());

		
	}
	
	
	
	public static void mostrarMatriz(int[][] matriz) {
		
		for (int i = 0; i < matriz.length; i++) {
			String tmp = "";	
			for (int j = 0; j < matriz[i].length; j++) {
				tmp += matriz[i][j] + " ";				
			}
			System.out.println(tmp);
		}
		System.out.println();	
	}
	
	public static void mostrarMatrizVecinos(int[][] matriz) {
		
		for (int i = 0; i < matriz.length; i++) {
			String tmp = "";
			for (int j = 0; j < matriz[i].length; j++) {
				tmp += tablero.darVecinos(i, j) + " ";				
			}
			System.out.println(tmp);
		}
		System.out.println();	
	}
	

}
