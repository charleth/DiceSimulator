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
	JPanel upperPanel0WM = new JPanel();
	JPanel upperPanel1WM = new JPanel();
	JPanel upperPanel2WM = new JPanel();
	JPanel middlePanel1WM = new JPanel();
	JPanel middlePanel2WM = new JPanel();
	JPanel lowerPanelWM = new JPanel();

	JLabel SurgeEffectsSourceLabel = new JLabel("Current source for Surge Effects: ");
	JLabel SurgeEffectsSourceLabelContent = new JLabel("Default source");
	JButton ChangeSurgeEffectsSourceButton = new JButton ("Click here to change the source file");
	// TODO hier Möglichkeit einfügen, entweder eigene Source für Surge Effects zu nutzen (CSV), oder 
	// Extra class für importieren von csv Daten. 

	JLabel TidesOfChaosLabel = new JLabel("Tides of Chaos active?");
	JCheckBox TidesOfChaosBox = new JCheckBox();
	JButton CastASpell = new JButton("Cast a Spell!");

	JLabel CastedASpell = new JLabel("<cast a spell>");
	JLabel SurgeEffect = new JLabel(" ");

	int SpellCheck = 0;
	int SurgeTableRoll = 0;
	boolean TidesOfChaosStatus = false;
	Random r = new Random();

	public string getRandomEffect( string filename) {
		List<String> result = Files.readAllLines(Paths.get(filename));
		Random r = new Random();
			int low = 1;
			int high = (result.size() - 1) + 1;
			int result2 = r.nextInt(high - low) + low;
			SurgeEffect.setText(SurgeEffect.getText() + " " + String.valueOf(result2));
					}
	}

	final JFileChooser fc = new JFileChooser();
	int returnVal = fc.showOpenDialog(aComponent);

	public WildMagicCard() {

		upperpanel0WM.setLayout(new FlowLayout(FlowLayout.LEFT));
		upperpanel0WM.add(SurgeEffectsSourceLabel);
		upperpanel0WM.add(SurgeEffectsSourceLabelContent);
		upperpanel0WM.add(ChangeSurgeEffectsSourceButton);
		ChangeSurgeEffectsSourceButton.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == ChangeSurgeEffectsSourceButton) {
					int returnVal = fc.showOpenDialog(WildMagicCard.this);

					if (returnVal == JFileChooser.APPROVE_OPTION) {
						File file = fc.getSelectedFile();
						// TODO hier fehlt was? Datei öffnen und auslesen?
					} else {
						//TODO was dann?
					}
				}
			}
		})

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
