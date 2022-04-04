package POO;

public class Cliente {

	private String nome;
	private double CPF;
	private String endereco; 
	private boolean statusCliente;
	private String carroCliente;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getCPF() {
		return CPF;
	}
	public void setCPF(double cPF) {
		CPF = cPF;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public boolean isStatusCliente() {
		return statusCliente;
	}
	public void setStatusCliente(boolean statusCliente) {
		this.statusCliente = statusCliente;
	}
	public String getCarroCliente() {
		return carroCliente;
	}
	public void setCarroCliente(String carroCliente) {
		this.carroCliente = carroCliente;
	}
	
	
}
