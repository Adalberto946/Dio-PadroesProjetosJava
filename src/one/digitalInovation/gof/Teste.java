package one.digitalInovation.gof;

import one.digitalInovation.gof.facade.Facade;
import one.digitalInovation.gof.singleton.SingletonEager;
import one.digitalInovation.gof.singleton.SingletonLazy;
import one.digitalInovation.gof.singleton.SingletonLazyHolder;
import one.digitalInovation.gof.strategy.Comportamento;
import one.digitalInovation.gof.strategy.ComportamentoAgressivo;
import one.digitalInovation.gof.strategy.ComportamentoDefensivo;
import one.digitalInovation.gof.strategy.ComportamentoNormal;
import one.digitalInovation.gof.strategy.Robo;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Singleton
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);	
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);	
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);	
		
		// Strategy
		
		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();	
		Comportamento agressivo = new ComportamentoAgressivo();	
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		
		// Facade
		
		Facade facede = new Facade();
		facede.migrarCliente("Adalberto", "58401462");
		
	}

}
