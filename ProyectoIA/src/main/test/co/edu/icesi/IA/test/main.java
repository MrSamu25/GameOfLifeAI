package co.edu.icesi.IA.test;

import co.edu.icesi.IA.modelo.Tablero;

public class main {

	public static Tablero tablero;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		tablero = new Tablero(6,6);
		
		mostrarMatriz(tablero.getMatriz());		
		System.out.println();		
		

		
		tablero.cambiarEstadoCelula(1, 3);
		tablero.cambiarEstadoCelula(1, 4);
		tablero.cambiarEstadoCelula(2, 4);
		tablero.cambiarEstadoCelula(3, 1);
		tablero.cambiarEstadoCelula(4, 1);
		tablero.cambiarEstadoCelula(4, 2);			
		
		mostrarMatriz(tablero.getMatriz());		
			
		for (int i = 0; i < 10; i++) {
			
			mostrarMatrizVecinos(tablero.getMatriz());
			
			tablero.siguienteEstado();
			mostrarMatriz(tablero.getMatriz());
			
		}
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
