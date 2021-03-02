package diceSimulator;

import javax.swing.JFrame;

public class Window extends JFrame {
	Panel panel = new Panel();

	public Window() {
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setTitle("DiceSimulator");
		this.setSize(250, 200);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);
	}
}
