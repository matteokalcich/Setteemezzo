package si;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ConsoleGUI extends JFrame {

	private JPanel panel;
	private BizData b;
	private JLabel imageLabel;
	private JButton mixButton;
	private JButton pescaButton;
	
	public ConsoleGUI(BizData b) {
		
		super("Carte Da Gioco");
		
		this.b = b;
		
		imageLabel = new JLabel(new ImageIcon(b.getBackCarta().getCarta()));
		
		pescaButton = new 
	}
}
