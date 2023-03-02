import java.util.*;

class SomarDoisNum {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main (String args[]){
		//Declaracao de variaveis
		int num1, num2, soma;
		//Leituras
		System.out.println("Digite um numero");
		num1 = sc.nextInt();
		System.out.println("Digite outro number");
		num2 = sc.nextInt();
		//Somar
		soma = num1 + num2;
		//Mostrar na tela
		System.out.println("Soma:" + soma);
		
		}

	@Override
	public String toString() {
		return "SomarDoisNum []";
	}

	public static Scanner getSc() {
		return sc;
	}

	public static void setSc(Scanner sc) {
		SomarDoisNum.sc = sc;
	}
}

