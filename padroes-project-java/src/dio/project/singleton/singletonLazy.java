package singleton;


/** 
 *  Singleton 'Preguiçoso'.
 * 
 *  @author Rafael Martone
 * 
*/

public class singletonLazy {
    private static singletonLazy instancia;

    private singletonLazy(){
        super();
    }

    public static singletonLazy getInstancia(){
       if (instancia == null) {
        instancia = new singletonLazy();
       }
        return instancia;
    }
}
