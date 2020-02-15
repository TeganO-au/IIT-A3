public class Constructor {

private int yearModel;
	private String make;
	private int speedometer;
//constructor for ASD

public Constructor (int yrModel, String vcMake)
{ 
	yearModel = yrModel;
    make = vcMake;
    speedometer = 0;
}

	public void setyearModel(int yrModel) {
		yearModel = yrModel;
	}

	public void setmake(String vcMake) {
		make = vcMake;
	}

	public void setspeedometer(int vcSpeed) {
		speedometer = vcSpeed;
	}

	public int getyearModel() {
		return yearModel;
	}
public String getmake() {
	return make;
    }
public int getSpeedometer() {
	return speedometer;
}
// This large bunch of codeblocks above are where the main blocks of code (see Artifact) would talk back to and store it's information. 

public void DeccelerateSpeed (int speedometer) {
	speedometer = speedometer - 10; 
	//initially this part would link up to the receiver or would link up to a live traffic system that would have constant updates to weather conditions or changed traffic conditions etc
	//Due to my lack of coding experience and knowledge, I cannot create that part of the code right now, this is just a skeleton of the code to work off. 
}
public void AccelerateSpeed (int speedometer) {
	speedometer = speedometer + 10;
}

}