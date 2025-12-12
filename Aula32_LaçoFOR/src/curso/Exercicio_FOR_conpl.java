package curso;

public class Exercicio_FOR_conpl {

	public static void main(String[] args) {
		int s = 0, dividendo = 1;
		for (int divisor = 1; divisor <= 50; divisor++) {
			s = s + (dividendo / divisor);
			System.out.println(dividendo + "/" + divisor + "--" + s);
			dividendo = dividendo + 2;

		}
		System.out.println("soma final: " + s);
	}

}
