package co.edu.icesi.IA.vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.TitledBorder;

public class PanelBotones extends JPanel implements ActionListener {

	//////////////////////////////////////////////////////////////////////////////////////////////
	// CONSTANTES
	//////////////////////////////////////////////////////////////////////////////////////////////
	public final static String INICIAR = "iniciar";
	public final static String DETENER = "detener";
	public final static String LIMPIAR = "limpiar";

	//////////////////////////////////////////////////////////////////////////////////////////////
	// ATRIBUTOS
	//////////////////////////////////////////////////////////////////////////////////////////////
	private JButton butIniciar;
	private JButton butDetener;
	private JButton butLimpiar;

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

		add(butIniciar);
		add(butDetener);
		add(butLimpiar);

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
			principal.cargarConfiguracionInicial();
			principal.recargarPanel();
		}

	}
	
}
