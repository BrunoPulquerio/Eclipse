package POO;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de carros: ");
		int auxCont = input.nextInt();
		
		Veiculo [] carros = new Veiculo [auxCont];
		
		carros[0] = new Veiculo ();  
		carros[0].setMarca("Renault");
		carros[0].setModelo("KWID Zen 1.0");
		carros[0].setPlaca("QWI-3C93");
		carros[0].setValorAluguel(120);
		carros[0].setStatusLocacao(true);
		
		if(auxCont > 0) {
			
			for(int x = 0; x<=auxCont; x++) {
				
				System.out.println("Marca: ");
				String marca = input.nextLine();
				carros[x].setMarca(marca);
				
			}
			
		}
		else System.out.println("Nenhum carro adicionado!!!");
	
		for(int aux = 0; aux<=auxCont; aux++) {
			
			carros[aux].dadosVeicular();
			
		}


	}

}