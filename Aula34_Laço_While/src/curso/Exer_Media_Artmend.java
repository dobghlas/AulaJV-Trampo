package curso;

import java.util.Scanner;

public class Exer_Media_Artmend {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		int numAlunos = 3,numNotas = 2,alunoAtual = 1;

		while (alunoAtual <= numAlunos) {
			System.out.println("Aluno " + alunoAtual + ":");
			
			double somaNotas = 0;
			for (int notaAtual = 1; notaAtual <= numNotas; notaAtual++) {
				System.out.print("Digite a nota " + notaAtual + ": ");
				double nota = user.nextDouble();
				somaNotas += nota;
			}

			double media = somaNotas / numNotas;
			System.out.println("Média do aluno " + alunoAtual + ": " + media);
			alunoAtual++;
		}

		user.close();

	}
}
