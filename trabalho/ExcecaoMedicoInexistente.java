public class ExcecaoMedicoInexistente extends RuntimeException {
    public ExcecaoMedicoInexistente(){
        super("Impossivel remover medico. CRM nao existe ");
    }
    
}
