
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		String x;
		double y;
		int z;
		double total;
		
		System.out.println("Digite um produto: ");
		x = sc.next();
		
		System.out.println("Digite o valor: ");
		y = sc.nextDouble();
		
		
		System.out.println("Digite a quantidade: ");
		z = sc.nextInt();
		
		total = y * z;
		
		System.out.printf("total = R$ %.2f", total);	
		
		sc.close();	 
		 
	}	

}
