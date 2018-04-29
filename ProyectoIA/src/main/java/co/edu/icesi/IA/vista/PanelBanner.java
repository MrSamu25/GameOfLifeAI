package co.edu.icesi.IA.vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;


public class PanelBanner extends JPanel{

	
	//////////////////////////////////////////////////////////////////////////////////////////////
	//									ATRIBUTOS
	//////////////////////////////////////////////////////////////////////////////////////////////
	public final static int ANCHO = 10;
	public final static int INICIO_X = 100;
	public final static int INICIO_Y = 30;
	
	
	//////////////////////////////////////////////////////////////////////////////////////////////
	//									CONSTRUCTOR
	//////////////////////////////////////////////////////////////////////////////////////////////
	public PanelBanner() {
		setPreferredSize(new Dimension(0,100));		
		setBackground(Color.LIGHT_GRAY);
		
	}
	//////////////////////////////////////////////////////////////////////////////////////////////
	//									METODOS
	//////////////////////////////////////////////////////////////////////////////////////////////
	
	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		
		//C	
		g.setColor(Color.RED);
		g.fillRect(INICIO_X, INICIO_Y, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO, INICIO_Y, ANCHO, ANCHO);
		g.fillRect(INICIO_X - ANCHO, INICIO_Y + ANCHO, ANCHO, ANCHO);
		g.fillRect(INICIO_X - ANCHO, INICIO_Y + ANCHO + ANCHO, ANCHO, ANCHO);
		g.fillRect(INICIO_X - ANCHO, INICIO_Y + ANCHO + ANCHO + ANCHO, ANCHO, ANCHO);
		g.fillRect(INICIO_X, INICIO_Y + ANCHO + ANCHO + ANCHO + ANCHO, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO, INICIO_Y + ANCHO + ANCHO + ANCHO + ANCHO, ANCHO, ANCHO);
		//O
	
		g.fillRect(INICIO_X + ANCHO*4, INICIO_Y, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*5, INICIO_Y, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*6, INICIO_Y + ANCHO, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*6, INICIO_Y + ANCHO*2, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*6, INICIO_Y + ANCHO*3, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*3, INICIO_Y + ANCHO, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*3, INICIO_Y + ANCHO*2, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*3, INICIO_Y + ANCHO*3, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*4, INICIO_Y + ANCHO*4, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*5, INICIO_Y + ANCHO*4, ANCHO, ANCHO);
		//N

		g.fillRect(INICIO_X + ANCHO*8, INICIO_Y, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*8, INICIO_Y + ANCHO, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*8, INICIO_Y + ANCHO*2, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*8, INICIO_Y + ANCHO*3, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*8, INICIO_Y + ANCHO*4, ANCHO, ANCHO);
		
		g.fillRect(INICIO_X + ANCHO*8 + ANCHO, INICIO_Y + ANCHO, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*8 + ANCHO*2, INICIO_Y + ANCHO*2, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*8 + ANCHO*3, INICIO_Y + ANCHO*3, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*8 + ANCHO*4, INICIO_Y + ANCHO*4, ANCHO, ANCHO);
		
		g.fillRect(INICIO_X + ANCHO*8 + ANCHO*4, INICIO_Y + ANCHO*3, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*8 + ANCHO*4, INICIO_Y + ANCHO*2, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*8 + ANCHO*4, INICIO_Y + ANCHO, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*8 + ANCHO*4, INICIO_Y, ANCHO, ANCHO);
		//W

		g.fillRect(INICIO_X + ANCHO*10 + ANCHO*4, INICIO_Y, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*10 + ANCHO*4, INICIO_Y + ANCHO, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*10 + ANCHO*4, INICIO_Y + ANCHO*2, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*10 + ANCHO*4, INICIO_Y + ANCHO*3, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*10 + ANCHO*4, INICIO_Y + ANCHO*4, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*11 + ANCHO*4, INICIO_Y + ANCHO*4, ANCHO, ANCHO);
		
		g.fillRect(INICIO_X + ANCHO*12 + ANCHO*4, INICIO_Y + ANCHO*3, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*12+ ANCHO*4, INICIO_Y + ANCHO*2, ANCHO, ANCHO);
		
		g.fillRect(INICIO_X + ANCHO*13 + ANCHO*4, INICIO_Y + ANCHO*4, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*14 + ANCHO*4, INICIO_Y + ANCHO*4, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*14 + ANCHO*4, INICIO_Y + ANCHO*3, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*14 + ANCHO*4, INICIO_Y + ANCHO*2, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*14 + ANCHO*4, INICIO_Y + ANCHO, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*14 + ANCHO*4, INICIO_Y, ANCHO, ANCHO);
		//A

