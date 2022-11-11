package bytebank_herdado;

public class Gerente extends Funcionario implements Autenticavel{
	/*private String nome;
	private String cpf;
	private double salario;*/

	private AutenticacaoUtil autenticador;
	public Gerente() {
		 autenticador = new AutenticacaoUtil();
	}
	
	public double getBonificacao() {
		return super.getSalario();
	}
	

	

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
	

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	 
	/*public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}*/
	
	
	
}
