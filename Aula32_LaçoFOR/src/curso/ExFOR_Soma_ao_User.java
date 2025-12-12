package curso;

import java.util.Scanner;

public class ExFOR_Soma_ao_User {

	public static void main(String[] args) {
		Scanner use = new Scanner(System.in);
		System.out.print("Digite o ultimo valor da soma: ");
		int val = use.nextInt();
		int som = 0;
		for (int i = 1; i <= val; i++) {
			som += i;

		}
		System.out.println("SOMA: " + som);

	}

}
