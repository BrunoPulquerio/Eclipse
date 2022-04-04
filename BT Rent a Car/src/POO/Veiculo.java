package POO;

import java.util.Scanner;

public class Veiculo {

	private String marca;
	private String modelo;
	private String placa;
	private float valorAluguel;
	private boolean statusLocacao;
	private String clienteMotorista;
	
	public void entradaDadosVeiculo(){
		
		Scanner Entrada = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de carros que vc tem na sua frota: ");
		int nCarros = Entrada.nextInt();
		
		Veiculo [] carro = new Veiculo[nCarros];
		
		for(int x = 1; x<=nCarros; x++) {
			
			System.out.println("Digite a marca do " + x + "° veiculo: ");
		    String marca = Entrada.nextLine();
		    carro[x].setMarca(marca);
		    
		    System.out.println("Qual a modelo e a versão? ");
		    String modelo = Entrada.nextLine();
		    carro[x].setModelo(modelo);
		    
		    System.out.println("Digite a placa: ");
		    String placa = Entrada.nextLine();
		    carro[x].setPlaca(placa);
		    
		    System.out.println("Qual o valor da diaria? ");
		    float diaria = Entrada.nextFloat();
		    carro[x].setValorAluguel(diaria);
		    
		    System.out.println("Disponivel para locação? Sim ou Nao");
		    String carroDisponivel = Entrada.nextLine();
		    
		    	if(carroDisponivel == "Sim") {
		    		carro[x].setStatusLocacao(true);
		    	}
		    	else if(carroDisponivel == "Nao") {carro[x].setStatusLocacao(false);
		    	}
		    	else System.out.println("Erro, digite novamente!!!!"); 

		}
		
	}
	
	public void listaVeiculosALL() {
		
		System.out.println("Marca: " + marca + " e Modelo: " + modelo + " de Placa: " + placa);
		System.out.println("Valor da diaria: " + valorAluguel);
		
			if(statusLocacao == true) {
			System.out.println("O Veiculo está disponivel para locação");
			} 
			else System.out.println("O Veiculo NÃO está disponivel para locação");
	
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public float getValorAluguel() {
		return valorAluguel;
	}

	public void setValorAluguel(float valorAluguel) {
		this.valorAluguel = valorAluguel;
	}

	public boolean isStatusLocacao() {
		return statusLocacao;
	}

	public void setStatusLocacao(boolean statusLocacao) {
		this.statusLocacao = statusLocacao;
	}

	public String getClienteMotorista() {
		return clienteMotorista;
	}

	public void setClienteMotorista(String clienteMotorista) {
		this.clienteMotorista = clienteMotorista;
	}
	
	
}
