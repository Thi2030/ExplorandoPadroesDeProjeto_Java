package Facade_DadosCadastrais;

public class DadosEndereco {

	private static DadosEndereco instancia = new DadosEndereco();

	private DadosEndereco() {
		super();
	}

	public static DadosEndereco getInstancia() {
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "R. Cel. Rodovalho, 290 - Penha de França, São Paulo - SP";
	}
	
	public String recuperarEstado(String cep) {
		return "SP";
	}
}
