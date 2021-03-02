package diceSimulator;

import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Panel extends JPanel implements ActionListener {
	private JPanel upperPanel1 = new JPanel();
	private JPanel upperPanel2 = new JPanel();
	private JPanel middlePanel = new JPanel();
	private JPanel lowerPanel1 = new JPanel();
	private JPanel lowerPanel2 = new JPanel();

	private JButton rollBtn = new JButton("Roll dice");
	private JLabel displayResult = new JLabel(" ");
	private TextField nbSide = new TextField(3);
	private TextField nbDice = new TextField(3);

	public Panel() {
		// building intermediate layouts
		upperPanel1.setLayout(new FlowLayout(FlowLayout.LEFT));
		upperPanel1.add(new JLabel("Number of dice to roll :"));
		upperPanel1.add(nbDice);
		nbDice.setText("1");

		upperPanel2.setLayout(new FlowLayout(FlowLayout.LEFT));
		upperPanel2.add(new JLabel("Number of sides per dice: "));
		upperPanel2.add(nbSide);
		nbSide.setText("6");

		middlePanel.add(rollBtn);
		rollBtn.addActionListener(this);

		lowerPanel1.setLayout(new FlowLayout(FlowLayout.LEFT));
		lowerPanel1.add(new JLabel("Result :"));

		lowerPanel2.add(displayResult);

		// building final layout
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		this.add(upperPanel1);
		this.add(upperPanel2);
		this.add(middlePanel);
		this.add(Box.createVerticalStrut(15));
		this.add(lowerPanel1);
		this.add(lowerPanel2);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// emptying Result field when clicking on "Roll dice" button
		displayResult.setText(" ");

		int nbDiceInt;
		int nbSideInt;
		try {
			nbDiceInt = Integer.parseInt(nbDice.getText());
			nbSideInt = Integer.parseInt(nbSide.getText());

			// side number must be between 1 and 100
			if (nbSideInt <= 0 || nbSideInt > 100)
				JOptionPane.showMessageDialog(null, "Error\nSide number must be between 1 and 100");
			else {
				// dice number must be between 1 and 20
				if (nbDiceInt <= 0 || nbDiceInt > 20)
					JOptionPane.showMessageDialog(null, "Error\nOnly 1 to 20 dice can be rolled at once");
				else {
					// generating random numbers from nbSideInt
					for (int i = 1; i <= nbDiceInt; i++) {
						Random r = new Random();
						int low = 1;
						int high = nbSideInt + 1;
						int result = r.nextInt(high - low) + low;
						displayResult.setText(displayResult.getText() + " " + String.valueOf(result));
					}
				}
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Error\nPlease enter a number");
		}
		;
	}
}
