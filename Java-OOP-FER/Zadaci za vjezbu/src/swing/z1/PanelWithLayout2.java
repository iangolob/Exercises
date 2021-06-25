package swing.z1;

import java.awt.*;
import javax.swing.*;

public class PanelWithLayout2 extends JPanel {
	public PanelWithLayout2() {
		setLayout(new FlowLayout());
		add(new JButton("Button1"));
		add(new JButton("Button2 is very very long"));
		add(new JButton("Button3"));
		add(new JButton("Button4 is very long"));
		add(new JButton("Button5"));
	}
}
