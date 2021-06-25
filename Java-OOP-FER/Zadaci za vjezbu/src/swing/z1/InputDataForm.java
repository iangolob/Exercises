package swing.z1;

import java.awt.*;
import javax.swing.*;
public class InputDataForm extends JPanel {
	public InputDataForm() {
		setLayout(new GridLayout(3,0));
		add(new JLabel("Name:",SwingConstants.RIGHT));
		add(new JTextField());
		add(new JPanel());
		add(new JCheckBox("vaccinated"));
		add(new JLabel("Address:",SwingConstants.RIGHT));
		add(new JTextField());
	}
}
