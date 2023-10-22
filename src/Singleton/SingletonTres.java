package Singleton;

public class SingletonTres {

    private static class InstanceHolder {
		public static SingletonTres instancia = new SingletonTres();
	}
	
	private SingletonTres() {
		super();
	}
	
	public static SingletonTres getInstancia() {
		return InstanceHolder.instancia;
	}
    
}
