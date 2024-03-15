import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        Medico m = null;
        Consultorio consultorio = new Consultorio();
        Paciente p = null;
        Consulta c = null;
        excecoes ex = new excecoes();
        char sexo;

        do {
            System.out.println("-----MENU-----");
            System.out.println("1-Cadastrar Medico");
            System.out.println("2-Cadastrar Paciente");
            System.out.println("3-Cadastrar Consulta");
            System.out.println("4-Imprimir Dados do Medico");
            System.out.println("5-Imprimir Consultas");
            System.out.println("6-Imprimir Dados do Paciente");
            System.out.println("7-Imprimir data, hora, paciente, medico de uma consulta");
            System.out.println("8-Remover Medico");
            System.out.println("9-Remover Paciente");
            System.out.println("10-Remover Consulta");
            System.out.println("0-Sair");

            x = sc.nextInt();
            sc.nextLine();

            switch (x) {
                case 1:
                    System.out.println("Nome: ");
                    String nome = sc.nextLine();

                    while (true) {
                        System.out.println("Sexo: ");
                        sexo = sc.next().charAt(0);
                        sc.nextLine();

                        try {
                            ex.sexoexcecao(sexo);
                            break;
                        } catch (ExcecaoSexoInvalido exe) {
                            System.out.println("Ocorreu uma exceção! Tente novamente!"+exe.getMessage());

                        }
                    }

                    System.out.println("Endereço: ");
                    String endereco = sc.nextLine();

                    System.out.println("Cpf: ");
                    String cpf = sc.nextLine();

                    System.out.println("Telefone: ");
                    int telefone = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Identidade: ");
                    int identidade = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Crm: ");
                    int crm = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Especialidade: ");
                    String especialidade = sc.nextLine();

                    m = new Medico(nome, sexo, endereco, cpf, telefone, identidade, crm, especialidade);
                    consultorio.cadastrarMedico(m);

                    break;
                case 2:
                    System.out.println("Nome: ");
                    nome = sc.nextLine();

                    while (true) {
                        System.out.println("Sexo: ");
                        sexo = sc.next().charAt(0);
                        sc.nextLine();

                        try {
                            ex.sexoexcecao(sexo);
                            break;
                        } catch (ExcecaoSexoInvalido exe) {
                            System.out.println("Ocorreu uma exceção! Tente novamente!"+exe.getMessage());

                        }
                    }

                    System.out.println("Endereço: ");
                    endereco = sc.nextLine();

                    System.out.println("Cpf: ");
                    cpf = sc.nextLine();

                    System.out.println("Telefone: ");
                    telefone = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Identidade: ");
                    identidade = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Relato: ");
                    String relato = sc.nextLine();

                    System.out.println("Medicação Consumida: ");
                    String medicacaoConsumida = sc.nextLine();

                    p = new Paciente(nome, sexo, endereco, cpf, telefone, identidade, relato, medicacaoConsumida);

                    consultorio.cadastrarPaciente(p);
                    break;
                case 3:
                    System.out.println("Data: ");
                    String data = sc.nextLine();

                    System.out.println("Hora: ");
                    String hora = sc.nextLine();

                    System.out.println("Cpf Paciente: ");
                    String cpfpaciente = sc.nextLine();

                    System.out.println("Crm Medico: ");
                    int crmMedico = sc.nextInt();
                    sc.nextLine();

                    c = new Consulta(data, hora, cpfpaciente, crmMedico);
                    consultorio.cadastrarConsulta(c, cpfpaciente, crmMedico);
                    break;
                case 4:
                    consultorio.imprimirListaMedicos();
                    break;
                case 5:
                    consultorio.imprimirListaConsultas();
                    break;
                case 6:
                    consultorio.imprimirListaPacientes();
                    break;
                case 7:
                    System.out.println("Data da consulta: ");
                    data = sc.nextLine();

                    System.out.println("Hora: ");
                    hora = sc.nextLine();

                    consultorio.imprimirConsultaEspecifica(data, hora);

                    break;
                case 8:
                    System.out.println("Digite o Crm do medico que deseja remover: ");
                    crmMedico = sc.nextInt();
                    sc.nextLine();
                    consultorio.removerMedico(crmMedico);
                    break;
                case 9:
                    System.out.println("Digite o Cpf do Paciente que deseja Remover: ");
                    cpfpaciente = sc.nextLine();
                    consultorio.removerPaciente(cpfpaciente);
                    break;
                case 10:
                    System.out.println("Digite o Cpf do Paciente que deseja Remover da Consulta: ");
                    cpfpaciente = sc.nextLine();
                    System.out.println("Digite o Crm do Medico da Consulta a ser Removida: ");
                    crmMedico = sc.nextInt();
                    sc.nextLine();
                    consultorio.removerConsulta(cpfpaciente, crmMedico);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção invalida!Tente novamente");
            }

        } while (x != 0);
        sc.close();
    }
}