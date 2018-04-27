package co.edu.icesi.IA.modelo;

public class Tablero {
	
	//---------------------------------------------------------------------------------------
	//									CONSTANTES
	//---------------------------------------------------------------------------------------
	
	public final static int VIVO = 1;
	public final static int MUERTO = 0;

	//---------------------------------------------------------------------------------------
	//									ATRIBUTOS
	//---------------------------------------------------------------------------------------
	
	private int[][] matriz;
	
	
	//---------------------------------------------------------------------------------------
	//									CONSTRUCTOR
	//---------------------------------------------------------------------------------------

	public Tablero(int n,int m) {
		matriz = new int[n][m];
	}
	
	
	//---------------------------------------------------------------------------------------
	//									MÉTODOS
	//---------------------------------------------------------------------------------------
	
	public void siguienteEstado() {
		
		int vecinos = 0;
		int[][] nuevaMatriz = matriz;
		
		
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[i].length; j++) {
				
				vecinos = darVecinos(i, j);
				
				if(matriz[i][j] == MUERTO && vecinos == 3) {
					
					nuevaMatriz[i][j] = VIVO;
				}
				
				else if(matriz[i][j] == VIVO) {
					
					if(vecinos == 2 || vecinos == 3) {
						nuevaMatriz[i][j] = VIVO;
					}
					else {
						nuevaMatriz[i][j] = MUERTO;
					}
				}				
			}			
		}
		
		matriz = nuevaMatriz;
		
	}
	
	//Retorna el numero de vecinos que tiene una celula en la ubicación de la matriz i,j
	//Retorna -1 cuando no existe esa ubicación en el tablero
	public int darVecinos(int i, int j) {
		
		//TODO dar vecinos
		
		int vecinos = 0;
		
		if(verificarIndiceAfuera(i, j)) {
			vecinos = -1;
		}

		else {
			
			if(!verificarIndiceAfuera(i-1, j)) {
				vecinos += matriz[i-1][j];
			}			
			
			if(!verificarIndiceAfuera(i-1, j+1)) {
				vecinos += matriz[i-1][j+1];
			}
			
			if(!verificarIndiceAfuera(i, j+1)) {
				vecinos += matriz[i][j+1];
			}
			
			if(!verificarIndiceAfuera(i+1, j+1)) {
				vecinos += matriz[i+1][j+1];
			}
			
			if(!verificarIndiceAfuera(i+1, j)) {
				vecinos += matriz[i+1][j];
			}
			
			if(!verificarIndiceAfuera(i+1, j-1)) {
				vecinos += matriz[i+1][j-1];
			}
			
			if(!verificarIndiceAfuera(i, j-1)) {
				vecinos += matriz[i][j-1];
			}
			
			if(!verificarIndiceAfuera(i-1, j-1)) {
				vecinos += matriz[i-1][j-1];
			}			
			
		}		
		
		return vecinos;
	}
	
	//Añade una celula viva en la posición (i,j)
	public void añadirCelulaVida(int i, int j) {
		matriz[i][j] = VIVO;
	}
	
	
	//Retorna el numero de celulas vivas que se encuentran en el tablero
	public int totalCelulasVivas() {
		int total = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] == VIVO) {
					total++;
				}
			}			
		}		
		
		return total;
	}	
	
	private boolean verificarIndiceAfuera(int i, int j) {
		
		boolean afuera = false;
		
		if(i<0 || i>=matriz.length || j<0 || j>=matriz[0].length) {
			afuera = true;
		}
		return afuera;
	}
	
	
	public int[][] getMatriz() {
		return matriz;
	}


	public void setMatriz(int[][] matriz) {
		this.matriz = matriz;
	}
	
	
}
