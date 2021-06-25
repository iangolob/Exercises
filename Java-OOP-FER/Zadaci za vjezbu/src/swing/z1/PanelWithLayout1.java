package swing.z1;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.*;

public class PanelWithLayout1 extends JPanel {
	public PanelWithLayout1() {
		setLayout(new BorderLayout());
		add(new JButton("Button1"),BorderLayout.CENTER);
		add(new JButton("Button2"),BorderLayout.NORTH);
		add(new JButton("Button3"),BorderLayout.EAST);
		add(new JButton("Button4"),BorderLayout.SOUTH);
		add(new JButton("Button5"),BorderLayout.WEST);
	}
}
