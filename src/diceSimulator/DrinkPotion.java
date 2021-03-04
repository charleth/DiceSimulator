package diceSimulator;

/**
 * DrinkPotion drinkNormal = new DrinkPotion(" ", "*gulp*", 2, 4, 2);
 * potionselectLabel.setText(" " + drinkNormal.potionselectString);
 * gulp.setText(" " + drinkNormal.gulpString); drinkpotionlabel.setText(" " +
 * drinkNormal.drinkpotionString); potionResultLabel.setText(" " +
 * drinkNormal.potionResultString);
 *
 * DrinkPotion drinkGreater = new DrinkPotion(" greater ", "*gulp*", 4, 4, 4);
 * potionselectLabel.setText(" " + drinkGreater.potionselectString);
 * gulp.setText(" " + drinkGreater.gulpString); drinkpotionlabel.setText(" " +
 * drinkGreater.drinkpotionString); potionResultLabel.setText(" " +
 * drinkGreater.potionResultString);
 *
 * 
 * DrinkPotion drinkSuperior = new DrinkPotion(" superior ", "*gulp* *gulp*, 8,
 * 4, 8); potionselectLabel.setText(" " + drinkSuperior.potionselectString);
 * gulp.setText(" " + drinkSuperior.gulpString); drinkpotionlabel.setText(" " +
 * drinkSuperior.drinkpotionString); potionResultLabel.setText(" " +
 * drinkSuperior.potionResultString);
 *
 *
 * DrinkPotion drinkSupreme = new DrinkPotion(" supreme", "*gulp* *gulp*
 * *gulp*", 10, 4, 20); // potionselectLabel.setText(" " +
 * drinkSupreme.potionselectString); gulp.setText(" " +
 * drinkSupreme.gulpString); drinkpotionlabel.setText(" " +
 * drinkSupreme.drinkpotionString); potionResultLabel.setText(" " +
 * drinkSupreme.potionResultString); //
 */
//public class DrinkPotion {
//	String potionselectString = (" ");
//	String drinkpotionString = ("You drink a potion of" + potionselectString + " healing.");
//	String gulpString = (" ");
//	int amountPotionDice = 0;
//	int sidesPotionDice = 0;
//	int modifierPotionDice = 0;
//	int modresult = 0;
//	Random r;
//	String potionResultString = (" ");
//
//	public DrinkPotion(String ZpotionselectString, String ZgulpString, int ZamountPotionDice, int ZsidesPotionDice,
//			int ZmodifierPotionDice) {
//		this.potionselectString = ZpotionselectString;
//		this.gulpString = ZgulpString;
//		this.amountPotionDice = ZamountPotionDice;
//		this.sidesPotionDice = ZsidesPotionDice;
//		this.modifierPotionDice = ZmodifierPotionDice;
//		for (int i = 1; i <= ZamountPotionDice; i++) {
//			int low = 1;
//			int high = ZsidesPotionDice + 1;
//			int result = r.nextInt(high - low) + low;
//			modresult += result;
//		}
//		potionResultString = ("You heal for " + String.valueOf(modresult + modifierPotionDice) + " HP");
//
//	}
//
//}
