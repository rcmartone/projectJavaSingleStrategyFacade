package facade;

import facade.subsistema1_crm.CrmService;
import facade.subsistema2_cep.cepAPI;

public class Facade {
    
    public void migrarCliente(String name, String cep){

        String city = cepAPI.getInstancia().recuperarCidade(cep);
        String state = cepAPI.getInstancia().recuperarEstado(city);

        CrmService.gravarCliente(name, cep, city, state);
    }
}
