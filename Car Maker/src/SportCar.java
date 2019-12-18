import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class SportCar extends Car
	{
		
		
		
		public SportCar()
		{
			OptionsForAuto.selectingCarAttributes();
			color = OptionsForAuto.colorChoosing;
			name = OptionsForAuto.sportcarName;
			rimColor = OptionsForAuto.rimColor1;
			engineSize = OptionsForAuto.engineType;
			manual = OptionsForAuto.isManual1;
			typeOfAutomobile = "Sportscar";
		}

		@Override
		public void drive()
			{
				JOptionPane.showMessageDialog(null, "This car likes to drive really fast");
				
			}
		
		public void race()
			{
				
				double laptime = (Math.random() * 5) + 10;
				JOptionPane.showMessageDialog(null,"This car just raced, and the lap time was " + OptionsForAuto.decFor.format(laptime) + " seconds!");
			}
		
		
		
		
		
	}
