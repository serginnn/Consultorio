import java.util.ArrayList;
import java.util.List;
public class Consultorio {
    private List<Medico> listaMedicos = new ArrayList<>();
    private List<Paciente> listaPacientes = new ArrayList<>();
    private List<Consulta> listaConsultas = new ArrayList<>();
    private int contPaciente;
    private int telefoneCons;
    private String enderecoCons;
    private String nomeCons;

    public Consultorio(){
    }

    public Consultorio(String nomeCons, int telefoneCons, String enderecoCons) {
        this.nomeCons = nomeCons;
        this.telefoneCons = telefoneCons;
        this.enderecoCons = enderecoCons;
        this.listaMedicos = new ArrayList<>();
        this.listaPacientes = new ArrayList<>();
        this.listaConsultas = new ArrayList<>();
        this.contPaciente = 0;
    }

    public List<Medico> getListaMedicos() {
        return listaMedicos;
    }
    public void setListaMedicos(List<Medico> listaMedicos) {
        this.listaMedicos = listaMedicos;
    }
    
    public List<Paciente> getListaPacientes() {
        return listaPacientes;
    }
    public void setListaPacientes(List<Paciente> listaPacientes) {
        this.listaPacientes = listaPacientes;
    }
    
    public List<Consulta> getListaConsultas() {
        return listaConsultas;
    }
    public void setListaConsultas(List<Consulta> listaConsultas) {
        this.listaConsultas = listaConsultas;
    }
    
    public int getContPaciente() {
        return contPaciente;
    }
    public void setContPaciente(int contPaciente) {
        this.contPaciente = contPaciente;
    }
    
    public int getTelefoneCons() {
        return telefoneCons;
    }
    public void setTelefoneCons(int telefoneCons) {
        this.telefoneCons = telefoneCons;
    }
    
    public String getEnderecoCons() {
        return enderecoCons;
    }
    public void setEnderecoCons(String enderecoCons) {
        this.enderecoCons = enderecoCons;
    }
    
    public String getNomeCons() {
        return nomeCons;
    }
    public void setNomeCons(String nomeCons) {
        this.nomeCons = nomeCons;
    }

    
    public void cadastrarPaciente(Paciente p) {
        boolean aux = false;
    
        for (Paciente paciente : listaPacientes) {
            if (paciente.getCpf().equals(p.getCpf())) {
                aux = true;
                break; 
            }
        }
        if (aux) {
            System.out.println("Paciente já cadastrado ou com CPF igual a outro paciente");
        } else {
            listaPacientes.add(p);
        }
    }

     public void cadastrarMedico(Medico m) {
        boolean auxMedico = false;
        for(Medico medico : listaMedicos){
            if(medico.getCrm()== m.getCrm()){
                auxMedico= true;
                break;
            }
        }
        if(auxMedico){
            System.out.println("Medico ja cadastrado ou com CRM igual a outro medico");
        }
        else{
            listaMedicos.add(m);
        }
    }

    public void cadastrarConsulta(Consulta c, String cpfpaciente, int crmMedico) {
        boolean auxData = false;
        boolean auxHora = false;

        for(Consulta consulta : listaConsultas){
            if(consulta.getData().equals(c.getData()) && consulta.getHora().equals(c.getHora())){
                auxData= true;
                auxHora = true;
                break;
            }
        }
        if(auxData && auxHora){
            System.out.println("Consulta ja marcada nessa dia e horario");
        }else{
            for(Medico medico : listaMedicos){
                for(Paciente paciente : listaPacientes){
                if(medico.getCrm()==crmMedico && paciente.getCpf().equals(cpfpaciente)){
                    listaConsultas.add(c);
                    System.out.println("Consulta cadastrada com sucesso");
                }
                else{
                    System.out.println("Confira se o paciente ou o medico estão na lista");
                }
            }   
        }   
        }
    }

    public void removerPaciente(String cpf) {
        Paciente pacienteARemover = null;
         if(listaPacientes.isEmpty()){
            System.out.println("A lista está vazia, cadastre um paciente antes");
        }
        for (Paciente p : listaPacientes) {
        if (p.getCpf().equals(cpf)) {
            pacienteARemover = p;
            break; 
        }
        }
        if (pacienteARemover != null) {
        listaPacientes.remove(pacienteARemover);
        } else {
        throw  new ExcecaoPacienteInexistente();
        }
    }

