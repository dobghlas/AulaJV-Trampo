package curso;

import java.util.Scanner;

public class ExWhile_SomaDaSequenc {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		System.out.print("Digite o primeiro valor: ");
		int num = user.nextInt();
		int som = 0;
		while(num!=0) {
			som+=num;
			System.out.print("Digite outro valor: ");
			num=user.nextInt();
			
		}
		System.out.println("Soma final: "+ som);
		
	}

}
