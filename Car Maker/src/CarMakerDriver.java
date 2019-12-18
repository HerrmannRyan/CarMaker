import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

public class CarMakerDriver
	{
		
		
		
		public static void main(String[] args) throws InterruptedException
			{
				Automobile automobileCustom = new Automobile() {
					public void drive()
					{}
				};
			
				String[] selections = {"Sportscar" , "SUV"};
			
				String customizedSelection = (String)JOptionPane.showInputDialog(null, "What would you like to customize?" , "Selection", JOptionPane.PLAIN_MESSAGE, null, selections, selections[0]);
				
				
				
				if (customizedSelection.equals("Sportscar"))
				{
					automobileCustom = new SportCar();
				}
				else if (customizedSelection.equals("SUV"))
				{
					automobileCustom = new SUV();
				}
				
				JOptionPane.showMessageDialog(null , "Your " + automobileCustom.typeOfAutomobile + "'s name is: " + automobileCustom.name 
						+ " \n The color of the rims are: " + ((Car)automobileCustom).rimColor
						+ " \n The engine size of the car is: " + ((Car)automobileCustom).engineSize
						+ " \n Manual: " + ((Car)automobileCustom).manual);
				
				
				
				int wantToDrive = JOptionPane.showConfirmDialog(null, "Would you like to drive this car?", "To drive or not to drive" , JOptionPane.YES_NO_OPTION);
				
				if (wantToDrive == JOptionPane.YES_OPTION && customizedSelection.equals("Sportscar"))
				{
					((SportCar)automobileCustom).drive();
					
					int wantToRace = JOptionPane.showConfirmDialog(null, "Now, would you like to race this car?", "To race or not to race", JOptionPane.YES_NO_OPTION);
					
					if (wantToRace == JOptionPane.YES_OPTION)
					{
						((SportCar)automobileCustom).race();
					}
					else
						exitSystem();
				}
				
				else if (wantToDrive == JOptionPane.YES_OPTION && customizedSelection.equals("SUV"))
				{
					((SUV)automobileCustom).drive();
					
					int wantToOffroad = JOptionPane.showConfirmDialog(null, "Would you like to take this car offroading?", "To offroad or not to offorad", JOptionPane.YES_NO_OPTION);
					
					if (wantToOffroad == JOptionPane.YES_OPTION)
					{
						((SUV)automobileCustom).offroadCar();
					}
					else
						exitSystem();
				}
				else
					exitSystem();
				
				exitSystem();
				
//				System.out.println("The color of the car is " + c.color);
//				System.out.println("The name of the car is " + c.name);
//				System.out.println("The color of the rims are " + c.rimColor);
//				System.out.println("The engine size is " + c.engineSize + " and for manual, it is " + c.manual + ".");
//				c.drive();
//				c.race();
				
				
			}
		
		private static void exitSystem() throws InterruptedException
		{
			JOptionPane.showMessageDialog(null, "Thank you!");
			TimeUnit.MILLISECONDS.sleep(2);
			System.exit(0);
		}

	}
	
