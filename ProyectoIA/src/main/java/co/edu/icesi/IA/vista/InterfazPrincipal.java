package co.edu.icesi.IA.vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;


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
		
		panelBanner = new PanelBanner();
		panelTablero = new PanelTablero();
		
		
		add(panelBanner, BorderLayout.NORTH);;
		
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////
	//									METODOS
	//////////////////////////////////////////////////////////////////////////////////////////////
	
	
}
