package one.digitalinnovation.gof.singleton;

/**
 * Singleton "pregui�oso".
 * 
 * @author falvojr
 */
public class SingletonLazy {

	private static SingletonLazy instancia;
	
	private SingletonLazy() {
		super();
	}
	/*Acrescentado o synchronized para evitar a sincronização excessiva*/
	public static SingletonLazy getInstancia() {
		if(instancia == null) {
			synchronized (SingletonLazy.class) {
				if (instancia == null) {
					instancia = new SingletonLazy();
				}	

			}
		}
		return instancia;
	}
}
