package co.edu.icesi.IA.vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import co.edu.icesi.IA.modelo.Tablero;

public class PanelTablero extends JPanel{

	
	//////////////////////////////////////////////////////////////////////////////////////////////
	//									ATRIBUTOS
	//////////////////////////////////////////////////////////////////////////////////////////////
	public final static int INICIO_X = 10;
	public final static int INICIO_Y = 10;
	public final static int ANCHO = 970;
	public final static int ALTO = 410;
	public final static int L = 10;
	
	private InterfazPrincipal principal;
	
	//////////////////////////////////////////////////////////////////////////////////////////////
	//									CONSTRUCTOR
	//////////////////////////////////////////////////////////////////////////////////////////////
	public PanelTablero(InterfazPrincipal v) {
		principal = v;
		
		setPreferredSize(new Dimension(0,450));
		setBackground(Color.GRAY);
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////
	//									METODOS
	//////////////////////////////////////////////////////////////////////////////////////////////
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		

		int[][] matriz =  principal.getTablero().getMatriz();
		int y = INICIO_Y;
		int x = INICIO_X;
		
		for (int i = 0; i < matriz.length; i++) {
			
			x = INICIO_X;
			
			for (int j = 0; j < matriz[i].length; j++) {
				
				if(matriz[i][j] == Tablero.VIVO) {
					g.setColor(Color.WHITE);
				}
				else {
					g.setColor(Color.GREEN);
				}
				g.fillRect(x, y, L, L);
				x += L;				
			}
			y += L;
		}
		
		//HORIZONTALES
		g.setColor(Color.BLACK);
		for (int i = INICIO_X; i < ALTO	+ INICIO_X; i = i + L) {
			
			g.drawLine(INICIO_X, INICIO_Y + i, INICIO_X + ANCHO, INICIO_Y + i);
			
		}
		
		//VERTICALES
		for (int i = INICIO_Y; i < ANCHO + INICIO_Y; i = i + L) {
			
			g.drawLine(INICIO_X + i, INICIO_Y, INICIO_X  + i, INICIO_Y + ALTO);
			
		}
		
		//Rectangulo contorno 
		g.setColor(Color.PINK);
		g.drawRect(INICIO_X, INICIO_Y, ANCHO, ALTO);
		
	}
	
	
}
