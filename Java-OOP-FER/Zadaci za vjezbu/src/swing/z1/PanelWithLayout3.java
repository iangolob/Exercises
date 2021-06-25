package swing.z1;

import java.awt.*;
import javax.swing.*;
public class PanelWithLayout3 extends JPanel {
	public PanelWithLayout3() {
		setLayout(new GridLayout(3,0,5,5));
		add(new JButton("Button1"));
		add(new JButton("Button2 is very very long?"));
		add(new JButton("Button3"));
		add(new JButton("Button4"));
		add(new JButton("Button5"));
	}
}
