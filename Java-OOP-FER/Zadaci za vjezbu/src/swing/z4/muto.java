package swing.z4;

import javax.swing.*;
import java.awt.*;

public class muto extends JFrame {

    public muto(){

        JButton toPolarButton = new JButton("To polar");
        JLabel realPart = new JLabel("Real part:");
        JTextField rpTf = new JTextField();
        JTextField ipTf = new JTextField();
        JLabel imagPart = new JLabel("Imaginary part:");
        JLabel moduleLabel = new JLabel("Module:");
        JLabel angleLabel = new JLabel("Angle(in degrees):");
        JTextField moduleTf = new JTextField();
        JTextField angleTf = new JTextField();
        JButton resetButton = new JButton("Reset");


        setLayout(new BorderLayout(5,5));

        JPanel northPanel = new JPanel();
        northPanel.add(toPolarButton);
        add(northPanel, BorderLayout.NORTH);

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(0,2,5,5));

        centerPanel.add(realPart);
        rpTf.setEditable(true);
        centerPanel.add(rpTf);

        centerPanel.add(imagPart);
        ipTf.setEditable(true);
        centerPanel.add(ipTf);

        centerPanel.add(moduleLabel);
        moduleTf.setEditable(false);
        centerPanel.add(moduleTf);


        centerPanel.add(angleLabel);
        angleTf.setEditable(false);
        centerPanel.add(angleTf);

        add(centerPanel, BorderLayout.CENTER);

        JPanel southPanel = new JPanel();
        southPanel.add(resetButton);

        add(southPanel, BorderLayout.SOUTH);


        toPolarButton.addActionListener(e -> {
            double[] result = Calculator.toPolar(Double.parseDouble(rpTf.getText()), Double.parseDouble(ipTf.getText()));
            double module = result[0];
            double angle = result[1];

            moduleTf.setEditable(true);
            angleTf.setEditable(true);
            moduleTf.setText(String.valueOf(module));
            angleTf.setText(String.valueOf(angle));
            moduleTf.setEditable(false);
            angleTf.setEditable(false);

        });

        resetButton.addActionListener(e -> {
            rpTf.setText("");
            ipTf.setText("");
            moduleTf.setText("");
            angleTf.setText("");
        });

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            JFrame calculatorFrame = new muto();
            calculatorFrame.setTitle("Polar caluclator");
            calculatorFrame.setLocation(100,100);
            calculatorFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            calculatorFrame.pack();
            calculatorFrame.setVisible(true);
        });
    }



}