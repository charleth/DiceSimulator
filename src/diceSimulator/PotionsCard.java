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
	JButton greaterHealing = new JButton("potion of \n greater healing");
	JButton superiorHealing = new JButton("potion of \n superior healing");
	JButton supremeHealing = new JButton("potion of \n supreme healing");

	JLabel potionselect = new JLabel("<select a potion>");
	JLabel potionResult = new JLabel(" ");
	JLabel gulp = new JLabel(" ");

	int amountPotionDice = 0;
	int sidesPotionDice = 0;
	int modifierPotionDice = 0;

	public PotionsCard() {

		upperPanelPotions.setLayout(new FlowLayout(FlowLayout.LEFT));
		upperPanelPotions.add(normalHealing);
		normalHealing.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				potionselect.setText("You drink a potion of healing");
				gulp.setText("*gulp*");
				amountPotionDice = 2;
				sidesPotionDice = 4;
				modifierPotionDice = 2;
				for (int i = 1; i <= amountPotionDice; i++) {
					Random r = new Random();
					int low = 1;
					int high = sidesPotionDice + 1;
					int result = r.nextInt(high - low) + low + modifierPotionDice;
					potionResult.setText("You heal for " + String.valueOf(result) + "HP");
				}
			}
		});
		upperPanelPotions.add(greaterHealing);
		greaterHealing.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				potionselect.setText("You drink a potion of greater healing");
				gulp.setText("*gulp*");
				amountPotionDice = 4;
				sidesPotionDice = 4;
				modifierPotionDice = 4;
				for (int i = 1; i <= amountPotionDice; i++) {
					Random r = new Random();
					int low = 1;
					int high = sidesPotionDice + 1;
					int result = r.nextInt(high - low) + low + modifierPotionDice;
					potionResult.setText("You heal for " + String.valueOf((result) + "HP");
				}
			}
		});
		upperPanelPotions.add(superiorHealing);
		superiorHealing.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				potionselect.setText("You drink a potion of superior healing");
				gulp.setText("*gulp*");
				amountPotionDice = 8;
				sidesPotionDice = 4;
				modifierPotionDice = 8;
				for (int i = 1; i <= amountPotionDice; i++) {
					Random r = new Random();
					int low = 1;
					int high = sidesPotionDice + 1;
					int result = r.nextInt(high - low) + low + modifierPotionDice;
					potionResult.setText("You heal for " + String.valueOf(result) + "HP");
				}
			}
		});
		upperPanelPotions.add(supremeHealing);
		supremeHealing.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				potionselect.setText("You drink a potion of supreme healing");
				gulp.setText("*gulp*");
				int amountPotionDice = 10;
				int sidesPotionDice = 4;
				int modifierPotionDice = 20;
				for (int i = 1; i <= amountPotionDice; i++) {
					Random r = new Random();
					int low = 1;
					int high = sidesPotionDice + 1;
					int result = r.nextInt(high - low) + low;
					int modresult = result + modifierPotionDice;
					potionResult.setText(potionResult.getText() + " " + String.valueOf(modresult) + "HP");
					// TODO this does something, but not what I want it to do. Why? Do I need to do
					// stuff differently?
					// different class for rolling the dice?
				}

			}
		});

		middlePanelPotions.setLayout(new FlowLayout(FlowLayout.LEFT));
		middlePanelPotions.add(potionselect);

		middlePanelPotions2.setLayout(new FlowLayout(FlowLayout.LEFT));
		middlePanelPotions2.add(gulp);

		lowerPanelPotions.setLayout(new FlowLayout(FlowLayout.LEFT));
		lowerPanelPotions.add(potionResult);

		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		this.add(upperPanelPotions);
		this.add(middlePanelPotions);
		this.add(middlePanelPotions2);
		this.add(lowerPanelPotions);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		potionResult.setText(" ");
		// TODO this doesnt seem to do anything?! why not?

	};

};
