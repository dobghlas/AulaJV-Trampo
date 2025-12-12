package curso;

import java.util.Scanner;

public class ExArrayFibonaci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor de N: ");
		int n = sc.nextInt();
		int a = 0; // primeiro termo
		int b = 1; // segundo termo
		int fib = 0; // variável para armazenar o resultado

		if (n == 1) {
			fib = 0;
		} else if (n == 2) {
			fib = 1;
		} else {
			for (int i = 3; i <= n; i++) {
				fib = a + b;
				a = b;
				b = fib;
			}
		}

		System.out.println("O %dº valor do termo da sequência de Fibonacci é: %d".formatted(n,fib));
	}

}
