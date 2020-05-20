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
		
		System.out.println("Digite a largura do retangulo:");
		largura = sc.nextDouble();
		while (largura <= 0) {
			System.out.println("O valor deve ser positivo. Tente novamente:");
			largura = sc.nextDouble();
		}
		
		System.out.println("Digite a altura do retangulo:");
		altura = sc.nextDouble();
		while (altura <= 0) {
			System.out.println("O valor deve ser positivo. Tente novamente:");
			altura = sc.nextDouble();
		}
		
		sc.close();

	}

}
