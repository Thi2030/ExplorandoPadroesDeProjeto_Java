package Singleton;


/**
 * Documentação:
 * 
 * Objetivo: Singleton "simples, com instanciamento no final".
 * 
 * @author Thi2030
 */
public class SingletonUm {

	private static SingletonUm instancia;
	
	private SingletonUm() {
		super();
	}
	
	public static SingletonUm getInstancia() {
		if (instancia == null) {
			instancia = new SingletonUm();
		}
		return instancia;
	}
}