package swing.z1;

import java.awt.*;

import javax.swing.*;

public class EmailClient extends JFrame {
	private JTextField fromTF = new JTextField();
	private JTextField toTF = new JTextField();
	private JTextField subjectTF = new JTextField();
	private JTextField messageTF = new JTextField();
	private JButton clearBtn = new JButton("Clear message");
	private JButton sendBtn = new JButton("Send e-mail");

	public EmailClient() {
		super("E-mail client");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		LayoutManager layout = new BorderLayout();
		setLayout(layout);
	
		JPanel panel = (JPanel) this.getContentPane();
		panel.setBorder(BorderFactory.createEmptyBorder(8,8,8,8));
		
		
 		JPanel topPanel = new JPanel();
		JPanel centerPanel = new JPanel();
		JPanel bottomPanel = new JPanel();
		
		topPanel.setLayout(new BorderLayout());
		{
			JPanel leftTopPanel = new JPanel();
			JPanel rightTopPanel = new JPanel();
			leftTopPanel.setLayout(new GridLayout(3,0,5,5));
			rightTopPanel.setLayout(new GridLayout(3,0,5,5));
			topPanel.add(leftTopPanel,BorderLayout.WEST);
			topPanel.add(rightTopPanel,BorderLayout.CENTER);
			leftTopPanel.add(new JLabel("From: ",SwingConstants.RIGHT));
			leftTopPanel.add(new JLabel("To: ",SwingConstants.RIGHT));
			leftTopPanel.add(new JLabel("Subject: ",SwingConstants.RIGHT));
			rightTopPanel.add(fromTF);
			rightTopPanel.add(toTF);
			rightTopPanel.add(subjectTF);
		}
		add(topPanel,BorderLayout.NORTH);
		
		centerPanel.setLayout(new BorderLayout());
		{
			centerPanel.add(new JLabel("Message",SwingConstants.LEFT),BorderLayout.NORTH);
			centerPanel.add(messageTF,BorderLayout.CENTER);
			messageTF.setBorder(BorderFactory.createEmptyBorder());
			
		}
		add(centerPanel);	
		
		bottomPanel.setLayout(new FlowLayout());
		{
			bottomPanel.add(sendBtn);
			bottomPanel.add(clearBtn);
		}
		add(bottomPanel,BorderLayout.SOUTH);
		setSize(500,500);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			EmailClient client = new EmailClient();
			client.setVisible(true);
		});

	}
}
