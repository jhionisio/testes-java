package estrutura_decisao;

import java.util.Scanner;

public class teste18 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double a , vi, t, vlcmd, vl;
		
		System.out.printf("Digite a acelarção em metros por segundo: ");
			a = ler.nextDouble();
		
		System.out.printf("Digite a velocidade do começo em metros por segundo: ");
			vi = ler.nextDouble();
		
		System.out.printf("Digite o tempo em segundos: ");
			t = ler.nextDouble();
		
		vlcmd = vi + (a * t);
		
		vl = vlcmd * 3.6;
		
		if (vl <= 40) 
				System.out.printf("%.2f km/h, Veículo muito lento", vl);
			else if (vl <= 60)
				System.out.printf("%.2f km/h, Veículo na velocidade permitida", vl);
				else if (vl <= 80) 
					System.out.printf("%.2f km/h, Veículo na velocidade de cruzeiro", vl);
					else if (vl <= 120) 
						System.out.printf("%.2f km/h, Veículo rápido", vl);
						else if (vl > 120) 
							System.out.printf("%.2f km/h, Veículo muito rápido", vl);
		}

	}