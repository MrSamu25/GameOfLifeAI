package co.edu.icesi.IA.modelo;

public class Tablero {
	
	//---------------------------------------------------------------------------------------
	//									CONSTANTES
	//---------------------------------------------------------------------------------------
	
	public final static int VIVO = 1;
	public final static int MUERTO = 0;
	public final static String[] NOMBRE_PATRONES = {"Aleatorio", "Glider", "Lightweight Spaceship", "Forma Creciente", "Cañon Deslizadores", "Quinto", "Sexto"};
	
	
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
	
	//Genera un estado en el tablero aleatorio
	public void generarEstado(String patron) {
		
		//Patrón Aleatorio
		if(patron.equals(NOMBRE_PATRONES[0])) {
			this.generarPatronAleatorio();
		}
		//Patrón Glider
		if(patron.equals(NOMBRE_PATRONES[1])) {
			this.generarPatronGlider();
		}
		//Patrón Lightweight Spaceship
		if(patron.equals(NOMBRE_PATRONES[2])) {
			this.generarPatronLightweightSpaceship();
		}
		//Patrón Forma Creciente
		if(patron.equals(NOMBRE_PATRONES[3])) {
			this.generarPatronFormaCreciente();
		}
		//Patrón Forma Creciente
		if(patron.equals(NOMBRE_PATRONES[4])) {
			this.generarPatronCanonDeslizadores();
		}

	}
	
	
	//Genera el patrón aleatorio
	private void generarPatronAleatorio() {
		int numero;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				numero = (int) (Math.random()*10) + 1;
				if(numero < 2) {
					//el tablero esta vacio, siempre agrega una celula
					cambiarEstadoCelula(i, j);
				}						
			}
		}
	}
	
	////Genera el patrón Glider
	private void generarPatronGlider() {
		matriz[2][2] = VIVO;
		matriz[3][3] = VIVO;
		matriz[3][4] = VIVO;
		matriz[4][2] = VIVO;
		matriz[4][3] = VIVO;
		celulasVivas = 5;
	}
	
	//Genera el patrón Lightweight Spaceship
	private void generarPatronLightweightSpaceship() {
		matriz[20][4] = VIVO;
		matriz[20][5] = VIVO;
		matriz[21][3] = VIVO;
		matriz[21][4] = VIVO;
		matriz[21][5] = VIVO;
		matriz[21][6] = VIVO;
		matriz[22][3] = VIVO;
		matriz[22][4] = VIVO;
		matriz[22][7] = VIVO;
		matriz[22][6] = VIVO;
		matriz[23][5] = VIVO;
		matriz[23][6] = VIVO;
		celulasVivas = 12;
	}
	//Generar el patrón Forma Creciente
	private void generarPatronFormaCreciente() {
		matriz[18][43] = VIVO;
		matriz[18][44] = VIVO;
		matriz[18][45] = VIVO;
		matriz[18][47] = VIVO;
		matriz[19][43] = VIVO;
		matriz[20][46] = VIVO;
		matriz[20][47] = VIVO;
		matriz[21][44] = VIVO;
		matriz[21][45] = VIVO;
		matriz[21][47] = VIVO;
		matriz[22][43] = VIVO;
		matriz[22][45] = VIVO;
		matriz[22][47] = VIVO;
		celulasVivas = 13;
	}
	
	//Genera el patrón Cañon Deslizadores
	private void generarPatronCanonDeslizadores() {
		matriz[15][30] = VIVO;
		matriz[16][29] = VIVO;
		matriz[16][30] = VIVO;
		
		matriz[12][42] = VIVO;
		matriz[12][41] = VIVO;
		matriz[13][40] = VIVO;
		matriz[14][39] = VIVO;
		matriz[15][39] = VIVO;
		matriz[16][39] = VIVO;
		matriz[17][40] = VIVO;
		matriz[18][41] = VIVO;
		matriz[18][42] = VIVO;
		
		matriz[15][52] = VIVO;
		matriz[15][53] = VIVO;
		matriz[14][53] = VIVO;
		
		matriz[19][52] = VIVO;
		matriz[19][53] = VIVO;
		matriz[20][53] = VIVO;
		
		matriz[16][55] = VIVO;
		matriz[16][56] = VIVO;
		matriz[17][55] = VIVO;
		matriz[17][56] = VIVO;
		matriz[18][55] = VIVO;
		matriz[18][56] = VIVO;
		
		matriz[17][57] = VIVO;

		matriz[17][64] = VIVO;
		matriz[18][64] = VIVO;
		matriz[18][63] = VIVO;
		
	}
	
	
	
	//Añade una celula viva en la posición (i,j)
	public void cambiarEstadoCelula(int i, int j) {
		
		if(matriz[i][j] == MUERTO) {
			matriz[i][j] = VIVO;
			celulasVivas++;
		}
		else {
			matriz[i][j] = MUERTO;
			celulasVivas--;
		}
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
