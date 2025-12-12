package curso;

import java.util.Locale;
import java.util.Scanner;

public class ExerArray {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner tec = new Scanner(System.in);
		int numAL;
		double [] notas = new double[2];
		double med = 0;

		for (numAL = 1; numAL <= 3; numAL++) {
			//System.out.println("Notas do %d° aluno: ".formatted(numAL));
			System.out.println("Notas do aluno: "+numAL);
			for (int i = 0; i < notas.length; i++) {
				//System.out.print("%d° nota: ".formatted(i));
				System.out.print("Nota: ");
				notas[i]=Double.parseDouble(tec.nextLine());
				med+=notas[i];
				//notas[i] = Double.parseDouble(tec.nextLine());
				//med += notas[i];
			}
			
			med = med / 2;
			//System.out.println("Media do aluno:".formatted(med));
			System.out.println("Media= "+med);
			med=0;
			
		}

	}

}
