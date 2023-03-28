package ejercicioCentroEducativo;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

public class VentanaPrincipal extends JFrame {
	public VentanaPrincipal() {
		GridBagLayout gridBagLayout = new GridBagLayout();
//		gridBagLayout.columnWidths = new int[]{0};
//		gridBagLayout.rowHeights = new int[]{0};
//		gridBagLayout.columnWeights = new double[]{Double.MIN_VALUE};
//		gridBagLayout.rowWeights = new double[]{Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnEstudiante = new JMenu("Estudiante");
		menuBar.add(mnEstudiante);
		
		JMenu mnEjemplo = new JMenu("Ejemplo");
		menuBar.add(mnEjemplo);
	}

}
