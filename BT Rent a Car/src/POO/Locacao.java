package POO;

public class Locacao {
	
	private Veiculo vLocador;
	private Cliente locatario;
	
	public void alugar(Veiculo carro1, Cliente cliente1){
		
		if(carro1.isStatusLocacao() == true) {
			
			this.vLocador = carro1;
			this.locatario = cliente1;
			System.out.println("Veiculo " + carro1.getModelo() + " alugado para o cliente " + cliente1.getNome());
			
		} else {
			
			System.out.println("Loca��o indisponivel pois o ve�culo est� indisponivel");
			this.vLocador = null;
			this.locatario = null;
			
		}
		
	}
	
	public void devolverVeiculo(Veiculo carro1, Cliente cliente1) {
		
		//Wait
		
	}
	
}