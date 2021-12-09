package byteBank;

public class main {
	public static void main(String[] args) {
		
		Funcionario g1 = new Gerente();
		g1.setCpf("235");
		g1.setSalario(5000);
		System.out.println(g1.autentica(201));
		System.out.println(g1.getBonificacao());
	}
}
