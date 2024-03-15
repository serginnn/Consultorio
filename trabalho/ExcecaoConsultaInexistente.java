public class ExcecaoConsultaInexistente extends RuntimeException {
    public ExcecaoConsultaInexistente(String cpf, int crm){
        super("Impossível remover Consulta. Paciente CPF: "+cpf + " não tem consulta agendada com o Medico CRM: "+ crm);
    }
}
