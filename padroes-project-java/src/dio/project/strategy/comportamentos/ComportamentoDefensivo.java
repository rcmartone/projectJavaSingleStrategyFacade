package strategy.comportamentos;

public class ComportamentoDefensivo implements Comportamento {

	@Override
	public void mover() {
		System.out.println("Protocolo defensivo Ativado!!!");
        System.out.println("O Robo está se movendo defensivamente, cuidado!!!");
	}

}