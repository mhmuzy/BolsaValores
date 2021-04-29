package Hitss.Treinamento.Repositorio;

public class BolsaValoresRepositorio {
	
	public static void MostrarAtuacao() {
		
		String[] nome = new String[4];
		nome[1] = "Vale do Rio Doce";
		nome[2] = "Minalba";
		nome[3] = "Venâncio";
		
		double[] preco = new double[4];
		preco[1] = 100.00;
		preco[2] = 2000.00;
		preco[3] = 2000.00;
		
		System.out.println("");
		System.out.println("         Hitss Treinamento:");
		System.out.println("");
		System.out.println("--------------------------------------");
		System.out.println("");
		System.out.println("Resultado dos Processamentos");
		System.out.println("...");
		System.out.println("");
		System.out.println("Empresas com o Lucro Suerior a Mil Reais:");
		System.out.println("---------------------------------------------------");
		
		
		for (int i = 1; i < preco.length; i++) {
			if (preco[i] > 1000.00) {
				System.out.println(nome[i]);
			}
		}
	   System.out.println("---------------------------------------------------");
	   System.out.println("");
	   System.out.println("Empresas com o Lucro Inferior a 200 Reais:");
	   System.out.println("---------------------------------------------------");
	   for (int i = 1; i < preco.length; i++) {
			
	   if (preco[i] < 200.00) {
				System.out.println(nome[i]);
			}
		}
	   System.out.println("---------------------------------------------------");
		
	}
	   
}
