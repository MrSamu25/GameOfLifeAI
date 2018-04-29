package co.edu.icesi.IA.vista;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

import co.edu.icesi.IA.modelo.Tablero;


public class InterfazPrincipal extends JFrame{

	public static void main(String[] args) {

		InterfazPrincipal interfazPrincipal = new InterfazPrincipal();
		interfazPrincipal.setVisible(true);
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////
	//									ATRIBUTOS
	//////////////////////////////////////////////////////////////////////////////////////////////
	private PanelBanner panelBanner;
	private PanelTablero panelTablero;
	private PanelBotones panelBotones;
	
	private Tablero tablero;
	//////////////////////////////////////////////////////////////////////////////////////////////
	//									CONSTRUCTOR
	//////////////////////////////////////////////////////////////////////////////////////////////
	public InterfazPrincipal() {
		
		setSize(new Dimension(1000,600));
		setTitle("El juego de la vida - John H. Conway");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
		setLayout(new BorderLayout());
		
		cargarConfiguracionInicial();
		
		panelBanner = new PanelBanner();
		panelTablero = new PanelTablero(this);
		panelBotones = new PanelBotones(this);
		
		
		add(panelBanner, BorderLayout.NORTH);
		add(panelTablero, BorderLayout.CENTER);
		add(panelBotones, BorderLayout.SOUTH);
	}

	
	//////////////////////////////////////////////////////////////////////////////////////////////
	//									METODOS
	//////////////////////////////////////////////////////////////////////////////////////////////
	
	public Tablero getTablero() {
		return tablero;
	}
	public void setTablero(Tablero tablero) {
		this.tablero = tablero;
	}
	
	public void cargarConfiguracionInicial() {
		
		tablero = new Tablero( (PanelTablero.ALTO)/PanelTablero.L, (PanelTablero.ANCHO) / PanelTablero.L );	
		
		tablero.generarEstado();
		tablero.getCelulasVivas();
		
//		tablero.aņadirCelulaVida(30, 30);
//		tablero.aņadirCelulaVida(31, 30);
//		tablero.aņadirCelulaVida(32, 30);
//		
//		tablero.aņadirCelulaVida(20, 20);
//		tablero.aņadirCelulaVida(20,21);
//		tablero.aņadirCelulaVida(21, 20);
//		tablero.aņadirCelulaVida(21, 21);
//		
//		
//		tablero.aņadirCelulaVida(10, 60);
//		tablero.aņadirCelulaVida(10, 61);
//		tablero.aņadirCelulaVida(11, 62);
//		tablero.aņadirCelulaVida(11, 61);
//		tablero.aņadirCelulaVida(12, 61);
//		
//		
//		tablero.aņadirCelulaVida(tablero.getMatriz().length-1, tablero.getMatriz()[0].length-1);
//		tablero.aņadirCelulaVida(0,0);
//		
//		tablero.aņadirCelulaVida(0, tablero.getMatriz()[0].length-1);
//		tablero.aņadirCelulaVida(tablero.getMatriz().length-1, 0);		
	}
	
	//Recarga o actualiza el panel del tablero 
	public void recargarPanel() {
		panelTablero.repaint();
		panelBotones.actualizarCelulasVivas();
	}


}
