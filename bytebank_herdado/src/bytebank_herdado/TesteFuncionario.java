package bytebank_herdado;

public class TesteFuncionario {

	public static void main(String[] args) {
		Gerente nico = new Gerente();
		nico.setNome("Nico steppat");
		nico.setCpf("222222222-2");
		nico.setSalario(2500.0);
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
	}

}
