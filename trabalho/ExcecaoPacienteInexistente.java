public class ExcecaoPacienteInexistente extends RuntimeException {
        public ExcecaoPacienteInexistente(){
            super("Impossivel remover paciente. CPF não existe");
        }
}
