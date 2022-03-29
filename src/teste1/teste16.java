package teste1;

import java.util.Scanner;

public class teste16 {

		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			
			double n1, n2, n3, a, b, c;
			
			System.out.printf("Digite o primeiro lado do triángulo: ");
			a = ler.nextDouble();
			
			System.out.printf("Digite o segundo lado do triángulo: ");
			b = ler.nextDouble();
			
			System.out.printf("Digite o terceiro lado do triángulo: ");
			c = ler.nextDouble();
			
			n1 = a * a;
			n2 = b * b;
			n3 = c * c;
			
			if (n1 +n2 == n3) 
				System.out.printf("É um triângulo retangulo");
				else if (n1 + n3 == n2) 
					System.out.printf("É um triângulo retangulo");
					else if (n2 + n3 == n1) 
						System.out.printf("É um triângulo retangulo");
						else 
							System.out.printf("Não é um triângulo retângulo");
		}
	}
