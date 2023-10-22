package Singleton;

public class SingletonDois {

    private static SingletonDois instancia;
	
	private SingletonDois() {
		super();
	}
	
	public static SingletonDois getInstancia() {
		if (instancia == null) {
			instancia = new SingletonDois();
		}
		return instancia;
	}
    
}
