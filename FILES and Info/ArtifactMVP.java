import javax.swing.JOptionPane;

public class ArtifactMVP {
	public static void main(String[] args) {
		Constructor myVehicle = new Constructor (2006, "Holden Station Wagon"); //This would be the line of code that would be unique to the make and model of the vehicle it designed for
		int speedo = myVehicle.getSpeedometer(); //In this case, as this is purely for demo, I have already entered a 2006 Holden Commodore Station Wagon as our vehicle.
		
		speedo = Integer.parseInt(JOptionPane.showInputDialog("Current speed")); //This would be the line where the device would read the vehicles current speed via the installed interface
		for (int i = 0; i < 5; i++) {
			JOptionPane.showMessageDialog(null, + myVehicle.getyearModel() + " " + myVehicle.getmake() + " " + " - Current speed: ");

			myVehicle.AccelerateSpeed(speedo); //Here would be expanded to back to the constructor in order to read any live traffic updates, weather reports, speed limits for schools or residential areas and so forth
			String message = ("Speed increased to: " + speedo);//readout to enduser
		}

		speedo = Integer.parseInt(JOptionPane.showInputDialog("Current speed")); //Again, reads back to the installed interface
		for (int i = 0; i < 5; i++) {
			JOptionPane.showMessageDialog(null, + myVehicle.getyearModel() + " " + myVehicle.getmake() + " " + " - Current speed: ");

			myVehicle.DeccelerateSpeed(speedo);//Just like the accelerate speed codeblock, it would read for any changes in traffic conditions and if the enduser is entering into a reduced speed zone
			String message = ("Speed decreased to: " + speedo); //readout to enduser
		}
	}
}

//Developer note: This is a very rough MVP of the ASD.
//We will continue to add more to the main code to allow for more features, which would include expanding the constructor to read more reports, more accurate readout for when the vehicle is 
// within or outside city limits, roadworks/contruction, accidents etc







