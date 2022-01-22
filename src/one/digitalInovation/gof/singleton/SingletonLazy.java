package one.digitalInovation.gof.singleton;

/*
 * Singleton "Preguiçoso"
 * @Autor www.linkedin.com/in/agsilvamhm
 */

public class SingletonLazy {
	
	private static SingletonLazy instancia;
	
	private SingletonLazy(){
		super();
	}
	
	public static SingletonLazy getInstancia() {
		if (instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}
}
