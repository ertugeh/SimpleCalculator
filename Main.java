import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		double op, o, t, a;
		
		System.out.println("###############################");
		System.out.println("#           M E N U           #");
		System.out.println("#                             #");
		System.out.println("#          1.Add              #");
		System.out.println("#          2.Subtract         #");
		System.out.println("#          3.Multiply         #");
		System.out.println("#          4.Divide           #");
		System.out.println("#                             #");
		System.out.println("#          5.Exit             #");
		System.out.println("#                             #");
		System.out.println("###############################");
		
		op = s.nextDouble();
		
		if(op == 1){
			
			System.out.println("Add");
			System.out.println("Enter first number");
			
			o = s.nextDouble();
			
			System.out.println("Enter second number");
			
			t = s.nextDouble();
			a = o + t;
			
			System.out.println("The answer is " + a);
			System.out.println("Press 5 to quit.");
			op = s.nextDouble();
	}
		
		if(op == 2) {
			
			System.out.println("Sub");
			System.out.println("Enter first number");
			
			o = s.nextDouble();
			
			System.out.println("Enter second number");
			
			t = s.nextDouble();
			a = o - t;
			
			System.out.println("The answer is " + a);
			
			System.out.println("Press 5 to quit.");
			op = s.nextDouble();
	}
			
		
		if(op == 3) {
			
			System.out.println("Multiply");
			System.out.println("Enter first number");
			
			o = s.nextDouble();
			
			System.out.println("Enter second number");
			
			t = s.nextDouble();
			a = o * t;
			
			System.out.println("The answer is " + a);
			System.out.println("Press 5 to quit.");
			op = s.nextDouble();
			
		}
		
		if(op == 4) {
			
			System.out.println("Divide");
			System.out.println("Enter first number");
			
			o = s.nextDouble();
			
			System.out.println("Enter second number");
			
			t = s.nextDouble();
			a = o / t;
			
			System.out.println("The answer is " + a);
			System.out.println("Press 5 to quit.");
			op = s.nextDouble();
			
		}if(op == 5){
			
			System.exit(0);
			
		}
		if(op > 5) {
			System.out.println("Invalid option");
		}
		
	}

}
