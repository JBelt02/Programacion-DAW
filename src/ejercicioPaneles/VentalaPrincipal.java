package ejercicioPaneles;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;



public class VentalaPrincipal extends JFrame {
	
	public VentalaPrincipal() {
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		JTabbedPane tabedPane = new JTabbedPane();
		
		tabedPane.add("Estudiante", new GestionPanelEstudiante());
		this.setMinimumSize(new Dimension(800, 600));

		
		this.setContentPane(tabedPane);
	}

	public static void main(String[] args) {
		VentalaPrincipal v = new VentalaPrincipal();
		v.setVisible(true);

	}

}
