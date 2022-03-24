package teste1;

import java.util.Scanner;

public class teste5{
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double f, c, m;
		
		System.out.printf("Entre com a temperatura em celsius: ");
		c = ler.nextInt();
		
		m = 1.8;
		
		f =  c * m + 32;
		
		System.out.printf("A temperatura em farenhaits é: %f", f);
				
	}
}