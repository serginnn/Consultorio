public class Consulta {
    private String data;
    private String hora;
    private String cpfPaciente;
    private int crmMedico;

    public Consulta(){
    }
    public Consulta(String data,String hora, String cpfpaciente, int crmMedico){
        this.data=data;
        this.hora=hora;
        this.cpfPaciente=cpfpaciente;
        this.crmMedico=crmMedico;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
   
    public String getCpfPaciente() {
        return cpfPaciente;
    }
    public void setCpfPaciente(String cpfPaciente) {
        this.cpfPaciente = cpfPaciente;
    }
    
    public int getCrmMedico() {
        return crmMedico;
    }
    public void setCrmMedico(int crmMedico) {
        this.crmMedico = crmMedico;
    }

    public void ImprimirConsulta(){
        System.out.println("Data"+ getData()+", Hora: "+getHora()+ ", Cpf Paciente: "+ getCpfPaciente()+", CRM Medico: "+getCrmMedico());
        
    }
    
}
