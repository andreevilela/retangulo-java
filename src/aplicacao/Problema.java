package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Problema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double largura, altura, area, perimetro;
		int opcao = 0;
		
		System.out.println("Digite a largura do retangulo: ");
		largura = sc.nextDouble();
		while (largura <= 0) {
			System.out.println("O valor deve ser positivo. Tente novamente: ");
			largura = sc.nextDouble();
		}
		
		System.out.println("Digite a altura do retangulo: ");
		altura = sc.nextDouble();
		while (altura <= 0) {
			System.out.println("O valor deve ser positivo. Tente novamente: ");
			altura = sc.nextDouble();
		}
		
		while (opcao < 3) {
			System.out.println();
			System.out.println("MENU:");
			System.out.println("1 - Mostrar area");
			System.out.println("2 - Mostrar perimetro");
			System.out.println("3 - Sair");
			System.out.println("Digite uma opcao: ");
			opcao = sc.nextInt();
			while (opcao > 3 || opcao < 1) {
				System.out.println();
				System.out.println("OPÇÃO INVALIDA");
				
				System.out.println();
				System.out.println("MENU:");
				System.out.println("1 - Mostrar area");
				System.out.println("2 - Mostrar perimetro");
				System.out.println("3 - Sair");
				System.out.println("Digite uma opcao: ");
				opcao = sc.nextInt();
			}
			
			System.out.println();
			
			if (opcao == 1) {
				area = largura * altura;
				System.out.println("AREA = " + area);
			} else if (opcao == 2) {
				perimetro = 2 *(largura + altura);
				System.out.println("PERIMETRO = " + perimetro);
			} else {
				System.out.println("FIM DO PROGRAMA!");
			}
			
		}
		
		sc.close();

	}

}
