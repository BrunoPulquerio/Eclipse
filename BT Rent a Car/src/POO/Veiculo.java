package POO;

public class Veiculo {

	public String marca;
	private String modelo;
	private String placa;
	private float valorAluguel;
	private boolean statusLocacao;
	
	public String carroWithCliente;

	public void dadosVeicular() {
		
		System.out.println("Marca " + marca + " e modelo " + modelo + " de Placa: " + placa);
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

	public String getCarroWithCliente() {
		return carroWithCliente;
	}

	public void setCarroWithCliente(String carroWithCliente) {
		this.carroWithCliente = carroWithCliente;
	}

}
