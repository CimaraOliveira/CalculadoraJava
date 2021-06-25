package diretorio;

import java.util.Scanner;


public class calculadora {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
		int num1;
		int num2;
                int calcular=0;
		int resposta;
		 String respost2;
		
		System.out.println("Informe um valor: ");
		num1 = in.nextInt();
		System.out.println("Informe um valor: ");
		num2 = in.nextInt();
		System.out.println("\n");
		System.out.println("  1 - Somar\n" 
                                 + "  2 - Subtrair \n"
                                 + "  3 - Multiplicar \n"
                                 + "  4 - Dividir\n");
                System.out.println("Escolha Opcao: ");
		resposta = in.nextInt();
		
		System.out.println("Operação escohida");
		switch (resposta) {
		case 1:
			calcular = num1 + num2;
			System.out.println("soma");
			break;
			
		case 2:
			calcular = num1 - num2;
			System.out.println("subitração");
			break;
		
		case 3:
			calcular = num1 * num2;
                        System.out.println("multiplicação");
			
			break;
		
		case 4:
			calcular = num1 / num2;
			System.out.println("divisão");
			break;
					
                default :
			System.out.println("Operação finalizada.");
			break;}
                
                
                System.out.println("Resultado: "+ calcular);
                
			
		
		
        
	}
    
}

    

