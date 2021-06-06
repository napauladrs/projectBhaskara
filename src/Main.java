import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de a: ");
		double a = sc.nextDouble();
		
		System.out.println("Digite o valor de b: ");
		double b = sc.nextDouble();
		
		System.out.println("Digite o valor de c: ");
		double c = sc.nextDouble();
		
		double delta = (Math.pow(b, 2)) - (4.0 * a * c);
		
		
		if (a == 0 || delta < 0.0) {
			System.out.println("Impossivel calcular");
		} else {
			double r1 = (-b + Math.sqrt(delta)) / (2.0 * a);
			double r2 = (-b - Math.sqrt(delta)) / (2.0 * a);
			
			System.out.printf("R1 = %.5f%n", r1);
			System.out.printf("R2 = %.5f%n", r2);
		}
		
		sc.close();
	}

}
