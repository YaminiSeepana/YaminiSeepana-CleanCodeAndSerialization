
public class TotalCost {

	public TotalCost(int choice, Double area) {
		long  cost;
		switch(choice) {
		case 1:
			cost=(long) (1200*area);
			System.out.println("the total cost is:"+ cost);
			break;
		case 2:
			cost=(long) (1500*area);
			System.out.println("the total cost is:"+ cost);
			break;
		case 3:
			cost=(long) (1800*area);
			System.out.println("the total cost is:"+ cost);
			break;
		case 4:
			cost=(long) (2500*area);
			System.out.println("the total cost is:"+ cost);
			break;
		default:
			System.out.println("invalid choice");
			new Cost();
		}
		
	}

}
