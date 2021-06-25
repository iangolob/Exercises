package swing.z4;

import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;
import javax.swing.SwingUtilities;

public class ComplexNumbersConverter extends JFrame {
	private JTextField realField = new JTextField();
	private JTextField imaginaryField = new JTextField();
	private JTextField moduleField = new JTextField();
	private JTextField angleField = new JTextField();
	private JLabel resultLbl = new JLabel("");
	ButtonGroup rectgPolarBtnGroup = new ButtonGroup();
	public ComplexNumbersConverter() {
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		// MENU
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("Action");

		JMenuItem calculateItem = new JMenuItem("Calculate");
		calculateItem.addActionListener((e) -> calculate());
		// calculateItem.setMnemonic(KeyEvent.VK_ALT);
		JMenuItem clearItem = new JMenuItem("Clear");
		clearItem.addActionListener((e) -> {
			realField.setText("");
			imaginaryField.setText("");
			moduleField.setText("");
			angleField.setText("");
			resultLbl.setText("");
		});
		JMenuItem exitItem = new JMenuItem("Exit");
		exitItem.addActionListener((e) -> System.exit(0));

		JMenu styleMenu = new JMenu("Style");
		JMenuItem boldItem = new JMenuItem("BOLD");
		JMenuItem plainItem = new JMenuItem("PLAIN");

		styleMenu.add(boldItem);
		styleMenu.add(plainItem);
		plainItem.addActionListener((e) -> setFieldFonts(new Font("Calibri", Font.PLAIN, 15)));
		boldItem.addActionListener((e) -> setFieldFonts(new Font("Calibri", Font.BOLD, 15)));
		plainItem.doClick();
		menu.add(calculateItem);
		menu.add(clearItem);
		menu.add(exitItem);
		menuBar.add(menu);
		menuBar.add(styleMenu);
		add(menuBar, BorderLayout.NORTH);

		// CENTER

		JPanel centerTopPanel = new JPanel();

		
		JToggleButton rectgBtn = new JToggleButton("To rectg");
		JToggleButton polarBtn = new JToggleButton("To polar");
		rectgBtn.addActionListener((e) -> {
			realField.setEnabled(false);
			imaginaryField.setEnabled(false);
			moduleField.setEnabled(true);
			angleField.setEnabled(true);
		});
		polarBtn.addActionListener((e) -> {
			realField.setEnabled(true);
			imaginaryField.setEnabled(true);
			moduleField.setEnabled(false);
			angleField.setEnabled(false);
		});
		rectgBtn.doClick();
		rectgPolarBtnGroup.add(rectgBtn);
		rectgPolarBtnGroup.add(polarBtn);

		centerTopPanel.add(rectgBtn);
		centerTopPanel.add(polarBtn);

		JPanel centerCenterPanel = new JPanel();
		centerCenterPanel.setLayout(new BorderLayout());

		JPanel lblPanel = new JPanel();
		lblPanel.setBorder(BorderFactory.createEmptyBorder(3, 3, 3, 3));
		lblPanel.setLayout(new GridLayout(4, 0, 3, 3));
		lblPanel.add(new JLabel("Real Part: ", SwingConstants.RIGHT));
		lblPanel.add(new JLabel("Imaginary part: ", SwingConstants.RIGHT));
		lblPanel.add(new JLabel("Module: ", SwingConstants.RIGHT));
		lblPanel.add(new JLabel("Angle (in degrees): ", SwingConstants.RIGHT));
		centerCenterPanel.add(lblPanel, BorderLayout.WEST);

		JPanel inputPanel = new JPanel();
		inputPanel.setLayout(new GridLayout(4, 0, 5, 5));
		inputPanel.add(realField);
		inputPanel.add(imaginaryField);
		inputPanel.add(moduleField);
		inputPanel.add(angleField);
		centerCenterPanel.add(inputPanel, BorderLayout.CENTER);

		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new BorderLayout());
		centerPanel.add(centerTopPanel, BorderLayout.NORTH);
		centerPanel.add(centerCenterPanel, BorderLayout.CENTER);
		add(centerPanel, BorderLayout.CENTER);

		// BOTTOM
		resultLbl.setBackground(Color.WHITE);
		resultLbl.setOpaque(true);
		resultLbl.setVisible(true);
		add(resultLbl, BorderLayout.SOUTH);

	}

	private void setFieldFonts(Font font) {
		resultLbl.setFont(font);
		realField.setFont(font);
		imaginaryField.setFont(font);
		moduleField.setFont(font);
		angleField.setFont(font);
	}

	private void calculate() {
		System.out.println(rectgPolarBtnGroup.getSelection().getActionCommand());
	
		
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			JFrame frame = new ComplexNumbersConverter();
			frame.pack();
			frame.setSize(400, 300);
			frame.setVisible(true);
		});
	}
}
