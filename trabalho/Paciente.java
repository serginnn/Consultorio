public class Paciente extends Pessoa {
    private String relato;
    private String medicacaoConsumida;

    public Paciente(){
    }

    public Paciente(String nome, char sexo, String endereco, String cpf, int telefone, int identidade, String relato, String medicacaoConsumida){
        super(nome,sexo,endereco, cpf, telefone, identidade);
        this.relato=relato;
        this.medicacaoConsumida=medicacaoConsumida;
    }


    public String getRelato() {
        return relato;
    }
    public void setRelato(String relato) {
        this.relato = relato;
    }
    
    public String getMedicacaoConsumida() {
        return medicacaoConsumida;
    }
    public void setMedicacaoConsumida(String medicacaoConsumida) {
        this.medicacaoConsumida = medicacaoConsumida;
    }

    public void ImprimirPaciente(){
        System.out.println("Nome: "+ getNome()+", Sexo: "+getSexo()+", Endereço: "+getEndereco()+", CPF: "+getCpf()+", Telefone: "+getTelefone()+", Identidade: "+getIdentidade()+", Relato: "+getRelato()+", Medicação Consumida: "+getMedicacaoConsumida());
    }
    

    
}
