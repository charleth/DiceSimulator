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

	// int dicekindInt;

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

	TextField amountdice = new TextField(3); // soll durch Nutzer einstellbar sein
	TextField dicekind = new TextField(3); // soll durch Anklicken der d2-d100 buttons ausgefüllt werden - vorher CTA -
											// TextField vmtl nicht das richtige.
	TextField modifier = new TextField(3); // soll durch Nutzer einstellbar sein

	// JLabel DetailResult1 = new JLabel("You have rolled " + amountdice + " D" +
	// dicekind);
	// JLabel DetailResult2 = new JLabel("Modifier: " + prefix + modifier);
	// JLabel DetailResult3 = new JLabel("Result: " + (for schleife; for each
	// amountdice do randomdings) + prefix + modifier + " = " rollresult + (prefix +
	// modifier))

	public DiceCard() {
		// building intermediate layouts

		upperPanelAllDice.setLayout(new FlowLayout(FlowLayout.LEFT));
		upperPanelAllDice.add(selectD2);
		selectD2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// dicekindInt = 2;
				dicekind.setText("2");
			}
		});

		upperPanelAllDice.add(selectD4);
		selectD4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// dicekindInt = 4;
				dicekind.setText("4");
			}
		});

		upperPanelAllDice.add(selectD6);
		selectD4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// dicekindInt = 6;
				dicekind.setText("6");
			}
		});

		upperPanelAllDice.add(selectD8);
		selectD8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// dicekindInt = 8;
				dicekind.setText("8");
			}
		});

		upperPanelAllDice.add(selectD10);
		selectD10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// dicekindInt = 10;
				dicekind.setText("10");
			}
		});

		upperPanelAllDice.add(selectD12);
		selectD12.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// dicekindInt = 12;
				dicekind.setText("12");
			}
		});

		upperPanelAllDice.add(selectD20);
		selectD20.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// dicekindInt = 20;
				dicekind.setText("20");
			}
		});

		upperPanelAllDice.add(selectD100);
		selectD100.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// dicekindInt = 100;
				dicekind.setText("100");
			}
		});

		middlePanelDiceAndMods.setLayout(new FlowLayout(FlowLayout.LEFT));
		middlePanelDiceAndMods.add(new JLabel("Amount of dice: "));
		middlePanelDiceAndMods.add(amountdice);
		amountdice.setText("1");
		middlePanelDiceAndMods.add(new JLabel("Number of sides per die: "));
		middlePanelDiceAndMods.add(dicekind);
		dicekind.getText();
		middlePanelDiceAndMods.add(new JLabel("Modifier: "));
		middlePanelDiceAndMods.add(modifier);
		modifier.setText("0");
		;
		middlePanelRollDice.add(rollDiceBtn);
		rollDiceBtn.addActionListener(this);

		middlePanelTotalResult.setLayout(new FlowLayout(FlowLayout.LEFT));
		middlePanelTotalResult.add(new JLabel("Result: "));
		middlePanelTotalResult.add(TotalResult);

		lowerPanelDetailResult.setLayout(new FlowLayout(FlowLayout.LEFT));
		lowerPanelDetailResult.add(new JLabel("Filler Text for detailed Results!"));
		// lowerPanelDetailResult.add(new JLabel("You have rolled " + amountdiceInt + "
		// D" + dicekindInt + " with a modifier of " + modifierInt)););

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
		TotalResult.setText(" ");

		int amountdiceInt;
		int dicekindInt;
		int modifierInt;
		try {
			amountdiceInt = Integer.parseInt(amountdice.getText());
			dicekindInt = Integer.parseInt(dicekind.getText());
			modifierInt = Integer.parseInt(modifier.getText());

			// side number must be between 1 and 100
			if (dicekindInt <= 0 || dicekindInt > 100)
				JOptionPane.showMessageDialog(null, "Error\nSide number must be between 1 and 100");
			else {
				// dice number must be between 1 and 20
				if (amountdiceInt <= 0 || amountdiceInt > 20)
					JOptionPane.showMessageDialog(null, "Error\nOnly 1 to 20 dice can be rolled at once");
				else {
					// generating random numbers from nbSideInt
					for (int i = 1; i <= amountdiceInt; i++) {
						Random r = new Random();
						int low = 1;
						int high = dicekindInt + 1;
						int result = r.nextInt(high - low) + low + modifierInt;
						TotalResult.setText(TotalResult.getText() + " " + String.valueOf(result));
					}
				}
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Error\nPlease enter a number");
		}
		;
	}
};