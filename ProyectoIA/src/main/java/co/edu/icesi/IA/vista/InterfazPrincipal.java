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
		
//		tablero.a�adirCelulaVida(30, 30);
//		tablero.a�adirCelulaVida(31, 30);
//		tablero.a�adirCelulaVida(32, 30);
//		
//		tablero.a�adirCelulaVida(20, 20);
//		tablero.a�adirCelulaVida(20,21);
//		tablero.a�adirCelulaVida(21, 20);
//		tablero.a�adirCelulaVida(21, 21);
//		
//		
//		tablero.a�adirCelulaVida(10, 60);
//		tablero.a�adirCelulaVida(10, 61);
//		tablero.a�adirCelulaVida(11, 62);
//		tablero.a�adirCelulaVida(11, 61);
//		tablero.a�adirCelulaVida(12, 61);
//		
//		
//		tablero.a�adirCelulaVida(tablero.getMatriz().length-1, tablero.getMatriz()[0].length-1);
//		tablero.a�adirCelulaVida(0,0);
//		
//		tablero.a�adirCelulaVida(0, tablero.getMatriz()[0].length-1);
//		tablero.a�adirCelulaVida(tablero.getMatriz().length-1, 0);		
	}
	
	//Recarga o actualiza el panel del tablero 
	public void recargarPanel() {
		panelTablero.repaint();
		panelBotones.actualizarCelulasVivas();
	}


}
