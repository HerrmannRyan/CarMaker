import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class OptionsForAuto
	{
		//easy decimal formatter
		static DecimalFormat decFor = new DecimalFormat("0.000");
	
		// The arrays to choose from
		static String[] colors = {"Black", "Red", "Blue", "White", "Gray", "Silver"};
		static String[] rimColors = {"Black", "Grey", "White", "Silver", "Chrome"}; 
		static String[] carEngines = {"4 Cylinder", "6 Cylinder", "8 Cylinder", "10 Cylinder"};
		
		//The placer VVVVVVVVVVVVVVV
		static String colorChoosing;
		static String sportcarName;
		static String rimColor1;
		static String engineType;
		static boolean isManual1;
		
		public static void selectingCarAttributes()
		{
			colorChoosing = (String)JOptionPane.showInputDialog(null, "What color would you like your car?", "Color", JOptionPane.QUESTION_MESSAGE, null, OptionsForAuto.colors, OptionsForAuto.colors[0]);
			sportcarName = JOptionPane.showInputDialog("Every car has a name! What is yours?");
			rimColor1 = (String)JOptionPane.showInputDialog(null, "What color rims would you like to have?", "OOOh Fancy Rims!", JOptionPane.QUESTION_MESSAGE, null, OptionsForAuto.rimColors, OptionsForAuto.rimColors[0]);
			engineType = (String)JOptionPane.showInputDialog(null, "What size engine do you want?", "Enigne Selector", JOptionPane.QUESTION_MESSAGE, null, OptionsForAuto.carEngines, OptionsForAuto.carEngines[0]);
			
			int answerForManual = JOptionPane.showConfirmDialog(null, "Do you want your car in manual? \n *Side note: SUVs will be automatic regardless", "Manual question", JOptionPane.YES_NO_OPTION);
			if (answerForManual == JOptionPane.YES_OPTION)
					isManual1 = true;
			else
				isManual1 = false;
				
		}
		
	}
