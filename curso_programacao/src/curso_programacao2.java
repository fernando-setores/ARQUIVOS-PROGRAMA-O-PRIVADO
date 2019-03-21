import java.util.Locale;
import java.util.Scanner;

public class curso_programacao2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		
		double NotaFinal = nota1 + nota2;
		System.out.printf("NOTA FINAL = %.1f%n ", NotaFinal);
		
		if (NotaFinal < 60.0) {
			System.out.println("REPROVADO");
			
		sc.close();	
		}

	}

}
