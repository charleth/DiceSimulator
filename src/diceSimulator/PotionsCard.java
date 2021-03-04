package diceSimulator;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PotionsCard extends JPanel implements ActionListener {
	JPanel upperPanelPotions = new JPanel();
	JPanel middlePanelPotions = new JPanel();
	JPanel middlePanelPotions2 = new JPanel();
	JPanel lowerPanelPotions = new JPanel();

	JButton normalHealing = new JButton("potion of healing");
	JButton greaterHealing = new JButton("potion of greater healing");
	JButton superiorHealing = new JButton("potion of superior healing");
	JButton supremeHealing = new JButton("potion of supreme healing");

	JLabel potionselect = new JLabel("<select a potion>");
	JLabel potionResultLabel = new JLabel(" ");
	JLabel gulp = new JLabel(" ");

	int amountPotionDice = 0;
	JLabel potionselectLabel = new JLabel("<select a potion>");
	String potionselectString = (" ");
	int sidesPotionDice = 0;
	int modifierPotionDice = 0;
	int potionresult = 0;
	int modresult = 0;
	int result = 0;
	JLabel drinkpotionlabel = new JLabel(" ");
	Random r = new Random();

	public PotionsCard() {

		upperPanelPotions.setLayout(new FlowLayout(FlowLayout.LEFT));
		upperPanelPotions.add(normalHealing);
		normalHealing.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				potionselect.setText(" ");
				potionselectString = (" ");
				drinkpotionlabel.setText("You drink a potion of" + potionselectString + "healing.");
				gulp.setText("*gulp*");
				amountPotionDice = 2;
				sidesPotionDice = 4;
				modifierPotionDice = 2;
				modresult = 0;
				for (int i = 1; i <= amountPotionDice; i++) {
					int low = 1;
					int high = sidesPotionDice + 1;
					int result = r.nextInt(high - low) + low;
					modresult += result;
				}
				potionResultLabel.setText("You heal for " + String.valueOf(modresult + modifierPotionDice) + "HP");
			}
		});
		upperPanelPotions.add(greaterHealing);
		greaterHealing.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				potionselect.setText(" ");
				potionselectString = (" greater ");
				drinkpotionlabel.setText("You drink a potion of" + potionselectString + "healing.");
				gulp.setText("*gulp*");
				amountPotionDice = 4;
				sidesPotionDice = 4;
				modifierPotionDice = 4;
				modresult = 0;
				for (int i = 1; i <= amountPotionDice; i++) {
					int low = 1;
					int high = sidesPotionDice + 1;
					int result = r.nextInt(high - low) + low;
					modresult += result;
				}
				potionResultLabel.setText("You heal for " + String.valueOf(modresult + modifierPotionDice) + "HP");
			}
		});
		upperPanelPotions.add(superiorHealing);
		superiorHealing.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				potionselect.setText(" ");
				potionselectString = (" superior ");
				drinkpotionlabel.setText("You drink a potion of" + potionselectString + "healing.");
				gulp.setText("*gulpgulp*");
				amountPotionDice = 8;
				sidesPotionDice = 4;
				modifierPotionDice = 8;
				modresult = 0;
				for (int i = 1; i <= amountPotionDice; i++) {
					int low = 1;
					int high = sidesPotionDice + 1;
					int result = r.nextInt(high - low) + low;
					modresult += result;
				}
				potionResultLabel.setText("You heal for " + String.valueOf(modresult + modifierPotionDice) + " HP");
			}
		});
		upperPanelPotions.add(supremeHealing);
		supremeHealing.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				potionselect.setText(" ");
				potionselectString = (" supreme ");
				drinkpotionlabel.setText("You drink a potion of" + potionselectString + "healing.");
				gulp.setText("*gulpgulpgulp*");
				amountPotionDice = 10;
				sidesPotionDice = 4;
				modifierPotionDice = 20;
				modresult = 0;
				for (int i = 1; i <= amountPotionDice; i++) {
					int low = 1;
					int high = sidesPotionDice + 1;
					int result = r.nextInt(high - low) + low;
					modresult += result;
//
//					// TODO
//					// different class for rolling the dice?
				}
				potionResultLabel.setText("You heal for " + String.valueOf(modresult + modifierPotionDice) + " HP");

			}
		});

		middlePanelPotions.setLayout(new FlowLayout(FlowLayout.LEFT));
		middlePanelPotions.add(drinkpotionlabel);

		middlePanelPotions2.setLayout(new FlowLayout(FlowLayout.LEFT));
		middlePanelPotions2.add(gulp);

		lowerPanelPotions.setLayout(new FlowLayout(FlowLayout.LEFT));
		lowerPanelPotions.add(potionResultLabel);

		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		this.add(upperPanelPotions);
		this.add(middlePanelPotions);
		this.add(middlePanelPotions2);
		this.add(lowerPanelPotions);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// this doesn't do anything, and it doesn't have to.

	};

};
