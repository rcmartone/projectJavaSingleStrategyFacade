package strategy.comportamentos;


public class ComportamentoNormal implements Comportamento {

	@Override
	public void mover() {
		System.out.println("Protocolo normal Ativado!!!");
        System.out.println("O robo está se movendo normalmente!!");
	}

}