		g.fillRect(INICIO_X + ANCHO*16 + ANCHO*4, INICIO_Y, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*16 + ANCHO*4, INICIO_Y + ANCHO, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*16 + ANCHO*4, INICIO_Y + ANCHO*2, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*16 + ANCHO*4, INICIO_Y + ANCHO*3, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*16 + ANCHO*4, INICIO_Y + ANCHO*4, ANCHO, ANCHO);
		
		g.fillRect(INICIO_X + ANCHO*17 + ANCHO*4, INICIO_Y, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*17 + ANCHO*4, INICIO_Y + ANCHO*2, ANCHO, ANCHO);
		
		g.fillRect(INICIO_X + ANCHO*18 + ANCHO*4, INICIO_Y, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*18 + ANCHO*4, INICIO_Y + ANCHO, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*18 + ANCHO*4, INICIO_Y + ANCHO*2, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*18 + ANCHO*4, INICIO_Y + ANCHO*3, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*18 + ANCHO*4, INICIO_Y + ANCHO*4, ANCHO, ANCHO);
		//Y
		
		g.fillRect(INICIO_X + ANCHO*20 + ANCHO*4, INICIO_Y, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*20 + ANCHO*4, INICIO_Y + ANCHO, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*20 + ANCHO*4, INICIO_Y + ANCHO*2, ANCHO, ANCHO);
		
		g.fillRect(INICIO_X + ANCHO*21 + ANCHO*4, INICIO_Y + ANCHO*2, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*21 + ANCHO*4, INICIO_Y + ANCHO*3, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*21 + ANCHO*4, INICIO_Y + ANCHO*4, ANCHO, ANCHO);
		
		g.fillRect(INICIO_X + ANCHO*22 + ANCHO*4, INICIO_Y, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*22 + ANCHO*4, INICIO_Y + ANCHO, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*22 + ANCHO*4, INICIO_Y + ANCHO*2, ANCHO, ANCHO);
		//'
	
		g.fillRect(INICIO_X + ANCHO*24 + ANCHO*4, INICIO_Y, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*24 + ANCHO*4, INICIO_Y + ANCHO, ANCHO, ANCHO);
		
		//S
	
		g.fillRect(INICIO_X + ANCHO*26 + ANCHO*4, INICIO_Y, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*26 + ANCHO*4, INICIO_Y + ANCHO, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*26 + ANCHO*4, INICIO_Y + ANCHO*2, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*27 + ANCHO*4, INICIO_Y + ANCHO*2, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*28 + ANCHO*4, INICIO_Y + ANCHO*2, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*28 + ANCHO*4, INICIO_Y + ANCHO*3, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*28 + ANCHO*4, INICIO_Y + ANCHO*4, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*27 + ANCHO*4, INICIO_Y + ANCHO*4, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*26 + ANCHO*4, INICIO_Y + ANCHO*4, ANCHO, ANCHO);
		
		g.fillRect(INICIO_X + ANCHO*27 + ANCHO*4, INICIO_Y, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*28 + ANCHO*4, INICIO_Y, ANCHO, ANCHO);
		
		//G
	
		g.fillRect(INICIO_X + ANCHO*33 + ANCHO*4, INICIO_Y, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*34 + ANCHO*4, INICIO_Y, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*35 + ANCHO*4, INICIO_Y, ANCHO, ANCHO);
		
		g.fillRect(INICIO_X + ANCHO*32 + ANCHO*4, INICIO_Y, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*32 + ANCHO*4, INICIO_Y + ANCHO, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*32 + ANCHO*4, INICIO_Y + ANCHO*2, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*32 + ANCHO*4, INICIO_Y + ANCHO*3, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*32 + ANCHO*4, INICIO_Y + ANCHO*4, ANCHO, ANCHO);
		
		g.fillRect(INICIO_X + ANCHO*33 + ANCHO*4, INICIO_Y + ANCHO*4, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*34 + ANCHO*4, INICIO_Y + ANCHO*4, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*35 + ANCHO*4, INICIO_Y + ANCHO*4, ANCHO, ANCHO);
		
		g.fillRect(INICIO_X + ANCHO*35 + ANCHO*4, INICIO_Y + ANCHO*3, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*35 + ANCHO*4, INICIO_Y + ANCHO*2, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*34 + ANCHO*4, INICIO_Y + ANCHO*2, ANCHO, ANCHO);
		
		//A
		g.fillRect(INICIO_X + ANCHO*37 + ANCHO*4, INICIO_Y, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*37 + ANCHO*4, INICIO_Y + ANCHO, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*37 + ANCHO*4, INICIO_Y + ANCHO*2, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*37 + ANCHO*4, INICIO_Y + ANCHO*3, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*37 + ANCHO*4, INICIO_Y + ANCHO*4, ANCHO, ANCHO);
		
		g.fillRect(INICIO_X + ANCHO*38 + ANCHO*4, INICIO_Y, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*38 + ANCHO*4, INICIO_Y + ANCHO*2, ANCHO, ANCHO);
		
