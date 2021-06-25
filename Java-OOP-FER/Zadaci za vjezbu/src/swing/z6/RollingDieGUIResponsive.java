package swing.z6;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import swing.z5.RollingDieGUIUnresponsive;

public class RollingDieGUIResponsive extends JFrame {
	private JSlider slider = new JSlider(0, 10000);
	private JLabel selectedLbl;
	private List<JLabel> numList = new ArrayList<>(6);
	private List<JLabel> freqList = new ArrayList<>(6);
	private int numOfThrows = 0;

	public RollingDieGUIResponsive() {
		super("Rolling Die - GUI responsive");
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
		int sliderValue = slider.getValue();
		for (int i = 0; i < 6; i++) {

			numList.get(i).setText("0");
			freqList.get(i).setText("0");
		}
		new Thread(() -> {
			for (numOfThrows = 0; numOfThrows < sliderValue; numOfThrows++) {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				int next = ((int) (Math.random() * 6));
				try {
					SwingUtilities.invokeAndWait(() -> {
						int lastValue = Integer.parseInt(numList.get(next).getText());
						numList.get(next).setText(Integer.toString(lastValue + 1));
					});
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();

	}

	private void calculate() {
		if (numOfThrows == 0)
			return;
		for (int i = 0; i < 6; i++) {
			double num = Double.parseDouble(numList.get(i).getText());
			freqList.get(i).setText(Double.toString(num / numOfThrows));
		}
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			JFrame frame = new RollingDieGUIResponsive();
			frame.pack();
			frame.setVisible(true);
		});

	}
}
