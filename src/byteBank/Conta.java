package byteBank;

public class Conta {
	private int conta;	
	private double saldo;
	private int agencia;
	private int numero;	
	
public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
	}
	
	public void deposita (double valor) {
		this.saldo += valor;
	}
	public boolean saque(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor; 
			return true;
		}else {
			System.out.println("O saldo é insuficiente");
			return false;
		}
	}
	public boolean tranferir(double valor, Conta contaDestino) {
		if (this.saldo>= valor) {
			this.saldo -= valor;
			contaDestino.deposita(valor);
			return true;
		} else {
			System.out.println("Não foi possível tranferir!");
			return true;
		}
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public double getSaldo() {
		return saldo;
	}
	

	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
}