		g.fillRect(INICIO_X + ANCHO*39 + ANCHO*4, INICIO_Y, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*39 + ANCHO*4, INICIO_Y + ANCHO, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*39 + ANCHO*4, INICIO_Y + ANCHO*2, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*39 + ANCHO*4, INICIO_Y + ANCHO*3, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*39 + ANCHO*4, INICIO_Y + ANCHO*4, ANCHO, ANCHO);
		
		//M
		g.fillRect(INICIO_X + ANCHO*41 + ANCHO*4, INICIO_Y, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*41 + ANCHO*4, INICIO_Y + ANCHO, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*41 + ANCHO*4, INICIO_Y + ANCHO*2, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*41 + ANCHO*4, INICIO_Y + ANCHO*3, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*41 + ANCHO*4, INICIO_Y + ANCHO*4, ANCHO, ANCHO);
		
		g.fillRect(INICIO_X + ANCHO*42 + ANCHO*4, INICIO_Y, ANCHO, ANCHO);
		
		g.fillRect(INICIO_X + ANCHO*43 + ANCHO*4, INICIO_Y + ANCHO, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*43 + ANCHO*4, INICIO_Y + ANCHO*2, ANCHO, ANCHO);
		
		g.fillRect(INICIO_X + ANCHO*44 + ANCHO*4, INICIO_Y, ANCHO, ANCHO);
		
		g.fillRect(INICIO_X + ANCHO*45 + ANCHO*4, INICIO_Y, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*45 + ANCHO*4, INICIO_Y + ANCHO, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*45 + ANCHO*4, INICIO_Y + ANCHO*2, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*45 + ANCHO*4, INICIO_Y + ANCHO*3, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*45 + ANCHO*4, INICIO_Y + ANCHO*4, ANCHO, ANCHO);
		
		//E
		g.fillRect(INICIO_X + ANCHO*47 + ANCHO*4, INICIO_Y, ANCHO, ANCHO*5);
		g.fillRect(INICIO_X + ANCHO*47 + ANCHO*4, INICIO_Y, ANCHO*3, ANCHO);		
		g.fillRect(INICIO_X + ANCHO*47 + ANCHO*4, INICIO_Y + ANCHO*2, ANCHO*3, ANCHO);
		g.fillRect(INICIO_X + ANCHO*47 + ANCHO*4, INICIO_Y + ANCHO*4, ANCHO*3, ANCHO);
		
		//O	
		g.fillRect(INICIO_X + ANCHO*57, INICIO_Y, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*58, INICIO_Y, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*59, INICIO_Y + ANCHO, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*59, INICIO_Y + ANCHO*2, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*59, INICIO_Y + ANCHO*3, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*56, INICIO_Y + ANCHO, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*56, INICIO_Y + ANCHO*2, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*56, INICIO_Y + ANCHO*3, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*57, INICIO_Y + ANCHO*4, ANCHO, ANCHO);
		g.fillRect(INICIO_X + ANCHO*58, INICIO_Y + ANCHO*4, ANCHO, ANCHO);
		
		//F
		g.fillRect(INICIO_X + ANCHO*61, INICIO_Y, ANCHO, ANCHO*5);
		g.fillRect(INICIO_X + ANCHO*61, INICIO_Y, ANCHO*3, ANCHO);
		g.fillRect(INICIO_X + ANCHO*61, INICIO_Y + ANCHO*2, ANCHO*2, ANCHO);
		
		//L
		g.fillRect(INICIO_X + ANCHO*67, INICIO_Y, ANCHO, ANCHO*5);
		g.fillRect(INICIO_X + ANCHO*67, INICIO_Y  + ANCHO*4, ANCHO*3, ANCHO);
		
		//I
		g.fillRect(INICIO_X + ANCHO*71, INICIO_Y, ANCHO, ANCHO*5);
		
		//F
		g.fillRect(INICIO_X + ANCHO*73, INICIO_Y, ANCHO, ANCHO*5);
		g.fillRect(INICIO_X + ANCHO*73, INICIO_Y, ANCHO*3, ANCHO);
		g.fillRect(INICIO_X + ANCHO*73, INICIO_Y + ANCHO*2, ANCHO*2, ANCHO);
		
		//E
		g.fillRect(INICIO_X + ANCHO*73 + ANCHO*4, INICIO_Y, ANCHO, ANCHO*5);
		g.fillRect(INICIO_X + ANCHO*73 + ANCHO*4, INICIO_Y, ANCHO*3, ANCHO);		
		g.fillRect(INICIO_X + ANCHO*73 + ANCHO*4, INICIO_Y + ANCHO*2, ANCHO*3, ANCHO);
		g.fillRect(INICIO_X + ANCHO*73 + ANCHO*4, INICIO_Y + ANCHO*4, ANCHO*3, ANCHO);
		
	}
	
}
