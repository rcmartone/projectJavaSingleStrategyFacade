package singleton;
/** 
 *  Singleton 'detentor preguiçoso'.
 * 
 *  @author Rafael Martone
 * 
*/

public class singletonLazyHolder {

    //Tread Safe
   private static class instanciaHolder{
        public static singletonLazyHolder instancia = new singletonLazyHolder();
   }
    

    private singletonLazyHolder(){
        super();
    }

    public static singletonLazyHolder getInstancia(){
        return instanciaHolder.instancia;
    }
}