
public class Application {
	public static void main(String[] args){
	System.out.println("learning my own data type");
	
	House house1 = new House();
	house1.modelname = "Sonoma";
	house1.color = "grey";
	house1.numberofbedrooms = 4;
	house1.numberofbathrooms = 3;
	
	House house2 = new House();
	house2.modelname = "Richmond";
	house2.color = "white";
	house2.numberofbedrooms = 5;
	house2.numberofbathrooms = 3;
	
	System.out.println(house1.modelname + " house is  " + house1.color + " color, it has " + house1.numberofbedrooms + " bedrooms and " + house1.numberofbathrooms + " bathrooms." );
	
	System.out.println(house2.modelname + " house is  " + house2.color + " color, it has " + house2.numberofbedrooms + " bedrooms and " + house2.numberofbathrooms + " bathrooms." );

	

	
	
	
	}
	
}