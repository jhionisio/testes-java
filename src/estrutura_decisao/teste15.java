package estrutura_decisao;

import java.util.Scanner;

public class teste15 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double l1, l2, l3;
		
		System.out.printf("Digite um lado: ");
		l1 = ler.nextInt();
		
		System.out.printf("Digite um lado: ");
		l2 = ler.nextInt();
		
		System.out.printf("Digite um lado: ");
		l3 = ler.nextInt();
		
		if ((l1 + l2 > l3) && (l1 + l3 > l2) && (l2 + l3 > l1))
			if ((l1 != l2) && (l1 != l3) && (l2 != l3))
				System.out.printf("Escaleno");
				else if ((l1 == l2) && (l1 != l3) || (l2 == l3) && (l2 != l1) || (l3 == l1) && (l3 != l2))
					System.out.printf("Equilatero");
				else
					System.out.printf("Isto não é um triângulo");
	}

}
