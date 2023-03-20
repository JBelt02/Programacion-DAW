package ejercicioPaneles;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;

public class PanelGestionDatos extends JPanel {
	private JTextField jtfid;
	private JTextField jtfNombre;
	private JTextField jjtfDescripcion;
	
	public PanelGestionDatos() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWeights = new double[]{0.0, 1.0};
//		gridBagLayout.columnWidths = new int[]{0, 0, 0};
//		gridBagLayout.rowHeights = new int[]{0, 0};
//		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
//		gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblId = new JLabel("ID:");
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.anchor = GridBagConstraints.EAST;
		gbc_lblId.gridx = 0;
		gbc_lblId.gridy = 0;
		add(lblId, gbc_lblId);
		
		jtfid = new JTextField();
		GridBagConstraints gbc_jtfid = new GridBagConstraints();
		gbc_jtfid.insets = new Insets(0, 0, 5, 0);
		gbc_jtfid.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfid.gridx = 1;
		gbc_jtfid.gridy = 0;
		add(jtfid, gbc_jtfid);
		jtfid.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 0;
		gbc_lblNombre.gridy = 1;
		add(lblNombre, gbc_lblNombre);
		
		jtfNombre = new JTextField();
		GridBagConstraints gbc_jtfNombre = new GridBagConstraints();
		gbc_jtfNombre.insets = new Insets(0, 0, 5, 0);
		gbc_jtfNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfNombre.gridx = 1;
		gbc_jtfNombre.gridy = 1;
		add(jtfNombre, gbc_jtfNombre);
		jtfNombre.setColumns(10);
		
		JLabel lblDescrip = new JLabel("Descrip:");
		GridBagConstraints gbc_lblDescrip = new GridBagConstraints();
		gbc_lblDescrip.anchor = GridBagConstraints.EAST;
		gbc_lblDescrip.insets = new Insets(0, 0, 0, 5);
		gbc_lblDescrip.gridx = 0;
		gbc_lblDescrip.gridy = 2;
		add(lblDescrip, gbc_lblDescrip);
		
		jjtfDescripcion = new JTextField();
		GridBagConstraints gbc_jjtfDescripcion = new GridBagConstraints();
		gbc_jjtfDescripcion.fill = GridBagConstraints.HORIZONTAL;
		gbc_jjtfDescripcion.gridx = 1;
		gbc_jjtfDescripcion.gridy = 2;
		add(jjtfDescripcion, gbc_jjtfDescripcion);
		jjtfDescripcion.setColumns(10);
	}

}
