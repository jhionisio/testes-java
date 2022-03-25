package teste1;

import java.util.Scanner;

public class teste15 {

	public static void main(String[] args) {
Scanner ler = new Scanner(System.in);
		
		int l1, l2, l3;
		
		System.out.printf("Digite o valor: ");
		l1 = ler.nextInt();
		
		System.out.printf("Digitea o valor: ");
		l2 = ler.nextInt();
		
		System.out.printf("Digitea o valor: ");
		l3 = ler.nextInt();
		
		if ((l1 + l2 > l3 ) && (l1 + l3 > l2) && (l3 + l2 > l1)) 
			if ((l1 == l2 ) || (l1 == l3 ) ||(l2 == l3))
				System.out.printf("isóceles.");
			else if ((l1 != l2) && (l1 != l3) && (l2 != l3))
				System.out.printf("escaleno.");
				else if ((l1 == l2) && (l1 == l3) && (l2 == l3))
					System.out.printf("equilatero");
	}
}
