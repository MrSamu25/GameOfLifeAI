package co.edu.icesi.IA.vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

import co.edu.icesi.IA.modelo.Tablero;

public class PanelBotones extends JPanel implements ActionListener{

	//////////////////////////////////////////////////////////////////////////////////////////////
	// CONSTANTES
	//////////////////////////////////////////////////////////////////////////////////////////////
	public final static String INICIAR = "iniciar";
	public final static String DETENER = "detener";
	public final static String LIMPIAR = "limpiar";
	public final static String PATRONES = "patrones";

	//////////////////////////////////////////////////////////////////////////////////////////////
	// ATRIBUTOS
	//////////////////////////////////////////////////////////////////////////////////////////////
	private JButton butIniciar;
	private JButton butDetener;
	private JButton butLimpiar;
	private JLabel labCelulasVivas;
	private JComboBox comboPatrones;
	private JLabel labBucle;
	private JLabel labGeneracion;
	
	private Timer timer;
	
	private InterfazPrincipal principal;

	//////////////////////////////////////////////////////////////////////////////////////////////
	// CONSTRUCTOR
	//////////////////////////////////////////////////////////////////////////////////////////////
	public PanelBotones(InterfazPrincipal v) {
		principal = v;
		
		setPreferredSize(new Dimension(0, 50));
		setBackground(Color.GRAY);
		setLayout(new FlowLayout());

		ImageIcon icono = new ImageIcon("img/play.png");
		butIniciar = new JButton(icono);
		butIniciar.setPreferredSize(new Dimension(28, 28));

		icono = new ImageIcon("img/detener.png");
		butDetener = new JButton(icono);
		butDetener.setPreferredSize(new Dimension(28, 28));

		icono = new ImageIcon("img/stop.png");
		butLimpiar = new JButton(icono);
		butLimpiar.setPreferredSize(new Dimension(28, 28));

		butIniciar.setActionCommand(INICIAR);
		butDetener.setActionCommand(DETENER);
		butLimpiar.setActionCommand(LIMPIAR);

		butIniciar.addActionListener(this);
		butDetener.addActionListener(this);
		butLimpiar.addActionListener(this);

		labCelulasVivas = new JLabel("CelulasVivas: " + principal.getTablero().getCelulasVivas());
		
		comboPatrones = new JComboBox(Tablero.NOMBRE_PATRONES);
		comboPatrones.setBackground(Color.GRAY);
		comboPatrones.setActionCommand(PATRONES);
		comboPatrones.addActionListener(this);
		
		labBucle = new JLabel("Estable: " + principal.getTablero().isEstable());
		labGeneracion = new JLabel("Generación: " + principal.getTablero().getGeneracion());
		
		add(butIniciar);
		add(butDetener);
		add(butLimpiar);
		add(comboPatrones);
		add(labCelulasVivas);
		add(labGeneracion);
		add(labBucle);
		

		// Timer
		// 1 seg = 1000 milisegundos
		timer = new Timer(100, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				principal.getTablero().siguienteEstado();
				principal.recargarPanel();
			}
		});

	}

	//////////////////////////////////////////////////////////////////////////////////////////////
	// 									METODOS
	//////////////////////////////////////////////////////////////////////////////////////////////
	

	@Override
	public void actionPerformed(ActionEvent evento) {
		String comando = evento.getActionCommand();

		if (comando.equals(INICIAR)) {			
			timer.start();			
		}
		if (comando.equals(DETENER)) {
			timer.stop();
		}
		if (comando.equals(LIMPIAR)) {
			timer.stop();
			principal.cargarConfiguracionTablero(Tablero.NOMBRE_PATRONES[0]);
			principal.recargarPanel();
		}
		if(comando.equals(PATRONES)) {
			//Obtiene el item seleccionado
			principal.cargarConfiguracionTablero(comboPatrones.getSelectedItem() + "");
		}

	}
	
	public void actualizarCelulasVivas() {

		labCelulasVivas.setText("CelulasVivas: " + principal.getTablero().getCelulasVivas());
	}
	
	public void actualizarGeneracionBucle() {
		labBucle.setText("Estable: " + principal.getTablero().isEstable());
		labGeneracion.setText("Generación: " + principal.getTablero().getGeneracion());
	}
	
}
