import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class SportCar extends Car
	{
		
		private static String colorChoosing;
		
		public SportCar()
		{
			selectingCarAttributes();
			color = colorChoosing;
		}

		@Override
		public void drive()
			{
				System.out.println("This car likes to drive really fast");
				
			}
		
		public void race()
			{
				DecimalFormat decFor = new DecimalFormat("0.000");
				double laptime = (Math.random() * 5) + 10;
				System.out.println("This car just raced, and the lap time was " + decFor.format(laptime) + " seconds!");
			}
		
		public static void selectingCarAttributes()
		{
			colorChoosing = (String)JOptionPane.showInputDialog(null, "What color would you like your SportCar?", "Color", JOptionPane.QUESTION_MESSAGE, null, OptionsForAuto.colors, OptionsForAuto.colors[0]);
		}
		
		
		
	}
