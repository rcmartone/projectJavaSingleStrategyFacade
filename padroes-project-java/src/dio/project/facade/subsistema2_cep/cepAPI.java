package facade.subsistema2_cep;

public class cepAPI {
    private static cepAPI instancia = new cepAPI();

    private cepAPI(){
        super();
    }

    public static cepAPI getInstancia(){
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "São Paulo";
    }

        public String recuperarEstado(String city){
        return "SP";
    }
}
