package diceSimulator;

public class DiceSimulator {

	public static void main(String[] args) {
		new Window();
	}
}

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Random;
//
//class DiceSimulator {
//	// Get number of sides on each die
//	public static int getDiceSides() {
//		int sides = 0;
//
//		System.out.println("How many sides are on the die?");
//		try {
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//			sides = Integer.parseInt(br.readLine());
//		} catch (IOException exc) {
//			System.out.println("I/OException: " + exc);
//		}
//		return sides;
//	}
//
//	// Get total number of dice to roll
//	public static int getNumberOfDice() {
//		int dice = 0;
//
//		System.out.println("How many dice do you want to roll?");
//		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//			dice = Integer.parseInt(br.readLine());
//		} catch (IOException exc) {
//			System.out.println("I/OException: " + exc);
//		}
//
//		return dice;
//	}
//
//	// Roll total number of dice within range of sides.
//	public static int[] rollDice(int sides, int dice) {
//		int[] numbers = new int[dice];
//		Random rand = new Random();
//
//		for (int i = 0; i < dice; i++) {
//			numbers[i] = rand.nextInt(sides);
//		}
//
//		return numbers;
//	}
//
//	// Display output from rolling dice given sides and number of dice.
//	public static void main(String args[]) {
//		int sides = getDiceSides();
//		int dice = getNumberOfDice();
//
//		int[] numbers = rollDice(sides, dice);
//
//		System.out.print("Rolls: ");
//		for (int n : numbers) {
//			System.out.print(n + " ");
//		}
//	}
//}

//import java.util.Random;
//import java.util.Scanner;
//
//public class DiceSimulator {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//Random randomGenerator = new Random();
//int sides = 0;
//
//public Dice (int numberOfSides) {sides = numberOfSides;}
//
//	public int roll() {
//		int result = randomGenerator.nextInt(sides) + 1;
//		return result;
//	}Scanner;System.out.println("How many dice do you need?");
//
//	int howManyDice = in.nextInt();System.out.println("How many sides does each die have?");
//	int howManySiced = in.nextInt();loop[]for(
//	int x = 0;x<
//	howMany Dice;x++)
//	{
//		theDice[x] = new Dice(howManySides);
//		int result = theDice[x].roll();
//		System.out.println("Roll of dice #" + (1 + x) + ": " + result);
//	}

/*
 * Auswahl der Würfelseiten (2, 4, 6, 8, 10, 12, 20, 100) Auswahl der Menge der
 * Würfel (ggf sogar kombinierbar zb 2w8 + 1w6)
 * 
 * Bonus dazurechnen
 * 
 * explodierende Würfel: bei der höchsten Zahl neuwürfeln auf aufsummieren
 * 
 * WoD Wüfel: bei denen nur Erfolge gezählt werden (Würfel mit Ergebnis über X)
 * WoD Würfel Misserfolge (nur Einser) WoD Würfel: Hungerwürfel mit einbeziehen
 * Erst mal: d20 würfeln dann: auswählen welcher d gewürfelt werden soll dann:
 * mehrere Male den gleichen oder unterschiedliche Würfel werfen dann:
 * zusätzliche Werte auf einen Wurf drauf addieren dann: standard-dinge wie
 * potion of healing (minor, major, blabla)
 * 
 * dann: vampire - hunger-würfel oder nicht? Später: mit einer Datenbank
 * verbunden, in der jeder Spieler seine Werte eintragen kann und dan nnur ein
 * Stichwort eingibt und das dann selbstständig würfelt
 */
