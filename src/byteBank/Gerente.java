package byteBank;

public class Gerente extends Funcionario{
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public double getBonificacao() {
		return super.getBonificacao() + salario;
	}
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
} 
