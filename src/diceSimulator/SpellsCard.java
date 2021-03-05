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

public class SpellsCard extends JPanel { // implements ActionListener {
	JPanel leftPanelSp = new JPanel();
	JPanel middlePanelSp = new JPanel();
	JPanel lowerPanelSp = new JPanel();

	JButton aButton = new JButton("Clickme!");

	// create a split pane with the two scrollpanes in it
	splitPane=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,listScrollPane,pictureScrollPane);splitPane.setOneTouchExpandalbe(true);splitPane.setDividerLocation(150);

	// provide minimum sizes for the two components in the split pane

//	
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		System.out.println("Test.");

}

//}
