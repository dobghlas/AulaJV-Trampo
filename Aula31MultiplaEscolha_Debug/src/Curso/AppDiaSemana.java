package Curso;

public class AppDiaSemana {

	public static void main(String[] args) {
		int dia = 5;
		String diaString;

		switch (dia) {
		case 1: {
			diaString = "Segunda";
			break;
		}
		case 2: {
			diaString = "Terça";
			break;
		}
		case 3: {
			diaString = "Quarta";
			break;
		}
		case 4: {
			diaString = "Quinta";
			break;
		}
		case 5: {
			diaString = "Sexta";
			break;
		}
		case 6: {
			diaString = "Sabado";
			break;
		}
		case 7: {
			diaString = "Domingo";
			break;
		}
		default: {
			diaString = "Invalido";
			break;
		}

		}
		System.out.println(": " + diaString);

	}

}
