import java.util.Scanner;
public class LessonOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter voltage value");
		double voltage = sc.nextDouble();
		
		System.out.println("Enter current value");
		double current = sc.nextDouble();
		
		double resistance = voltage/current;
		System.out.println("Resistance =");
		System.out.println(resistance);
		
		

	}

}
