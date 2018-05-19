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
		
		//Patrón aleatorio
		cargarConfiguracionTablero(Tablero.NOMBRE_PATRONES[0]);
		
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
	
	//Establere una configuración de celulas en el tablero de acuerdo al patrón por parametro
	public void cargarConfiguracionTablero(String patron) {		
		tablero = new Tablero( (PanelTablero.ALTO)/PanelTablero.L, (PanelTablero.ANCHO) / PanelTablero.L );	
		tablero.generarEstado(patron);
		if(panelTablero != null) {
			recargarPanel();
		}
	}
	
	//Recarga o actualiza el panel del tablero 
	public void recargarPanel() {
		panelTablero.repaint();
		panelBotones.actualizarCelulasVivas();
	}


}
