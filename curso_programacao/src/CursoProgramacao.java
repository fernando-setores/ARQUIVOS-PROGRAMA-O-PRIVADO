import java.util.Scanner;

public class CursoProgramacao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o numero A: ");

		int A = sc.nextInt();

		System.out.print("Insira o numero B: ");

		int B = sc.nextInt();

		System.out.print("Insira o numero B: ");

		int C = sc.nextInt();

		if (A < B && A < C) {

			System.out.print("O MENOR É " + A);

		} else if (B < A && B < C) {

		    System.out.println("O MENOR É " +B);
		
		}else if (C < A && C < B) {
		
			System.out.println("O MENOR É " + C);
			
		}
		
		sc.close();
		}

		
	}
