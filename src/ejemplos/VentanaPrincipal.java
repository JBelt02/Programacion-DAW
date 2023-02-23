package ejemplos;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaPrincipal extends JFrame {

	public VentanaPrincipal() {
		super("Titulo De La Ventana");
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setContentPane(getPanelPrincipal());
	}
	
	private JPanel getPanelPrincipal() {
		JPanel jpn = new JPanel();
		
		jpn.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		//Primer Elemento 
		c.gridx = 0;
		c.gridy = 0;
		c.fill = GridBagConstraints.NONE;
		c.weighty = 1;
		c.weightx = 1;
		
		JLabel jib = new JLabel("Introduzca id:");
		jpn.add(jib,c);
		
		//Segundo Elemento , a la derecha  
		c.gridx = 1;
		c.fill = GridBagConstraints.BOTH;
		
		JTextField jtf = new JTextField("Texto dento");
		jpn.add(jtf,c);
		
		//Tercer Elemento , un boton a la derecha en la primera fila 
		
		
		return jpn;
	}
}
