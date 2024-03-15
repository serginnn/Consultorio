public class Medico extends Pessoa {
    private int crm;
    private String especialidade;

    public Medico(){
    }
    public Medico(String nome, char sexo, String endereco, String cpf, int telefone, int identidade, int crm, String especialidade){
        super(nome,sexo,endereco,cpf,telefone,identidade);
        this.crm=crm;
        this.especialidade=especialidade;
    }


    public int getCrm() {
        return crm;
    }
    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void ImprimirMedico(){
        System.out.println("Nome: "+ getNome()+", Sexo: "+getSexo()+", Endereço: "+getEndereco()+", CPF: "+getCpf()+", Telefone: "+getTelefone()+", Identidade: "+getIdentidade()+ ", Crm: "+ getCrm()+", Especialidade: "+ getEspecialidade());
    }

    
}
