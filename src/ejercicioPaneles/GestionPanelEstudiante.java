package ejercicioPaneles;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class GestionPanelEstudiante extends JPanel {

	/**
	 * Create the panel.
	 */
	public GestionPanelEstudiante() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblGestionEstudiantes = new JLabel("Gestion Estudiantes");
		GridBagConstraints gbc_lblGestionEstudiantes = new GridBagConstraints();
		gbc_lblGestionEstudiantes.insets = new Insets(0, 0, 5, 0);
		gbc_lblGestionEstudiantes.gridx = 0;
		gbc_lblGestionEstudiantes.gridy = 0;
		add(lblGestionEstudiantes, gbc_lblGestionEstudiantes);
		
		JLabel lblNewLabel = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		add(lblNewLabel, gbc_lblNewLabel);

	}

}
