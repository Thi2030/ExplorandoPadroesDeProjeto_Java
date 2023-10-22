package Facade;

import Facade_DadosCadastrais.DadosEndereco;
import Facade_DadosCadastrais.DadosPessoais;

public class CadastroCliente {

	public void migrarCliente(String nome, String cep) {
		String cidade = DadosEndereco.getInstancia().recuperarCidade(cep);
		String estado = DadosEndereco.getInstancia().recuperarEstado(cep);
		
		DadosPessoais.gravarDadosPessoais(nome, cep, cidade, estado);
	}
}
