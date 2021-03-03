package diceSimulator;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class TabbedView {
	final static String DICEPANEL = "Dice";
	final static String POTIONSPANEL = "Potions";
	final static int extraWindowWidth = 100;

	public void addComponentToPane(Container pane) {
		JTabbedPane tabbedPane = new JTabbedPane();
		// Create the "cards".

		JPanel dicepanel = new JPanel() {
			// Make the panel wider than it really needs, so
			// the window's wide enough for the tabs to stay
			// in one row.
			@Override
			public Dimension getPreferredSize() {
				Dimension size = super.getPreferredSize();
				size.width += extraWindowWidth;
				return size;
			}
		};

		DiceCard dicecardcontent = new DiceCard();
		dicepanel.add(dicecardcontent);

		JPanel potionspanel = new JPanel();

		// PotionCard potionspanelcontent = new PotionCard();
		// TODO create class PotionCard, same as DiceCard.

		tabbedPane.addTab(DICEPANEL, dicepanel);
		tabbedPane.addTab(POTIONSPANEL, potionspanel);

		pane.add(tabbedPane, BorderLayout.CENTER);

	};

	/**
	 * Create the GUI and show it. For thread safety, this method should be invoked
	 * from the event dispatch thread.
	 */
	private static void createAndShowGUI() {
		// Create and set up the window.
		JFrame frame = new JFrame("Dice Simulator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Create and set up the content pane.
		TabbedView demo = new TabbedView();
		demo.addComponentToPane(frame.getContentPane());

		// Display the window.
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		/* Use an appropriate Look and Feel */
		try {
			// UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch (UnsupportedLookAndFeelException ex) {
			ex.printStackTrace();
		} catch (IllegalAccessException ex) {
			ex.printStackTrace();
		} catch (InstantiationException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		/* Turn off metal's use of bold fonts */
		UIManager.put("swing.boldMetal", Boolean.FALSE);

		// Schedule a job for the event dispatch thread:
		// creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				createAndShowGUI();
			}
		});
	}
};