package co.edu.icesi.IA.vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import co.edu.icesi.IA.modelo.Tablero;

public class PanelTablero extends JPanel implements MouseListener{

	
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
		//Por esto no me funcionaba, que estupides
		this.addMouseListener(this);
		
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
					g.setColor(Color.GRAY);
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
	
	//Se agrega una celula en la ubicacion correspondiente en la que se hizo click en el tablero
	public void agregarCelula(int posX, int posY) {	
		int xFinalMatriz = this.encontrarPosicionFinalX(posX);
		int yFinalMatriz = this.encontrarPosicionFinalY(posY);
		principal.getTablero().añadirCelulaVida(yFinalMatriz, xFinalMatriz);
		principal.recargarPanel();
		
	}
	
	//Encuentra la posicion en X de la matriz que corresponde a la ubicacion que hizo click en el tablero
	public int encontrarPosicionFinalX(int posX) {
		int xFinalMatriz = -1;
		
		int contador = 0;
		boolean encontro = false;
		
		for (int i = INICIO_X; (i < INICIO_X + ANCHO) && !encontro; i=i+L) {
			if(i<posX) {
				contador++;
			}
			else {
				encontro = true;
			}		
		}		
		xFinalMatriz = contador-1;
		//System.out.println("xFinalMatriz " + xFinalMatriz);		
		return xFinalMatriz;
	}
	
	//Encuentra la posicion en Y de la matriz que corresponde a la ubicacion que hizo click en el tablero
	public int encontrarPosicionFinalY(int posY) {
		int yFinalMatriz = -1;
		
		int contador = 0;
		boolean encontro = false;
		
		for (int i = INICIO_Y; (i < INICIO_Y + ALTO) && !encontro; i=i+L) {
			if(i<posY) {
				contador++;
			}
			else {
				encontro = true;
			}		
		}		
		yFinalMatriz = contador-1;
		//System.out.println("yFinalMatriz " + yFinalMatriz);		
		return yFinalMatriz;
	}
	

	//Al final de presionar click en el tablero se activa este metodo
	@Override
	public void mouseClicked(MouseEvent e) {
		agregarCelula(e.getX(), e.getY());		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
