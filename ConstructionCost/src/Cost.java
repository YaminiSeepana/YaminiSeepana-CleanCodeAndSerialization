import java.util.Scanner;

public class Cost {
public Cost(){
	Scanner sc=new Scanner(System.in);
	System.out.println("choose the quality of material:");
	System.out.println("1.Standard Material");
	System.out.println("2.Above Standard Material");
	System.out.println("3.High Standard Material");
	System.out.println("4.High Standard Material and Fully automated home");
	int choice=sc.nextInt();
	System.out.println("Enter the area of house:");
	Double area=sc.nextDouble();
	TotalCost total_area=new TotalCost(choice,area);
}
}
