import java.util.Scanner;

public class curso_programacao1 {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		int hora;
		
		System.out.print("Qual a hora? ");
		
		hora = sc.nextInt();
		
		if (hora <= 12) {
			
			System.out.print("Bom dia");
			
		}
		else if ((hora >= 12) && (hora < 19)) {
			
		    System.out.print("Boa tarde"); 
		
		}	
	    else if ((hora >= 19) && (hora < 24)) {
	    	
	    	System.out.print("Boa noite");
	    	
	    }	
	    else if (hora > 23) {
	    
	    	System.out.print("Essa hora não existe! Somente 00 ou 23");
	    	
	    }
		
		sc.close();
    }

}
