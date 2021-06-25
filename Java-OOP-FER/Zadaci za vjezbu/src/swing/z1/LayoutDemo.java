package swing.z1;

import javax.swing.*;

public class LayoutDemo extends JFrame{
	public LayoutDemo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTabbedPane tp = new JTabbedPane();
		tp.addTab("Layout 1", new PanelWithLayout1());
		tp.addTab("Layout 2", new PanelWithLayout2());
		tp.addTab("Layout 3", new PanelWithLayout3());
		tp.addTab("Input Data Form", new InputDataForm());
		add(tp);
		pack();
		}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(()->{
			LayoutDemo window = new LayoutDemo();
			window.pack();
			window.setVisible(true);
			
		});
	}
	
}
