package one.digitalInovation.gof.singleton;

/*
 * Singleton "Pregui�oso sofisticado"
 * @Autor www.linkedin.com/in/agsilvamhm
 */

public class SingletonLazyHolder {
	
	private static class InstanceHolder {
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();	
	}

	
	private SingletonLazyHolder(){
		super();
	}
	
	public static SingletonLazyHolder getInstancia() {
		return InstanceHolder.instancia;
	}
}
