package Strategy;

public class Pessoa {
	
	private Emocao emocao;

	public void setEmocao(Emocao emocao) {
		this.emocao = emocao;
	}
	
	public void expressar_se() {
		emocao.expressar_se();
	}
}
