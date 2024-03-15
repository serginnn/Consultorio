public class Pessoa {
    private String nome;
    private char sexo;
    private String endereco;
    private String cpf;
    private int telefone;
    private int identidade;

    public Pessoa(){
    }
    public Pessoa(String nome, char sexo, String endereco, String cpf, int telefone, int identidade){
        this.nome=nome;
        this.sexo=sexo;
        this.endereco=endereco;
        this.cpf=cpf;
        this.telefone=telefone;
        this.identidade=identidade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    
    public int getIdentidade() {
        return identidade;
    }
    public void setIdentidade(int identidade) {
        this.identidade = identidade;
    }

    public void ImprimirPessoa(){
        System.out.println("Nome: "+ getNome()+", Sexo: "+getSexo()+", Endereço: "+getEndereco()+", CPF: "+getCpf()+", Telefone: "+getTelefone()+", Identidade: "+getIdentidade());
    }
    
}
