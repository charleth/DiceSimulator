package diceSimulator;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.SwingConstants;

public class VampireDiceCard extends JPanel implements ActionListener {

	int currentWillpower;
	int spendWillpower;
	int amountVDice;
	int amountHDice;
	int rerollDice = 3;

	JPanel prepPanel = new JPanel();
	JPanel upperPanel1v1 = new JPanel();
	JPanel upperPanel1v2 = new JPanel();
	JPanel upperPanel1v3 = new JPanel();
	JPanel upperPanel2v1 = new JPanel();
	JPanel upperPanel2v2 = new JPanel();
	JPanel upperPanel2v3 = new JPanel();

	JPanel resultsPanel = new JPanel();
	JPanel middlePanel1v1 = new JPanel();
	JPanel middlePanel1v2 = new JPanel();
	JPanel middlePanel1v3 = new JPanel();
	JPanel middlePanel1v4 = new JPanel();

	JPanel rerollOptionPanel = new JPanel();
	JPanel middlePanel2v1 = new JPanel();
	JPanel middlePanel2v2 = new JPanel();

	JPanel selectRerollPanel = new JPanel();
	JPanel middlePanel3v1 = new JPanel();
	JPanel middlePanel3v2 = new JPanel();
	JPanel middlePanel3v3 = new JPanel();

	JPanel rerollResultPanel = new JPanel();
	JPanel lowerPanel1 = new JPanel();
	JPanel lowerPanel2 = new JPanel();
	JPanel lowerPanel3 = new JPanel();
	JPanel lowerPanel4 = new JPanel();
	JPanel lowerPanel5 = new JPanel();
	JPanel lowerPanel6 = new JPanel();

	JLabel currentWillpowerLabel = new JLabel("Your current willpower: ");
	JLabel totalamountDice = new JLabel("total amount of dice");
	JLabel amountHungerDice1 = new JLabel("of which");
	JLabel amountHungerDice2 = new JLabel("hunger dice");
	JSpinner totalamountDiceSpinner = new JSpinner();
	JSpinner hungerDiceSpinner = new JSpinner();

	JButton rollDiceButton = new JButton("roll!");

	JLabel resultsLabel = new JLabel("Results");
	JLabel youRolledLabel = new JLabel("You rolled:");
	JLabel rDetailsLabel1 = new JLabel("That means...");
	JLabel resultsNothingLabel = new JLabel("... nothing much happens.");

	JLabel spendWillpowerLabel = new JLabel(
			"Spend " + spendWillpower + " willpower to re-roll up to " + rerollDice + "dice?");

	JButton spendWillpowerYesButton = new JButton("Yes");
	JButton rerollDiceButton = new JButton("re-roll selected");

	JLabel youReRollLabel = new JLabel("You re-rolled:");

	public VampireDiceCard() {
		// building intermediate layouts

		// prepPanel: Preparing the roll
		prepPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		prepPanel.add(upperPanel1v1);
		prepPanel.add(upperPanel1v2);
		prepPanel.add(upperPanel1v3);
		prepPanel.add(upperPanel2v1);
		prepPanel.add(upperPanel2v2);
		prepPanel.add(upperPanel2v3);

		// resultsPanel: Showing the results of the roll
		resultsPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		resultsPanel.add(middlePanel1v1);
		resultsPanel.add(middlePanel1v2);
		resultsPanel.add(middlePanel1v3);
		resultsPanel.add(middlePanel1v4);

		// rerollOptionPanel: Giving the option to re-roll
		rerollOptionPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		rerollOptionPanel.add(middlePanel2v1);
		rerollOptionPanel.add(middlePanel2v2);

		// selectRerollPanel: Let the user select which dice to re-roll
		selectRerollPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		selectRerollPanel.add(middlePanel3v1);
		selectRerollPanel.add(middlePanel3v2);
		selectRerollPanel.add(middlePanel3v3);

		// rerollResultPanel: Showing the results of the re-roll
		rerollResultPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		rerollResultPanel.add(lowerPanel1);
		rerollResultPanel.add(lowerPanel2);
		rerollResultPanel.add(lowerPanel3);
		rerollResultPanel.add(lowerPanel4);
		rerollResultPanel.add(lowerPanel5);
		rerollResultPanel.add(lowerPanel6);

		// building the final layout
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		this.add(prepPanel);
		this.add(Box.createHorizontalStrut(5));
		this.add(new JSeparator(SwingConstants.HORIZONTAL));
		this.add(Box.createHorizontalStrut(5));
		this.add(resultsPanel);
		this.add(Box.createHorizontalStrut(5));
		this.add(new JSeparator(SwingConstants.HORIZONTAL));
		this.add(Box.createHorizontalStrut(5));
		this.add(rerollOptionPanel);
		this.add(Box.createHorizontalStrut(5));
		this.add(new JSeparator(SwingConstants.HORIZONTAL));
		this.add(Box.createHorizontalStrut(5));
		this.add(selectRerollPanel);
		this.add(Box.createHorizontalStrut(5));
		this.add(new JSeparator(SwingConstants.HORIZONTAL));
		this.add(Box.createHorizontalStrut(5));
		this.add(rerollResultPanel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	// create a button for each rolled die?

}
