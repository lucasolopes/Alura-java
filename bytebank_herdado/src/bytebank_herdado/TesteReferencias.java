package bytebank_herdado;

public class TesteReferencias {
	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		
		g1.setNome("Marcos");
		String nome = g1.getNome();
		g1.setSalario(5000);
		

		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500);
		
		Designer ds = new Designer();
		ds.setSalario(2500);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev);
		controle.registra(ds);
		
		
		System.out.println(controle.getSoma());
	}
}
