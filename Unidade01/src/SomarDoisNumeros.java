import java.util.*;

class SomarDoisNumeros {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main (String args[]) {
		// Declara��o de vari�veis
		int num1, num2, soma;
		
		// Leituras
		System.out.println("Digite um n�mero");
		num1 = sc.nextInt();
		System.out.println("Digite outro n�mero");
		num2 = sc.nextInt();
		
		// Somar
		soma = num1 + num2;
		
		// Mostrar na tela
		System.out.println("Soma: " + soma);
	}
	
	
}
