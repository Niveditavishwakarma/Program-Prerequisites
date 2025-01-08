import java.util.Scanner;
public class Average{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a: ");
		float a = sc.nextInt();
		System.out.println("Enter b: ");
		float b = sc.nextInt();
		System.out.println("Enter c: ");
		float c = sc.nextInt();
		sc.close();
		float average = (a+b+c)/3;
		System.out.println("Average: " + average);
	}
}