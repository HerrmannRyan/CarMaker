import javax.swing.JOptionPane;

public class SUV extends Car
{

	public SUV()
	{
		OptionsForAuto.selectingCarAttributes();
		
		color = OptionsForAuto.colorChoosing;
		name = OptionsForAuto.sportcarName;
		rimColor = OptionsForAuto.rimColor1;
		engineSize = OptionsForAuto.engineType;
		manual = false;
		typeOfAutomobile = "SUV";
		
	}
	
	@Override
	public void drive() 
	{
		JOptionPane.showMessageDialog(null,"The best part of this car is that it can drive offroad!");
		
	}
	
	public void offroadCar()
	{
		JOptionPane.showMessageDialog(null, "This car can handle anything offroad including snow, rocks, and mountain conditions");
	}

}
