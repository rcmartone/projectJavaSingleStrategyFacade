package strategy.comportamentos;

public class ComportamentoAgressivo implements Comportamento {
    @Override
    public void mover() {
        System.out.println("Protocolo Agressivo Ativado!!!");
        System.out.println("O Robo está se movendo agressivamento, cuidado!!!");
    }
}
