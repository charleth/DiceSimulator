package diceSimulator;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PotionsCard extends JPanel implements ActionListener {
	JPanel upperPanelPotions = new JPanel();
	JPanel middlePanelPotions = new JPanel();
	JPanel lowerPanelPotions = new JPanel();

	JButton normalHealing = new JButton("potion of healing");
	JButton greaterHealing = new JButton("potion of \n greater healing");
	JButton superiorHealing = new JButton("potion of \n superior healing");
	JButton supremeHealing = new JButton("potion of \n supreme healing");

	JLabel potionSelect = new JLabel(" ");
	JLabel potionResult = new JLabel(" ");
}

	public PotionsCard() {
		upperPanelPotions.setLayout(newFlowLayout(FlowLayout.LEFT));
		upperPanelPotions.add(normalHealing);
		normalHealing.addActionListener(new ActionListener() {
			@Override
			public voide actionPerformed(Action Event e) {
				potionSelect.setText("2d4+2");
			}
		});
		// add other potions
		middlePanelPotions.setLayout(newFlowLayout(FlowLayout.LEFT));
		middlePanelPotions.add(potionSelect);
		
		lowerPanelPotions.setLayout(newFlowLayout(FlowLayout.LEFT));
		middlePanelPotions.add(potionResult);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	;
