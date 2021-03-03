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

public class DiceCard extends JPanel implements ActionListener {
	JPanel upperPanelAllDice = new JPanel();
	JPanel middlePanelDiceAndMods = new JPanel();
	JPanel middlePanelRollDice = new JPanel();
	JPanel middlePanelTotalResult = new JPanel();
	JPanel lowerPanelDetailResult = new JPanel();

	JButton selectD2 = new JButton("coin");
	JButton selectD4 = new JButton("d4");
	JButton selectD6 = new JButton("d6");
	JButton selectD8 = new JButton("d8");
	JButton selectD10 = new JButton("d10");
	JButton selectD12 = new JButton("d12");
	JButton selectD20 = new JButton("d20");
	JButton selectD100 = new JButton("d100");

	JButton rollDiceBtn = new JButton("Roll dice");
	JLabel TotalResult = new JLabel(" ");

	// JLabel DetailResult1 = new JLabel("You have rolled" + amountdice + dicekind +
	// " = " + rollresult);
	// JLabel DetailResult2 = new JLabel("Modifier: " + prefix + modifier);
	// JLabel DetailResult3 = new JLabel("Result: " + (for schleife; for each
	// amountdice do randomdings) + prefix + modifier + " = " rollresult + (prefix +
	// modifier))

	TextField amountdice = new TextField(3); // soll durch Nutzer einstellbar sein
	TextField dicekind = new TextField(3); // soll durch Anklicken der d2-d100 buttons ausgefüllt werden - vorher CTA -
											// TextField vmtl nicht das richtige.
	TextField modifier = new TextField(3); // soll durch Nutzer einstellbar sein

	// weg
	JPanel upperPanel1 = new JPanel();
	JPanel upperPanel2 = new JPanel();
	JPanel middlePanel = new JPanel();
	JPanel lowerPanel1 = new JPanel();
	JPanel lowerPanel2 = new JPanel();

	JButton rollBtn = new JButton("Roll dice");
	JLabel displayResult = new JLabel(" ");
	TextField nbSide = new TextField(3);
	TextField nbDice = new TextField(3);

	public DiceCard() {
		// building intermediate layouts

		upperPanelAllDice.setLayout(new FlowLayout(FlowLayout.LEFT));
		upperPanelAllDice.add(selectD2);
		upperPanelAllDice.add(selectD4);
		upperPanelAllDice.add(selectD6);
		upperPanelAllDice.add(selectD8);
		upperPanelAllDice.add(selectD10);
		upperPanelAllDice.add(selectD12);
		upperPanelAllDice.add(selectD20);
		upperPanelAllDice.add(selectD100);

		middlePanelDiceAndMods.setLayout(new FlowLayout(FlowLayout.LEFT));
		middlePanelDiceAndMods.add(new JLabel("Amount of dice: "));
		middlePanelDiceAndMods.add(amountdice);
		amountdice.setText("1");
		middlePanelDiceAndMods.add(new JLabel("Number of sides per die: "));
		middlePanelDiceAndMods.add(dicekind);
		dicekind.setText("20");
		middlePanelDiceAndMods.add(new JLabel("Modifier: "));
		middlePanelDiceAndMods.add(modifier);
		modifier.setText("0");

		middlePanelRollDice.add(rollDiceBtn);
		rollBtn.addActionListener(this);

		lowerPanel1.setLayout(new FlowLayout(FlowLayout.LEFT));
		lowerPanel1.add(new JLabel("Result :"));

		lowerPanel2.add(displayResult);

		// building final layout
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		this.add(upperPanelAllDice);
		this.add(middlePanelDiceAndMods);
		this.add(middlePanelRollDice);
		this.add(middlePanelTotalResult);
		this.add(Box.createVerticalStrut(15));
		this.add(lowerPanelDetailResult);

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
};
//
//	
//	
//	
//	
//	
//	JPanel upperDicePanel = new JPanel();
//	JPanel 
//	};
//
//
//		};
//		dicecard.add(new JButton("d2"));
//		dicecard.add(new JButton("d4"));
//		dicecard.add(new JButton("d6"));
//		dicecard.add(new JButton("d8"));
//		dicecard.add(new JButton("d10"));
//		dicecard.add(new JButton("d12"));
//		dicecard.add(new JButton("d20"));
//		dicecard.add(new JButton("d100"));
//
//JPanel potioncard = new JPanel();
//
//potioncard.add(new JTextField("TextField",20));
//
//potioncard.add(new JButton("potion of healing"));
//potioncard.add(new JButton("potion of greater healing"));
//potioncard.add(new JButton("potion of superior healing"));
//potioncard.add(new JButton("potion of supreme healing"));
