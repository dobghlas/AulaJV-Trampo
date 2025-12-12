package curso;

import java.util.Locale;
import java.util.Scanner;

public class ExLaço_while_Dobro {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner user = new Scanner(System.in);
		System.out.print("digite o primeiro valor: ");
		int num = Integer.parseInt(user.nextLine());
		while (num != 0) {
			System.out.println(Math.pow(num, 2));
			System.out.print("Digite o proximo valor: ");
			num=user.nextInt();
		}
		System.out.println("FIM!");

	}

}
