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
	private int celulasVivas;
	
	
	//---------------------------------------------------------------------------------------
	//									CONSTRUCTOR
	//---------------------------------------------------------------------------------------

	public Tablero(int n,int m) {
		matriz = new int[n][m];
		celulasVivas = 0;
	}
	
	
	//---------------------------------------------------------------------------------------
	//									MÉTODOS
	//---------------------------------------------------------------------------------------
	
	
	//Calcula el siguiente estado del tablero de acuerdo a las reglas del juego de Conway
	// 1. Si una celula esta muerta, vive al sgt turno por reproduccion si tiene exactamente 3 celulas vecinas vivas 
	// 2. Si una celula esta viva, sigue viviendo si tiene 2 0 3 vecinos, en caso contrario muere por soledad o sobrepoblacion
	//Como se hace un recorrido total de la matriz, se aprovecha para calcular el # total de celulas vivas
	public void siguienteEstado() {
		
		int vecinos = 0;
		celulasVivas = 0;
		
		int[][] nuevaMatriz = new int[matriz.length][matriz[0].length];
		
		//Todo está malo
		
		
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[i].length; j++) {
				
				vecinos = darVecinos(i, j);
				
				if(matriz[i][j] == MUERTO) {
					
					if(vecinos == 3) {
						nuevaMatriz[i][j] = VIVO;
						celulasVivas++;
					}
					else {
						nuevaMatriz[i][j] = MUERTO;
					}
				}
				
				else if(matriz[i][j] == VIVO) {
					
					if(vecinos == 2 || vecinos == 3) {
						nuevaMatriz[i][j] = VIVO;
						celulasVivas++;
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
	
	public void generarEstado() {
		int numero;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				numero = (int) (Math.random()*10) + 1;
				if(numero < 2)
					añadirCelulaVida(i, j);
			}
		}
	}
	
	//Añade una celula viva en la posición (i,j)
	public void añadirCelulaVida(int i, int j) {
		matriz[i][j] = VIVO;
		celulasVivas++;
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


	public int getCelulasVivas() {
		return celulasVivas;
	}


	public void setCelulasVivas(int celulasVivas) {
		this.celulasVivas = celulasVivas;
	}
	
}
