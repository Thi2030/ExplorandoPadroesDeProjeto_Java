package Facade_DadosCadastrais;

public class DadosPessoais {

	private DadosPessoais() {
		super();
	}
	
	public static void gravarDadosPessoais(String nome, String cep, String cidade, String estado) {
		System.out.println("Cliente cadastrado no sistema: ");
		System.out.println(nome);
		System.out.println(cep);
		System.out.println(cidade);
		System.out.println(estado);
	}
}
