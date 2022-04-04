package POO;

public class Locacao {
	
	private Veiculo V1;
	private Cliente C1;
	
	public void alugar(Veiculo carro1, Cliente cliente1){
		
		if(carro1.isStatusLocacao() == true) {
			
			this.V1 = carro1;
			this.C1 = cliente1;
			System.out.println("Veiculo " + carro1.getModelo() + " alugado para o cliente " + cliente1.getNome());
			
		} else {
			
			System.out.println("Locação indisponivel pois o veículo está indisponivel");
			this.V1 = null;
			this.C1 = null;
			
		}
		
	}
	
}