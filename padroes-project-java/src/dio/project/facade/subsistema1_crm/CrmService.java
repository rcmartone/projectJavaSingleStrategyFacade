package facade.subsistema1_crm;

public class CrmService {

    private CrmService(){
        super();
    }

    public static void gravarCliente(String name, String cep, String city, String state){
     System.out.println("Cliente salvo no sistema de CRM!!");
     System.out.println("Nome: "+ name);
     System.out.println("CEP: " + cep);
     System.out.println("Cidade: " + city);
     System.out.println("Estado: " + state);


    }
}
