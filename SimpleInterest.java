import java.util.Scanner;
public class SimpleInterest{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principle: ");
		float principle = sc.nextFloat();
		System.out.println("Enter Rate: ");
		float rate = sc.nextFloat();
		System.out.println("Enter Time: ");
		int time = sc.nextInt();
		float SI = principle*rate*time/100;
		System.out.println("SI: " + SI);
	}
}