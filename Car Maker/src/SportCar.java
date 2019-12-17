import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class SportCar extends Car
	{
		
		private static String colorChoosing;
		private static String sportcarName;
		private static String rimColor1;
		private static String engineType;
		private static boolean isManual1;
		
		public SportCar()
		{
			selectingCarAttributes();
			color = colorChoosing;
			name = sportcarName;
			rimColor = rimColor1;
			engineSize = engineType;
			manual = isManual1;
		}

		@Override
		public void drive()
			{
				System.out.println("This car likes to drive really fast");
				
			}
		
		public void race()
			{
				
				double laptime = (Math.random() * 5) + 10;
				System.out.println("This car just raced, and the lap time was " + OptionsForAuto.decFor.format(laptime) + " seconds!");
			}
		
		public static void selectingCarAttributes()
		{
			colorChoosing = (String)JOptionPane.showInputDialog(null, "What color would you like your SportCar?", "Color", JOptionPane.QUESTION_MESSAGE, null, OptionsForAuto.colors, OptionsForAuto.colors[0]);
			sportcarName = JOptionPane.showInputDialog("Every car has a name! What is yours?");
			rimColor1 = (String)JOptionPane.showInputDialog(null, "What color rims would you like to have?", "OOOh Fancy Rims!", JOptionPane.QUESTION_MESSAGE, null, OptionsForAuto.rimColors, OptionsForAuto.rimColors[0]);
			engineType = (String)JOptionPane.showInputDialog(null, "What size engine do you want?", "Enigne Selector", JOptionPane.QUESTION_MESSAGE, null, OptionsForAuto.carEngines, OptionsForAuto.carEngines[0]);
			
			int answerForManual = JOptionPane.showConfirmDialog(null, "Do you want your car in manual?", "Manual question", JOptionPane.YES_NO_OPTION);
			if (answerForManual == JOptionPane.YES_OPTION)
					isManual1 = true;
			else
				isManual1 = false;
				
		}
		
		
		
	}
