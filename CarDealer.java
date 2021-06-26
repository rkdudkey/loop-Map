import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CarDealer {
	//2. You are a car dealer - create a hash map of vehicles:

	//The model is the Key, the make is the Value.

	//Ask the customer what car (model) they are looking for,

	//use the HashMap to determine if you have that vehicle, and what make it is.

	//(e.g., "Oh, you're looking for a Civic? Our Honda selection is right over here...")
	public static void main(String[] args) {
		HashMap<String, String> car = new HashMap<>();
		//model and make
		car.put("A3", "Audi");
		car.put("Altima", "Nissan");
		car.put("Civic", "Honda");
		car.put("CR-V", "Honda");
		car.put("MDX", "Acura");
		
		System.out.println("What car (Model) you are looking for? ");
		Scanner input = new Scanner(System.in);
		String model = input.next();
		
		for (Map.Entry<String, String> entry : car.entrySet()) {
			
			String key = entry.getKey();
			if(key.equals(model)) {
				String value = entry.getValue();
				System.out.println("Oh, you're looking for a "+ key + " Our " + value +  " selection is right over here...");
			}else {
				System.out.println("There is no data for the model you are looking for. ");
			}
				
		}
	
	}
}
