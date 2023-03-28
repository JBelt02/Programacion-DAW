package ejercicioPaneles;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class GestionPanelEstudiante extends JPanel {

	/**
	 * Create the panel.
	 */
	public GestionPanelEstudiante() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblGestionDatosEstudiante = new JLabel("Gestion Datos Estudiante");
		GridBagConstraints gbc_lblGestionDatosEstudiante = new GridBagConstraints();
		gbc_lblGestionDatosEstudiante.insets = new Insets(0, 0, 5, 5);
		gbc_lblGestionDatosEstudiante.gridx = 4;
		gbc_lblGestionDatosEstudiante.gridy = 0;
		add(lblGestionDatosEstudiante, gbc_lblGestionDatosEstudiante);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 2;
		gbc_panel.gridheight = 2;
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 3;
		gbc_panel.gridy = 1;
		add(PanelGestionDatos, gbc_panel);º
	
		
	}


}
