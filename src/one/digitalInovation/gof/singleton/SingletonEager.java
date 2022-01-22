package one.digitalInovation.gof.singleton;

/*
 * Singleton "Apressado"
 * @Autor www.linkedin.com/in/agsilvamhm
 */

public class SingletonEager {
	
	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager(){
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}
}
