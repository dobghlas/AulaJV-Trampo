package curso;

public class ExempArray {

	public static void main(String[] args) {
		// DECLARAÇOES ARRAY
		
		 int[] pontos;
		pontos = new int[5];
		// declaraçao em unica linha
		int valores[] = new int[10];
		double[] notas = new double[5];
		double salarios[] = new double[5];

		// ATRIBUIR VALORES
		salarios[0] = 3250.0;
		salarios[1] = 680.23;
		salarios[2] = 6200;
		salarios[3] = 7658.32;
		salarios[4] = 925.01;
		
		double[] despesas= {32,68,15,69};
		int num [] = { 1, 2, 443, 4, 665, 6, 7, 8 };
		// Percorrendo o vetor
		for (int i = 0; i < num.length; i++) {
			System.out.println("Sequencia: "+num[i]);
		}
		for(int i=0;i<despesas.length;i++) {
			System.out.println("Despesa: "+despesas[i]);

		}
		
		
		
	}

}