package exec9;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		int v = 1;

		for (int i = 0; i < vect.length; i++) {

			System.out.println("\nDados da " + v + "ª " + "pessoa!\n");
			System.out.print("Nome: ");
			String name = sc.next();

			System.out.print("Idade: ");
			int idade = sc.nextInt();

			System.out.print("Altura: ");
			double altura = sc.nextDouble();

			vect[i] = new Product(name, idade, altura);

			v += 1;
		}
		double sum = 0.0;
		int qtd = 0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getAltura();
			if (vect[i].getIdade() < 16) {
				qtd += 1;
			}
		}
	
		double media = sum / vect.length;
		int p = (qtd*100)/vect.length;
	
		System.out.println("Altura média = " + String.format("%.2f", media));
		System.out.println("Porcentagem de pessoas com menos de 16 anos = " + p + "%");
		System.out.println("Nome das pessoas com idade abaixo de 16: ");
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getIdade() < 16) {
				System.out.println(vect[i].getName());
			}
		}
		sc.close();
	}

}
