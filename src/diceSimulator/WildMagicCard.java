package diceSimulator;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WildMagicCard extends JPanel implements ActionListener {
	JPanel upperPanel1WM = new JPanel();
	JPanel upperPanel2WM = new JPanel();
	JPanel middlePanel1WM = new JPanel();
	JPanel middlePanel2WM = new JPanel();
	JPanel lowerPanelWM = new JPanel();

	JLabel TidesOfChaosLabel = new JLabel("Tides of Chaos active?");
	JCheckBox TidesOfChaosBox = new JCheckBox();
	JButton CastASpell = new JButton("Cast a Spell!");

	JLabel CastedASpell = new JLabel("<cast a spell>");
	JLabel SurgeEffect = new JLabel(" ");

	int SpellCheck = 0;
	int SurgeTableRoll = 0;
	boolean TidesOfChaosStatus = false;
	Random r = new Random();

	public WildMagicCard() {

		upperPanel1WM.setLayout(new FlowLayout(FlowLayout.LEFT));
		upperPanel1WM.add(TidesOfChaosLabel);
		upperPanel1WM.add(TidesOfChaosBox);
		TidesOfChaosBox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				TidesOfChaosStatus = true;
			}
		});

		upperPanel2WM.setLayout(new FlowLayout(FlowLayout.LEFT));
		upperPanel2WM.add(CastASpell);
		CastASpell.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CastedASpell.setText("You cast a spell.");
			}
		});

		middlePanel1WM.setLayout(new FlowLayout(FlowLayout.LEFT));
		middlePanel1WM.add(CastedASpell);

		middlePanel2WM.setLayout(new FlowLayout(FlowLayout.LEFT));
		middlePanel2WM.add(new JLabel(" "));

		lowerPanelWM.setLayout(new FlowLayout(FlowLayout.LEFT));
		lowerPanelWM.add(new JLabel("A random effect has occured!"));
		lowerPanelWM.add(SurgeEffect);

		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		this.add(upperPanel1WM);
		this.add(upperPanel2WM);
		this.add(middlePanel1WM);
		this.add(middlePanel2WM);
		this.add(lowerPanelWM);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