    public void removerMedico(int crm) {
        Medico medicoARemover = null;
        if(listaMedicos.isEmpty()){
            System.out.println("A lista está vazia, cadastre um medico antes");
        }
        for(Medico m : listaMedicos){
        if(m.getCrm() == crm){
        medicoARemover=m;
        break;
        }
    }
        if(medicoARemover!= null){
            listaMedicos.remove(medicoARemover);
        }
        else{
            throw new ExcecaoMedicoInexistente();
        }
    }

    public void removerConsulta(String cpfPaciente, int crmMedico) {
        List<Consulta> consultasARemover = new ArrayList<>();
        if(listaConsultas.isEmpty()){
            System.out.println("A lista está vazia, cadastre uma consulta antes");
        }
        for(Consulta consulta : listaConsultas){
            if(consulta.getCpfPaciente().equals(cpfPaciente) && consulta.getCrmMedico()== crmMedico ){
                consultasARemover.add(consulta);
            }
        }
        if(!consultasARemover.isEmpty()){
            listaConsultas.removeAll(consultasARemover);
        }else{
            throw new ExcecaoConsultaInexistente(cpfPaciente, crmMedico);
        }
    }

    public void imprimirListaPacientes() {
        if(listaPacientes.isEmpty()){
            System.out.println("A lista está vazia, cadastre um paciente antes");
        }
        for (Paciente p : listaPacientes) {
            System.out.println("Nome: " + p.getNome() +", Sexo: "+p.getSexo()+", Endereço: "+p.getEndereco()+", CPF: " + p.getCpf()+", Telefone: "+p.getTelefone()+", Identidade: "+p.getIdentidade()+", Relato: "+p.getRelato()+", Medicação Consumida: "+p.getMedicacaoConsumida());
        }
    }

    public void imprimirListaMedicos() {
        if(listaMedicos.isEmpty()){
            System.out.println("A lista está vazia, cadastre um medico antes");
        }
        for (Medico m : listaMedicos) {
            System.out.println("Nome: " + m.getNome() +", Sexo: "+m.getSexo()+", Endereço: "+m.getEndereco()+", Cpf: "+m.getCpf()+", Telefone: "+m.getTelefone()+", Identidade: "+m.getIdentidade()+ ", CRM: " + m.getCrm()+", Especialidade: "+m.getEspecialidade());
        }
    }

    public void imprimirListaConsultas() {
        if(listaConsultas.isEmpty()){
            System.out.println("A lista está vazia, cadastre uma consulta antes");
        }
        for (Consulta c : listaConsultas) {
            System.out.println("Data: " + c.getData()+ ", Hora: " +c.getHora() + ", CPF Paciente: " + c.getCpfPaciente()+ ", CRM Médico: " + c.getCrmMedico());
        }
    }

    public void imprimirConsultaEspecifica(String data, String hora){
        if(listaConsultas.isEmpty() || listaMedicos.isEmpty() || listaPacientes.isEmpty()){
            System.out.println("Alguma lista está vazia, verifique se você preencheu a consulta, o medico e o paciente");
        }
        for( Consulta c : listaConsultas){
            if(c.getData().equals(data) && c.getHora().equals(hora)){
                System.out.println("Data: " + c.getData()+ ", Hora: " +c.getHora() + ", CPF Paciente: " + c.getCpfPaciente()+ ", CRM Médico: " + c.getCrmMedico());
                for(Paciente p :listaPacientes){
                    if(c.getCpfPaciente().equals(p.getCpf())){
                        System.out.println("Nome Paciente: "+p.getNome());
                    }
                    else{
                        System.out.println("Paciente não encontrado para essa consulta");
                    }
                }
                for(Medico m : listaMedicos){
                    if(c.getCrmMedico()==(m.getCrm())){
                        System.out.println("Nome Medico: "+m.getNome());
                    }
                    else{
                        System.out.println("Medico não encontrado para essa consulta");
                    }
                }
            }
            else{
                System.out.println("Consulta não encontrada!");
            }
        }

    }

}
