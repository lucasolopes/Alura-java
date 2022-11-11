package bytebank_herdado;

public class EditorVideo extends Funcionario {
	public double getBonificacao() {
		System.out.println("Chamando metodo de boni do editor");
		return 150;
	}
}
