

import singleton.singletonEager;
import singleton.singletonLazy;
import singleton.singletonLazyHolder;
import strategy.Robo;
import strategy.comportamentos.*;


public class teste {
    public static void main(String[] args) {
        //SINGLETON
        //LAZY
        singletonLazy lazy = singletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = singletonLazy.getInstancia();
        System.out.println(lazy);

        //Eager
        singletonEager eager = singletonEager.getInstancia();
        System.out.println(eager);
        eager = singletonEager.getInstancia();
        System.out.println(eager);

        //Lazy Holder
        singletonLazyHolder lazyHolder = singletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = singletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        //STRATEGY

        Comportamento normal = new ComportamentoNormal()
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
    }
}
