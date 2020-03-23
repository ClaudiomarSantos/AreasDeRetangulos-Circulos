package aplicação;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Circulo;
import entidades.Figuras;
import entidades.Retangulo;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Figuras> fig = new ArrayList<>();

		System.out.println("Digite quantas formas deseja calcular a Área: ");
		int quant = sc.nextInt();

		for (int i = 0; i < quant; i++) {
			System.out.println("dados da forma " + (i + 1) + ": ");
			System.out.println("Retangulo ou Circulo? (r - Retengulo, c - Circulo)");
			char resp = sc.next().charAt(0);
			switch (resp) {
			case 'r':
				System.out.println("digite a cor: (BLACK,BLUE,RED)");
				sc.nextLine();
				String cor = sc.nextLine();
				System.out.println("Altura: ");
				double autura = sc.nextDouble();
				System.out.println("Base: ");
				double base = sc.nextDouble();
				Figuras figura = new Retangulo(entidades.Enum.Color.valueOf(cor), autura, base);
				fig.add(figura);
				break;

			case 'c':
				System.out.println("digite a cor: (BLACK,BLUE,RED)");
				sc.nextLine();
				cor = sc.nextLine();
				System.out.println("Raio: ");
				double raio = sc.nextDouble();
				figura = new Circulo(entidades.Enum.Color.valueOf(cor), raio);
				fig.add(figura);
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < fig.size(); i++) {
			sb.append(String.format("%.2f%n", fig.get(i).areas()));

		}
		System.out.printf("Areas das Figuras: \n" + sb.toString());
		sc.close();
	}
}
