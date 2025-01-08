import java.util.Scanner;
public class ConvertIntoMiles{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter kilometers: ");
		float km = sc.nextFloat();
		sc.close();
		Double miles = km * 0.621371;
		System.out.println("miles: " + miles);
	}
}