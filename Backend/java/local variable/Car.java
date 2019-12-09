
public class Car extends Vehicle {
	int cost=50000;
	void carDetails() {
		int cost=10000;
		System.out.println("Cost of car is " +cost);
		System.out.println("Cost of car is " +this.cost);
		System.out.println("Cost of car is " +super.cost);
	}

}
