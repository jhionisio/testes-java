package teste1;

import java.util.Scanner;

public class teste19 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double p1, p2, media;
		
		System.out.printf("Informe a nota da P1: ");
		p1 = ler.nextDouble();
		
		System.out.printf("Informe a nota da P2: ");
		p2 = ler.nextDouble();
		
		media = (((p2 * 2) + p1)/3);
		
		if (media > 5) 
			System.out.printf("Aprovado com m�dia de %.2f", media);
			else if (media < 5) 
			System.out.printf("Reprovado com m�dia de %.2f", media);
				else 
					System.out.printf("Voc� quase que n�o passa %.2f", media);
		

	}

}
