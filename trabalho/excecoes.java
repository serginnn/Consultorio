public class excecoes {
    public void sexoexcecao(char sexo){
        if(sexo !='M' && sexo !='F'){
            throw new ExcecaoSexoInvalido();
        }
    }



}
