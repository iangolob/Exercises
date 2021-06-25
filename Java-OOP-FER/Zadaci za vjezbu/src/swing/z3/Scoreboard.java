package swing.z3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Scoreboard extends JFrame {
	private int bluePoints = 0;
	private int redPoints = 0;
	private JButton resetBtn = new JButton("Reset");
	private JButton redBtn = new JButton("New point for red");
	private JButton blueBtn = new JButton("New point for blue");
	private JLabel redLbl = new JLabel("0",SwingConstants.CENTER);
	private JLabel blueLbl = new JLabel("0",SwingConstants.CENTER);


	public Scoreboard() {
		super("Scoreboard");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		JPanel topPanel = new JPanel();
		{
			topPanel.add(resetBtn);
			resetBtn.addActionListener((e)->{
				bluePoints=0;
				redPoints=0;
				updatePoints();
			});
		}
		add(topPanel,BorderLayout.NORTH);
		
		JPanel middlePanel = new JPanel();
		{
			middlePanel.setLayout(new GridLayout(1,2,5,5));
			redLbl.setBackground(Color.RED);
			redLbl.setOpaque(true);
			blueLbl.setBackground(Color.BLUE);
			blueLbl.setOpaque(true);
			middlePanel.add(redLbl);
			middlePanel.add(blueLbl);
		}
		add(middlePanel,BorderLayout.CENTER);
		
		JPanel bottomPanel = new JPanel();
		{
			bottomPanel.add(redBtn);
			bottomPanel.add(blueBtn);
			ActionListener pointListener = new PointListener();
			redBtn.addActionListener(pointListener);
			blueBtn.addActionListener(pointListener);
		}
		add(bottomPanel,BorderLayout.SOUTH);
		
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			Scoreboard window = new Scoreboard();
			window.pack();
			window.setVisible(true);
		});

	}

	private class PointListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==redBtn)
				redPoints++;
			if(e.getSource()==blueBtn)
				bluePoints++;
			updatePoints();
		}
	}

	public void updatePoints() {
		redLbl.setText(Integer.toString(redPoints));
		blueLbl.setText(Integer.toString(bluePoints));
	}
}
