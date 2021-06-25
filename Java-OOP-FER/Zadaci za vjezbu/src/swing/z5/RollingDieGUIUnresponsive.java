package swing.z5;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

public class RollingDieGUIUnresponsive extends JFrame {
	private JSlider slider = new JSlider(0, 10000);
	private JLabel selectedLbl;
	private List<JLabel> numList = new ArrayList<>(6);
	private List<JLabel> freqList = new ArrayList<>(6);
	private int numOfThrows = 0;

	public RollingDieGUIUnresponsive() {
		super("Rolling Die - GUI not responsive");
		((JPanel) getContentPane()).setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

		JPanel topPanel = new JPanel();
		topPanel.setLayout(new BorderLayout());

		slider.setMajorTickSpacing(10000);
		slider.setMinorTickSpacing(1000);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.addChangeListener((e) -> {
			selectedLbl.setText(Integer.toString(slider.getValue()));
		});

		selectedLbl = new JLabel("0", SwingConstants.CENTER);

		topPanel.add(selectedLbl, BorderLayout.NORTH);
		topPanel.add(slider, BorderLayout.CENTER);
		add(topPanel, BorderLayout.NORTH);

		JPanel centerPanel = new JPanel();
		add(centerPanel, BorderLayout.CENTER);
		centerPanel.setLayout(new GridLayout(6, 2, 5, 5));

		for (int i = 0; i < 6; i++) {
			JLabel num = new JLabel("0", SwingConstants.RIGHT);
			JLabel freq = new JLabel("0", SwingConstants.RIGHT);
			num.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
			freq.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
			numList.add(num);
			freqList.add(freq);
			centerPanel.add(num);
			centerPanel.add(freq);
		}

		JPanel bottomPanel = new JPanel();
		JButton startBtn = new JButton("Start");
		JButton calculateBtn = new JButton("Calculate relative freq.");
		bottomPanel.add(startBtn);
		bottomPanel.add(calculateBtn);
		add(bottomPanel, BorderLayout.SOUTH);

		startBtn.addActionListener((e) -> {
			startBtn.setEnabled(false);
			slider.setEnabled(false);
			runSimulation();
			slider.setEnabled(true);
			startBtn.setEnabled(true);
		});
		calculateBtn.addActionListener((e) -> {
			calculate();
		});
	}

	private void runSimulation() {
		for(int i=0;i<6;i++) {
			numList.get(i).setText("0");

			freqList.get(i).setText("0");
		}
		for (numOfThrows = 0; numOfThrows < slider.getValue(); numOfThrows++) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int next = ((int) (Math.random() * 6));
			int lastValue = Integer.parseInt(numList.get(next).getText());
			numList.get(next).setText(Integer.toString(lastValue + 1));

		}
	}

	private void calculate() {
		if(numOfThrows==0)
			return;
		for(int i=0;i<6;i++) {
			double num =  Double.parseDouble(numList.get(i).getText());
			freqList.get(i).setText(Double.toString(num/numOfThrows));
		}
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			JFrame frame = new RollingDieGUIUnresponsive();
			frame.pack();
			frame.setVisible(true);
		});

	}
}
